package travel.caddy.launcher.datalayer.CustomLoaders;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by PrPatel on 9/29/2014.
 */
public interface IDataSource<T> {

    /*
    Parameters

        columns	        A list of which columns to return. Passing null will return all columns, which is discouraged to prevent reading data from storage that isn't going to be used.
        whereClause	    A filter declaring which rows to return, formatted as an SQL WHERE clause (excluding the WHERE itself). Passing null will return all rows for the given table.
        selectionArgs	You may include ?s in selection, which will be replaced by the values from selectionArgs, in order that they appear in the selection. The values will be bound as Strings.
        groupBy	        A filter declaring how to group rows, formatted as an SQL GROUP BY clause (excluding the GROUP BY itself). Passing null will cause the rows to not be grouped.
        having	        A filter declare which row groups to include in the cursor, if row grouping is being used, formatted as an SQL HAVING clause (excluding the HAVING itself). Passing null will cause all row groups to be included, and is required when row grouping is not being used.
        orderBy	        How to order the rows, formatted as an SQL ORDER BY clause (excluding the ORDER BY itself). Passing null will use the default sort order, which may be unordered.
        limit	        Limits the number of rows returned by the query, formatted as LIMIT clause. Passing null denotes no LIMIT clause.
    */
    public abstract Cursor read(SQLiteDatabase sqLiteDatabase);
    public abstract Cursor read(SQLiteDatabase sqLiteDatabase, String[] columns, String whereClause, String[] selectionArgs, String groupBy, String having, String orderBy, String limit);

    /* For future-purpose
    public abstract boolean insert(T entity);
    public abstract boolean delete(T entity);
    public abstract boolean update(T entity);
    */

    /*
    http://stackoverflow.com/questions/14007210/implementing-abstract-generic-method-in-java-with-multiple-generics-types

    public abstract <T,K> T get (K entity);

    is a method that can take anything as argument, and is allowed to return anything.

    Overriding it with
    public Integer get (DesiredClass entity)
     */
}
