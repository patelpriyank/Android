package travel.caddy.launcher.datalayer.models.sqlitetables;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import org.w3c.dom.Comment;

import java.util.List;

/**
 * Created by PrPatel on 9/27/2014.
 */
public class Cities {

    public static final String TABLE_NAME = "cities";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_CITYID = "cityid";
    public static final String COLUMN_CITYNAME = "cityname";
    public static final String COLUMN_NORMALIZEDNAME = "normalizedname";
    public static final String COLUMN_MINLAT = "minlat";
    public static final String COLUMN_MAXLAT = "maxlat";
    public static final String COLUMN_MINLON = "minlon";
    public static final String COLUMN_MAXLON = "maxlon";

    //region "DB initialization"

    public static boolean onCreate(SQLiteDatabase database)
    {
        String createTable = "create table " + TABLE_NAME
                                    + "(" + COLUMN_ID + " INTEGER primary key autoincrement, "
                                    + COLUMN_CITYID + " INTEGER not null, "
                                    + COLUMN_CITYNAME + " TEXT not null, "
                                    + COLUMN_NORMALIZEDNAME + " TEXT not null, "
                                    + COLUMN_MINLAT + " REAL not null, "
                                    + COLUMN_MAXLAT + " REAL not null, "
                                    + COLUMN_MINLON + " REAL not null, "
                                    + COLUMN_MAXLON + " REAL not null);";

        database.execSQL(createTable);

        return true;
    }

    public static boolean onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        Log.w(Cities.class.getName(), "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

        return true;
    }

    //endregion

    //region "DAO methods"

    public Cursor GetCities(SQLiteDatabase sqLiteDatabase, String[] columns, String whereClause)
    {
        /*
        String[] columnNames	A list of which table columns to return. Passing "null" will return all columns.
        */
        //pass actual list of columns, otherwise pass null to return all the columns
        String[] outputColumns = null;
        if(columns != null && !(columns.length == 0)) {
            outputColumns = columns;
        }

        //query(java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy)
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME, outputColumns, whereClause, null, null, null, null);

        return cursor;
    }

    public City ToCity(Cursor cursor) {

        City city = new City();

        city._ID = cursor.getInt(0);
        city.CityId = cursor.getInt(1);
        city.CityName = cursor.getString(2);
        city.NormalizedName = cursor.getString(3);
        city.MinLat = cursor.getLong(4);
        city.MaxLat = cursor.getLong(5);
        city.MinLon = cursor.getLong(6);
        city.MaxLon = cursor.getLong(7);

        return city;
    }

    //endregion
}

