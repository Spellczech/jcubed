package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B304Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b304);

        ImageView room304_image = (ImageView) findViewById(R.id.imageView304);
        room304_image.setImageResource(R.drawable.b304);
    }
}
