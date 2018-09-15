package gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_Three;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

import gsvhandbook.bdevelopers.lini.com.gsvhandbook.R;

public class YearThree extends AppCompatActivity {

    WebView webView;
    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_fs:
                    switchToFrag1();
                    return true;
                case R.id.navigation_ss:
                    switchToFrag2();
                    return true;
                case R.id.navigation_lec:
                    switchToFrag3();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year_three);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        switchToFrag1();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    // FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
    //getLayoutInflater().inflate(R.layout.home_activity, contentFrameLayout);
    public void switchToFrag1() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new firstSem3()).commit();
    }

    public void switchToFrag2() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new seconSem3()).commit();
    }

    public void switchToFrag3() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new Lecturers()).commit();
    }
}
