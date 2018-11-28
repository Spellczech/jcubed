package com.example.campusways.campusways;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class B301Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b301);

        ImageView room301_image = (ImageView) findViewById(R.id.imageView301);
        room301_image.setImageResource(R.drawable.b301);
    }
}
