package travel.caddy.launcher.datalayer.CustomLoaders;

import android.content.Context;
import android.content.CursorLoader;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

import travel.caddy.launcher.datalayer.CaddySQLiteOpenHelper;

/**
 * Created by PrPatel on 9/29/2014.
 */
public class SQLiteLoader extends CursorLoader {

    String _table;
    String[] _columns;
    String _whereClause;
    String[] _selectionArgs;
    String _groupBy;
    String _havingClause;
    String _sortOrder;
    String _limit;

    //CancellationSignal mCancellationSignal;

    /**
     * Creates an empty unspecified CursorLoader.  You must follow this with
     * calls to {@link #setUri(Uri)}, {@link #setSelection(String)}, etc
     * to specify the query to perform.
     */
    /*public SQLiteLoader(Context context) {
        super(context);
    }*/

    public SQLiteLoader(android.content.Context context, boolean distinct, String table, java.lang.String[] columns, java.lang.String whereClause, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String havingClause, java.lang.String sortOrder, String limit, CancellationSignal cancellationSignal)
    {
        super(context);

        _table = table;
        _columns = columns;
        _whereClause = whereClause;
        _selectionArgs = selectionArgs;
        _groupBy = groupBy;
        _sortOrder = sortOrder;
        _limit = limit;
    }

    /* Runs on a worker thread */
    @Override
    public Cursor loadInBackground() {
/*
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            mCancellationSignal = new CancellationSignal();
        }
*/
        try {

            CaddySQLiteOpenHelper dbHelper = new CaddySQLiteOpenHelper(getContext());
            SQLiteDatabase database = dbHelper.getReadableDatabase();

            /*
                Both query() and rawQuery() return Cursor objects.
                It’s tempting to keep references to your Cursor objects and pass them around your application,
                but Cursor objects take many more system resources to keep around than a Plain Old Java Object (POJO).
                Because of this, Cursor objects should be unmarshaled into POJOs as soon as possible.
                After they are unmarshaled, you should call the close() method to free up the resources.

                We won't do this here because we want to use our SQLiteLoader as part of Loader framework based on Cursor
                which takes care of managing and closing cursor
            */
            //public android.database.Cursor query(boolean distinct, java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy, java.lang.String limit, android.os.CancellationSignal cancellationSignal) { /* compiled code */ }

            Cursor cursor = database.query(_table, _columns, _whereClause, _selectionArgs, _groupBy, _havingClause, _sortOrder, _limit);

            /*Cursor cursor = getContext().getContentResolver().query(mUri, mProjection, mSelection,
                    mSelectionArgs, mSortOrder, mCancellationSignal);*/

            if (cursor != null) {
                try {
                    // Ensure the cursor window is filled.
                    cursor.getCount();
                    //cursor.registerContentObserver(mObserver);
                } catch (RuntimeException ex) {
                    cursor.close();
                    throw ex;
                }
            }
            return cursor;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Error opening table " + _table, e);
        } finally {
            /*synchronized (this) {
                mCancellationSignal = null;
            }*/
        }
    }

/*
    @Override
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();

        synchronized (this) {
            if (mCancellationSignal != null) {
                mCancellationSignal.cancel();
            }
        }
    }
*/

}
