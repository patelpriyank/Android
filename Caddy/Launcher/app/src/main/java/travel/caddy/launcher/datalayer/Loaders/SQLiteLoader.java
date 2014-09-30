package travel.caddy.launcher.datalayer.Loaders;

import android.content.AsyncTaskLoader;
import android.content.pm.PackageManager;
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
public class SQLiteLoader extends AsyncTaskLoader<Cursor> {

    boolean _distinct;
    String _table;
    String[] _columns;
    String _whereClause;
    String[] _selectionArgs;
    String _groupBy;
    String _havingClause;
    String _sortOrder;
    String _limit;

    Cursor mCursor;
    CancellationSignal mCancellationSignal;

    /**
     * Creates an empty unspecified CursorLoader.  You must follow this with
     * calls to {@link #setUri(Uri)}, {@link #setSelection(String)}, etc
     * to specify the query to perform.
     */
    /*public SQLiteLoader(Context context) {
        super(context);
    }*/

    public SQLiteLoader(android.content.Context context, boolean distinct, String table, java.lang.String[] columns, java.lang.String whereClause, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String havingClause, java.lang.String sortOrder, String limit)
    {
        super(context);

        _distinct = distinct;
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
        synchronized (this) {
            if (isLoadInBackgroundCanceled()) {
                throw new OperationCanceledException();
            }
            mCancellationSignal = new CancellationSignal();
        }
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

            Cursor cursor = database.query(_distinct, _table, _columns, _whereClause, _selectionArgs, _groupBy, _havingClause, _sortOrder, _limit, mCancellationSignal);

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
            synchronized (this) {
                mCancellationSignal = null;
            }
        }
    }

    @Override
    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();

        synchronized (this) {
            if (mCancellationSignal != null) {
                mCancellationSignal.cancel();
            }
        }
    }

    /* Runs on the UI thread */
    @Override
    public void deliverResult(Cursor cursor) {
        if (isReset()) {
            // An async query came in while the loader is stopped
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor oldCursor = mCursor;
        mCursor = cursor;
        if (isStarted()) {
            super.deliverResult(cursor);
        }
        if (oldCursor != null && oldCursor != cursor && !oldCursor.isClosed()) {
            oldCursor.close();
        }
    }

    /**
     * Starts an asynchronous load of the contacts list data. When the result is ready the callbacks
     * will be called on the UI thread. If a previous load has been completed and is still valid
     * the result may be passed to the callbacks immediately.
     *
     * Must be called from the UI thread
     */
    @Override
    protected void onStartLoading() {
        if (mCursor != null) {
            deliverResult(mCursor);
        }
        if (takeContentChanged() || mCursor == null) {
            forceLoad();
        }
    }
    /**
     * Must be called from the UI thread
     */
    @Override
    protected void onStopLoading() {
        // Attempt to cancel the current load task if possible.
        cancelLoad();
    }
    @Override
    public void onCanceled(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
    @Override
    protected void onReset() {
        super.onReset();

        // Ensure the loader is stopped
        onStopLoading();
        if (mCursor != null && !mCursor.isClosed()) {
            mCursor.close();
        }
        mCursor = null;
    }

    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);

        writer.print(prefix); writer.print("table="); writer.println(_table);
        writer.print(prefix); writer.print("columns="); writer.println(Arrays.toString(_columns));
        writer.print(prefix); writer.print("whereClause="); writer.println(_whereClause);
        writer.print(prefix); writer.print("selectionArgs="); writer.println(Arrays.toString(_selectionArgs));
        writer.print(prefix); writer.print("groupBy="); writer.println(_groupBy);
        writer.print(prefix); writer.print("havingClause="); writer.println(_havingClause);
        writer.print(prefix); writer.print("sortOrder="); writer.println(_sortOrder);
        writer.print(prefix); writer.print("limit="); writer.println(_limit);
    }
}
