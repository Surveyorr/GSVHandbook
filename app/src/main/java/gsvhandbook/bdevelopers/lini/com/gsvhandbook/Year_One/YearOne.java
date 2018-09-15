package gsvhandbook.bdevelopers.lini.com.gsvhandbook.Year_One;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import gsvhandbook.bdevelopers.lini.com.gsvhandbook.R;

public class YearOne extends AppCompatActivity {

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
        setContentView(R.layout.activity_year_one);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        switchToFrag1();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        // navigation.getMenu().findItem(R.id.navigation_fs).setChecked(true);


    }

    public void switchToFrag1() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new firstSem1()).commit();
    }

    public void switchToFrag2() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new seconSem1()).commit();
    }

    public void switchToFrag3() {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new Lecturers()).commit();
    }
}
