package travel.caddy.launcher.datalayer.models.sqlitetables;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.io.IOException;
import java.sql.SQLException;

import travel.caddy.launcher.datalayer.CaddySQLiteOpenHelper;

/**
 * Created by PrPatel on 9/27/2014.
 */
public class Cities {

    public static final String TABLE_NAME = "cities";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_CITYID = "cityid";
    public static final String COLUMN_CITYNAME = "cityname";
    public static final String COLUMN_NORMALIZEDCITYNAME = "normalizedcityname";
    public static final String COLUMN_COUNTRY = "country";
    public static final String COLUMN_NORMALIZEDCOUNTRY = "normalizedcountry";
    public static final String COLUMN_CONTINENT = "continent";
    public static final String COLUMN_MINLAT = "minlat";
    public static final String COLUMN_MAXLAT = "maxlat";
    public static final String COLUMN_MINLON = "minlon";
    public static final String COLUMN_MAXLON = "maxlon";

/*    public Cities(SQLiteDatabase database) {
        super(database);
    }*/

    //region "DB initialization"

    public static boolean onCreate(CaddySQLiteOpenHelper sqLiteOpenHelper, SQLiteDatabase database)
    {
       /* String createTable = "create table " + TABLE_NAME
                                    + "(" + COLUMN_ID + " INTEGER primary key autoincrement, "
                                    + COLUMN_CITYID + " INTEGER not null, "
                                    + COLUMN_CITYNAME + " TEXT not null, "
                                    + COLUMN_NORMALIZEDCITYNAME + " TEXT not null, "
                                    + COLUMN_COUNTRY + " TEXT not null, "
                                    + COLUMN_NORMALIZEDCOUNTRY + " TEXT not null, "
                                    + COLUMN_CONTINENT + " TEXT not null, "
                                    + COLUMN_MINLAT + " REAL not null, "
                                    + COLUMN_MAXLAT + " REAL not null, "
                                    + COLUMN_MINLON + " REAL not null, "
                                    + COLUMN_MAXLON + " REAL not null);";

        database.execSQL(createTable);*/

        try {

            /* example

            CREATE TABLE numbers (
               _id INTEGER PRIMARY KEY AUTOINCREMENT,
               employid INTEGER NOT NULL,
               number TEXT NOT NULL,
               ntype INTEGER NOT NULL DEFAULT '0'
            );
            CREATE INDEX employid ON numbers(employid);

            INSERT INTO numbers (employid, number, ntype) SELECT _id, ext, 0 FROM employees;
            INSERT INTO numbers (employid, number, ntype) SELECT _id, mob, 1  FROM employees;

            CREATE TABLE temp (
                 _id INTEGER PRIMARY KEY AUTOINCREMENT,
                 name TEXT NOT NULL,
                 salary INTEGER NOT NULL DEFAULT '0'
            );
            INSERT INTO temp (_id, name) SELECT _id, name FROM employees;

            DROP TABLE employees;
            ALTER TABLE temp RENAME TO employees;
             */

            sqLiteOpenHelper.ExecSQLFile(database, "cities_create_table.sql");
            sqLiteOpenHelper.ExecSQLFile(database, "cities_insert_table.sql");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Cities table initialization failed", e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Cities table initialization failed", e);
        }
        return true;
    }

    public static boolean onUpgrade(CaddySQLiteOpenHelper sqLiteOpenHelper, SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        Log.w(Cities.class.getName(), "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteOpenHelper, sqLiteDatabase);

        return true;
    }

    //endregion

    //region "DAO methods"
/*
    @Override
    public Cursor read(SQLiteDatabase sqLiteDatabase) {

        Cursor cursor = sqLiteDatabase.query(TABLE_NAME, null, null, null, null, null, null);
        return cursor;
    }

    @Override
    public Cursor read(SQLiteDatabase sqLiteDatabase, String[] columns, String whereClause, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {

        Cursor cursor = sqLiteDatabase.query(TABLE_NAME, columns, whereClause, selectionArgs, groupBy, having, orderBy, limit);
        return cursor;
    }*/

   /* public List<City> GetCities(SQLiteDatabase sqLiteDatabase, String[] columns, String whereClause)
    {
        *//*
        String[] columnNames	A list of which table columns to return. Passing "null" will return all columns.
        *//*
        //pass actual list of columns, otherwise pass null to return all the columns
        String[] outputColumns = null;
        if(columns != null && !(columns.length == 0)) {
            outputColumns = columns;
        }

        //query(java.lang.String table, java.lang.String[] columns, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String groupBy, java.lang.String having, java.lang.String orderBy)
        Cursor cursor = sqLiteDatabase.query(TABLE_NAME, outputColumns, whereClause, null, null, null, null);

        List<City> comments = new ArrayList<City>();

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            City city = ToCity(cursor);
            comments.add(city);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return comments;
    }

    public City ToCity(Cursor cursor) {

        City city = new City();

        city._ID = cursor.getInt(0);
        city.CityId = cursor.getInt(1);
        city.CityName = cursor.getString(2);
        city.NormalizedCityName = cursor.getString(3);
        city.Country = cursor.getString(4);
        city.NormalizedCountryName = cursor.getString(5);
        city.Continent = cursor.getString(6);
        city.MinLat = cursor.getLong(7);
        city.MaxLat = cursor.getLong(8);
        city.MinLon = cursor.getLong(9);
        city.MaxLon = cursor.getLong(10);

        return city;
    }
    */
    //endregion
}

