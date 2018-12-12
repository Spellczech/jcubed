package com.example.campusways.campusways;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public abstract class Beaumont extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaumont);

        ImageView room301_image = (ImageView) findViewById(R.id.imageViewBeaumont);
        room301_image.setImageResource(R.drawable.beaumont2);
    }


}



