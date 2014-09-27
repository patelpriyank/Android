package travel.caddy.launcher.datalayer.models.sqlitetables;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

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
}
