package travel.caddy.launcher.datalayer;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.IOException;
import java.sql.SQLException;

import travel.caddy.launcher.Helpers.Settings;
import travel.caddy.launcher.datalayer.models.sqlitetables.Cities;

/**
 * Created by PrPatel on 9/27/2014.
 */
public class CaddySQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "caddy.db";
    private static final int DATABASE_VERSION = Settings.DATABASE_VERSION;

    private Context _context;

    //DatabaseErrorHandler to be used when sqlitetables reports database corruption, or null to use the default error handler.
    public CaddySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);

        _context = context;
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

    private void _execSqlFile(String sqlFile, SQLiteDatabase db ) throws SQLException, IOException {
        Log.i("  exec sql file: {}", sqlFile);
        for( String sqlInstruction : SQLFileParser.ParseSqlFile( Settings.SQL_DIR + "/" + sqlFile, _context.getAssets())) {
            Log.d("    sql: {}", sqlInstruction );
            db.execSQL(sqlInstruction);
        }
    }
}
