package travel.caddy.launcher.fragments;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.app.ListFragment;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import travel.caddy.launcher.Helpers.Settings;
import travel.caddy.launcher.R;

import travel.caddy.launcher.adapters.AdapterLauncherGrid;
import travel.caddy.launcher.datalayer.Loaders.SQLiteLoader;
import travel.caddy.launcher.datalayer.models.sqlitetables.Cities;
import travel.caddy.launcher.fragments.dummy.DummyContent;

/**
 * A fragment representing a list of Items.
 * <p />
 * <p />
 * Activities containing this fragment MUST implement the {@link Callbacks}
 * interface.
 */
public class FragmentLauncherGrid extends ListFragment implements LoaderManager.LoaderCallbacks<Cursor> {

    private static final int LOADER_ID_FOR_LAUNCHER_GRID_DATA = 0;
    // This is the Adapter being used to display the list's data.
    SimpleCursorAdapter _adapter;

    private OnFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FragmentLauncherGrid() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // TODO: Change Adapter to display your content
        setListAdapter(new ArrayAdapter<DummyContent.DummyItem>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, DummyContent.ITEMS));
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if (null != mListener) {
            // Notify the active callbacks interface (the activity, if the
            // fragment is attached to one) that an item has been selected.
            mListener.onFragmentInteraction(DummyContent.ITEMS.get(position).id);
        }
    }

    //region "Data Loading through Loaders"

    /*
    Called when the fragment's activity has been created and this fragment's view hierarchy instantiated.
    It can be used to do final initialization once these pieces are in place, such as retrieving views or restoring state.
    It is also useful for fragments that use setRetainInstance(boolean) to retain their instance,
    as this callback tells the fragment when it is fully associated with the new activity instance.
    This is called after onCreateView(LayoutInflater, ViewGroup, Bundle) and before onViewStateRestored(Bundle).
    * */
    @Override
    public void onActivityCreated (Bundle savedInstanceState){

        // The desired columns to be bound
        String[] fromDBColumns = new String[] {
                Cities.COLUMN_CITYID,
                Cities.COLUMN_CITYNAME,
                Cities.COLUMN_NORMALIZEDCOUNTRY,
                Cities.COLUMN_CONTINENT
        };

        // the XML defined views which the data will be bound to
        int[] toViewFields = new int[] {
                R.id.cityId,
                R.id.name,
                R.id.country,
                R.id.continent,
        };

        // Create an empty adapter we will use to display the loaded data.
        _adapter = new SimpleCursorAdapter(getActivity(),
                R.layout.city_info, null,
                fromDBColumns,
                toViewFields, 0);
        setListAdapter(_adapter);

        // Start out with a progress indicator.
        setListShown(false);

        // Prepare the loader.  Either re-connect with an existing one,
        // or start a new one.
        /*
        Parameters
            id	        A unique identifier for this loader. Can be whatever you want. Identifiers are scoped to a particular LoaderManager instance.
            args	    Optional arguments to supply to the loader at construction. If a loader already exists (a new one does not need to be created), this parameter will be ignored and the last arguments continue to be used.
            callback	Interface the LoaderManager will call to report about changes in the state of the loader. Required.
        */
        Bundle args = new Bundle();

        args.putString(Settings.KEY_TABLE, Cities.TABLE_NAME);
/*        args.putBoolean(Settings.KEY_DISTINCT, false);
        args.putString(Settings.KEY_WHERECLAUSE,namevalue);
        args.putString(Settings.KEY_SELECTIONARGS,namevalue);
        args.putString(Settings.KEY_GROUPBY,namevalue);
        args.putString(Settings.KEY_SORTORDER,namevalue);
        args.putString(Settings.KEY_LIMIT,variablename);*/

        getLoaderManager().initLoader(LOADER_ID_FOR_LAUNCHER_GRID_DATA, args, this);
    }

    //endregion

    //region <LoaderCallbacks> interface implementations

    @Override
    public Loader<Cursor> onCreateLoader(int loaderId, Bundle bundle) {

        if (bundle != null) {
            String tableName = bundle.getString(Settings.KEY_TABLE);
            boolean distinct = bundle.getBoolean(Settings.KEY_DISTINCT);
            String[] columns = bundle.getStringArray(Settings.KEY_COLUMNS);
            String whereClause = bundle.getString(Settings.KEY_WHERECLAUSE);
            String[] selectionArgs = bundle.getStringArray(Settings.KEY_WHERECLAUSEARGS);
            String groupBy = bundle.getString(Settings.KEY_GROUPBY);
            String havingClause = bundle.getString(Settings.KEY_HAVINGCLUASE);
            String sortOrder = bundle.getString(Settings.KEY_SORTORDER);
            String limit = bundle.getString(Settings.KEY_LIMIT);

            return new SQLiteLoader(getActivity(), distinct, tableName, columns, whereClause, selectionArgs, groupBy, havingClause, sortOrder, limit);
        }

        throw new RuntimeException("Missing arguments to SQLiteLoader in order to load data from database.");
    }

    @Override
    public void onLoadFinished(Loader<Cursor> cursorLoader, Cursor cursor) {
        // Swap the new cursor in.  (The framework will take care of closing the
        // old cursor once we return.)
        _adapter.swapCursor(cursor);

        // The list should now be shown.
        if (isResumed()) {
            setListShown(true);
        } else {
            setListShownNoAnimation(true);
        }
    }

    @Override
    public void onLoaderReset(Loader<Cursor> cursorLoader) {
        // This is called when the last Cursor provided to onLoadFinished()
        // above is about to be closed.  We need to make sure we are no
        // longer using it.
        _adapter.swapCursor(null);
    }
    //endregion

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

    /**
    * This interface must be implemented by activities that contain this
    * fragment to allow an interaction in this fragment to be communicated
    * to the activity and potentially other fragments contained in that
    * activity.
    * <p>
    * See the Android Training lesson <a href=
    * "http://developer.android.com/training/basics/fragments/communicating.html"
    * >Communicating with Other Fragments</a> for more information.
    */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(String id);
    }

}
