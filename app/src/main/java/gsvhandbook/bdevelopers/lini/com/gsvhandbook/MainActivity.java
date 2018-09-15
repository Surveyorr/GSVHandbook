package gsvhandbook.bdevelopers.lini.com.gsvhandbook;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public CardView y1;
    public CardView y2;
    public CardView y3;
    public CardView y4;
    public CardView y5;
    public Fragment fragment;
    NavigationView navigationView;
    TextView message;
    Boolean exit = true;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentManager manager = getSupportFragmentManager();
            fragment = new HomeFragment();
            manager.beginTransaction().replace(R.id.content_frame, fragment, "Home").commit();
        }
        /*Today 26-07-018 1:44 made a major break through with fragment and nav drawer so i
        can now create multiple fragments and still go "Home" the navigation drawer menu **/
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

//Drawer Layout
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        int id = item.getItemId();
                        if (id == R.id.home) {

                            FragmentManager manager = getSupportFragmentManager();
                            fragment = new HomeFragment();
                            manager.beginTransaction().replace(R.id.content_frame, fragment, "Home").commit();
                            getSupportActionBar().setTitle(R.string.app_name);


                        } else if (id == R.id.lec) {
                            FragmentManager manager = getSupportFragmentManager();
                            fragment = new LecturersFragment();
                            manager.beginTransaction().replace(R.id.content_frame, fragment).addToBackStack(null).commit();
                            getSupportActionBar().setTitle("Lecturers");
                            onBackPressed();
                        } else if (id == R.id.time) {
                            FragmentManager manager = getSupportFragmentManager();
                            fragment = new TimeTable();
                            manager.beginTransaction().replace(R.id.content_frame, fragment).addToBackStack(null).commit();
                            toolbar.setTitle("Time Table");

                        } else if (id == R.id.result) {
                            Intent result = getPackageManager().getLaunchIntentForPackage("com.bdevelop.lini.uniuyodb");
                            if (result != null) {
                                startActivity(result);
                            } else {
                                Toast.makeText(MainActivity.this, "Please make sure your data is turned on before proceeding",
                                        Toast.LENGTH_SHORT)
                                        .show();
                                AlertDialog.Builder feed = new AlertDialog.Builder(MainActivity.this);
                                feed.setTitle("Check Result");
                                feed.setMessage("We detected that you do not have the Uniuyo Portal app on your phone. \n" + "\t Would you like to download it now?. Select NO to check result directly");
                                feed.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent res = new Intent(getApplicationContext(), ResultActivity.class);
                                        startActivity(res);
                                    }
                                });
                                feed.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(), "Sorry You can't your result at the moment",
                                                Toast.LENGTH_SHORT)
                                                .show();
                                    }
                                });
                                feed.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(), "Your download will start soon, thanks",
                                                Toast.LENGTH_SHORT)
                                                .show();
                                        ProgressDialog mProgressDialog;

                                        // instantiate it within the onCreate method
                                        mProgressDialog = new ProgressDialog(MainActivity.this);
                                        mProgressDialog.setMessage("Downloading");
                                        mProgressDialog.setIndeterminate(true);
                                        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                                        mProgressDialog.setCancelable(true);
                                        mProgressDialog.show();

                                        // execute this when the downloader must be fired
                                        //final DownloadTask downloadTask = new DownloadTask(MainActivity.this);
                                        //downloadTask.execute("the url to the file you want to download");

                                        mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                                            @Override
                                            public void onCancel(DialogInterface dialog) {
                                            }
                                        });
                                    }
                                });
                                feed.show();
                            }

                        } else if (id == R.id.reg) {
                            Intent reg = new Intent(Intent.ACTION_MAIN);
                            reg.setComponent(new ComponentName("com.bdevelop.lini.uniuyodb", "com.bdevelop.lini.uniuyodb.ResultActivity"));
                            if (reg != null) {
                                startActivity(reg);
                            }
                        } else if (id == R.id.ab) {
                            FragmentManager manager = getSupportFragmentManager();
                            fragment = new About();
                            manager.beginTransaction().replace(R.id.content_frame, fragment).commit();

                        } else if (id == R.id.sha) {
                            Intent share = new Intent(Intent.ACTION_SEND);
                            //startActivity(share);

                        } else if (id == R.id.fb) {
                            final AlertDialog.Builder feed = new AlertDialog.Builder(MainActivity.this);
                            feed.setTitle("Select An Option");
                            String[] method = {"E-mail", "Form", "Text", "WhatsApp"};

                            feed.setItems(method, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    switch (i) {
                                        case 0:
                                            Intent mail = new Intent("android.intent.action.SEND");
                                            mail.setType("text/Email");
                                            mail.putExtra("Subject", 4);
                                            mail.putExtra("android.intent.extra.EMAIL", new String[]{"bdevelopersteam@gmail.com"});
                                            startActivity(mail);
                                        case 1:

                                        case 2:
                                            return;
                                        case 3:
                                            Uri uri = Uri.parse("smsto:" + "+2347055899240");
                                            Intent wa = new Intent(Intent.ACTION_SENDTO, uri);
                                            wa.putExtra("chat", true);
                                            wa.setPackage("com.whatsapp");
                                            startActivity(Intent.createChooser(wa, ""));
                                    }
                                }
                            });
                            feed.show();
                        }
                        drawerLayout.closeDrawers();
                        return true;
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_info) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //builder.setTitle("About");
            LayoutInflater inflater = getLayoutInflater();
            View dialogVi = inflater.inflate(R.layout.about, null);
            builder.setView(dialogVi);
            builder.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //getSupportActionBar().setTitle(fragment.getTag());
    }

    @Override
    public void onBackPressed() {

        if (exit && fragment == new HomeFragment()) {
            finish();
        } else {
            FragmentManager manager = getSupportFragmentManager();
            fragment = new HomeFragment();
            manager.beginTransaction().replace(R.id.content_frame, fragment).commit();
            getSupportActionBar().setTitle(R.string.app_name);
            //exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                }
            }, 3 * 1000);

        }
        super.onBackPressed();
    }
}
