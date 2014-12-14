package travel.caddy.basiclauncher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Crashlytics.start(this);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actionbar_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                // search action
                Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_nearby:
                // search action
                Toast.makeText(getApplicationContext(), "Nearby", Toast.LENGTH_LONG).show();
                return true;
            case R.id.ddMenuInstalledApps:
                // location found
                Toast.makeText(getApplicationContext(), "Applications", Toast.LENGTH_LONG).show();
                return true;
/*
            case R.id.action_categories:
                // location found
                Toast.makeText(getApplicationContext(), "Categories", Toast.LENGTH_LONG).show();
                return true;

            case R.id.ddMenuCityGuide:
                // location found
                Toast.makeText(getApplicationContext(), "City Guide", Toast.LENGTH_LONG).show();
                return true;
*/
            default:
                return super.onOptionsItemSelected(item);
        }
        //return super.onOptionsItemSelected(item);
    }
}
