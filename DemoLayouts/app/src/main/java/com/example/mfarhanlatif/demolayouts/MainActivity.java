package com.example.mfarhanlatif.demolayouts;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    TextView textView1;
    TextView textiew2;
    Button btnsms,btnemail,btnface;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView=(NavigationView)findViewById(R.id.navigation);

        image1=(ImageView)findViewById(R.id.imageView1);

        setUpToolBar();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.constarainL:
                        Intent intent= new Intent(MainActivity.this,constrain.class);
                         startActivity(intent);
                         break;
                    case R.id.relativeL:
                        Intent intent1 = new Intent (MainActivity.this,RelativeL.class);
                        startActivity(intent1);
                        break;
                    case R.id.mysubscriptionL:
                        Intent intent2= new Intent(MainActivity.this,MySubscription.class);
                        startActivity(intent2);
                       break;
                }
                return false;
            }
        });

    }

    
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setUpToolBar() {
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        toolbar=(Toolbar)findViewById(R.id.toolbar);

       setSupportActionBar(toolbar);
       actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar,R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }

}
