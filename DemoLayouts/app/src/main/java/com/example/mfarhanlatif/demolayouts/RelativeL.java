package com.example.mfarhanlatif.demolayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RelativeL extends AppCompatActivity {

    ImageView image1;
    TextView textView1;
    TextView textiew2;
    Button btnsms,btnemail,btnface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_l);
        image1=(ImageView)findViewById(R.id.imageView1);




    }
}
