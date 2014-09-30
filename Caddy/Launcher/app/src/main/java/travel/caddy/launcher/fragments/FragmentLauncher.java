package travel.caddy.launcher.fragments;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Loader;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import travel.caddy.launcher.Helpers.Settings;
import travel.caddy.launcher.R;
import travel.caddy.launcher.datalayer.CaddySQLiteOpenHelper;
import travel.caddy.launcher.datalayer.Loaders.SQLiteLoader;
import travel.caddy.launcher.datalayer.models.sqlitetables.Cities;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentLauncher.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentLauncher#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class FragmentLauncher extends Fragment implements LoaderManager.LoaderCallbacks<Cursor> {

    private static final int LOADER_ID_FOR_LAUNCHER_GRID_DATA = 0;

    private OnFragmentInteractionListener mListener;

    public FragmentLauncher() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_launcher, container, false);
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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

        if (getArguments() != null) {
            String tableName = getArguments().getString(Settings.KEY_TABLE);
            boolean distinct = getArguments().getBoolean(Settings.KEY_DISTINCT);
            String[] columns = getArguments().getStringArray(Settings.KEY_COLUMNS);
            String whereClause = getArguments().getString(Settings.KEY_WHERECLAUSE);
            String[] selectionArgs = getArguments().getStringArray(Settings.KEY_WHERECLAUSEARGS);
            String groupBy = getArguments().getString(Settings.KEY_GROUPBY);
            String havingClause = getArguments().getString(Settings.KEY_HAVINGCLUASE);
            String sortOrder = getArguments().getString(Settings.KEY_SORTORDER);
            String limit = getArguments().getString(Settings.KEY_LIMIT);

            return new SQLiteLoader(getActivity(), distinct, tableName, columns, whereClause, selectionArgs, groupBy, havingClause, sortOrder, limit);
        }

        throw new RuntimeException("Missing arguments to SQLiteLoader in order to load data from database.");
    }

    @Override
    public void onLoadFinished(Loader<Cursor> cursorLoader, Cursor cursor) {
        // Swap the new cursor in.  (The framework will take care of closing the
        // old cursor once we return.)
    }

    @Override
    public void onLoaderReset(Loader<Cursor> cursorLoader) {
        // This is called when the last Cursor provided to onLoadFinished()
        // above is about to be closed.  We need to make sure we are no
        // longer using it.
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

    /* Note by Priyank
        Instead use Otto - and event bus with Pub-Sub model :- http://square.github.io/otto/
        "To return data back to activity from fragment, activity has to implement fragment’s listener interface.
        Activity class can get bigger and bulky as many fragments are added to the same activity. Then there is runtime type casting, tight-coupling etc.
        Instead use Publisher - Bus - Subscriber (Bus architecture) where fragments, activities and Bus are loosely coupled through interfaces.
        Single line of register and unregister call instead of using LocalBroadcastReceiver of android way."
    */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
