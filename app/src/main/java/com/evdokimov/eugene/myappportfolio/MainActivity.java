package com.evdokimov.eugene.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    private String textPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPattern = getResources().getString(R.string.text_pattern_4_toast);

    }

    public void onMainClick(View v) //implement button clicks for main activity
    {
        boolean isCorrectClick = true;
        String strToast = textPattern;
        switch (v.getId())
        {
            case R.id.btn_spotify_streamer:
                strToast+= " " + getString(R.string.spotify_streamer) + " app!";
                break;
            case R.id.btn_scores_app:
                strToast+= " " + getString(R.string.scores_app) + "!";
                break;
            case R.id.brn_library_app:
                strToast+= " " + getString(R.string.library_app) + "!";
                break;
            case R.id.btn_build_it_bigger:
                strToast+= " " + getString(R.string.build_it_bigger) + " app!";
                break;
            case R.id.btn_xyz_reader:
                strToast+= " " + getString(R.string.xyz_reader) + " app!";
                break;
            case R.id.btn_capstone_my_own_app:
                strToast+= " capstone app!";
                break;
            default: isCorrectClick = false;
        }
        if (isCorrectClick)
        {
            Toast.makeText(this,strToast,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
