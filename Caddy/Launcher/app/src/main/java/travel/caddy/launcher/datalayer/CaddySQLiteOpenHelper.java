package travel.caddy.launcher.datalayer;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import travel.caddy.launcher.Helpers.Settings;
import travel.caddy.launcher.datalayer.models.sqlitetables.Cities;

/**
 * Created by PrPatel on 9/27/2014.
 */
public class CaddySQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "caddy.db";
    private static final int DATABASE_VERSION = Settings.DATABASE_VERSION;

    //DatabaseErrorHandler to be used when sqlitetables reports database corruption, or null to use the default error handler.
    public CaddySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //create 'cities' table
        Cities.onCreate(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        //upgrade 'cities' table
        Cities.onUpgrade(sqLiteDatabase, oldVersion, newVersion);

    }
}
