package travel.caddy.launcher;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        _initButtons();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.launcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void _initButtons()
    {
        final Button button = (Button) findViewById(R.id.buttonCatalog);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getPackageManager().getLaunchIntentForPackage("com.tripadvisor.android.apps.cityguide.catalog");
                if(intent == null)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Guide not found!", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }
            }
        });

        //Philadelphia
        final Button buttonPhilly = (Button) findViewById(R.id.buttonPhiladelphia);

        buttonPhilly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getPackageManager().getLaunchIntentForPackage("com.tripadvisor.android.apps.cityguide.philadelphia");
                if(intent == null)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Guide not found!", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }

            }
        });

        //nyc
        final Button buttonNYC = (Button) findViewById(R.id.buttonNYC);

        buttonNYC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getPackageManager().getLaunchIntentForPackage("com.tripadvisor.android.apps.cityguide.newyork");
                if(intent == null)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Guide not found!", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }

            }
        });

        //Kalamazoo
        final Button buttonViator = (Button) findViewById(R.id.buttonViator);

        buttonViator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(Helper.TOURS_N_PACKAGES_WEBVIEW_URL);
                //Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                intent.putExtra(Helper.KEY_WEBVIEW_OPEN_URL, Helper.TOURS_N_PACKAGES_WEBVIEW_URL);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }
}
