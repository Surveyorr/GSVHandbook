package gsvhandbook.bdevelopers.lini.com.gsvhandbook;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import java.util.Objects;

public class ResultActivity extends AppCompatActivity {


    Fragment fragment;
    Button retry;

    public static boolean CheckInternet(Context context) {
        ConnectivityManager check = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activenetwork = null;
        if (check != null) {
            activenetwork = check.getActiveNetworkInfo();
        }
        return activenetwork != null && activenetwork.isConnectedOrConnecting();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        if (savedInstanceState == null && CheckInternet(getApplicationContext())) {
            FragmentManager manager = getSupportFragmentManager();
            fragment = new ResultFragment();
            manager.beginTransaction().replace(R.id.frame, fragment).commit();
        } else {
            FragmentManager manager = getSupportFragmentManager();
            fragment = new Error();
            manager.beginTransaction().replace(R.id.frame, fragment).commit();
        }
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        /** FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
         fab.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show();
        }
        });**/
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


    }

    public void loarPage() {
        FragmentManager manager = getSupportFragmentManager();
        fragment = new ResultFragment();
        manager.beginTransaction().replace(R.id.frame, fragment).commit();
    }
}
