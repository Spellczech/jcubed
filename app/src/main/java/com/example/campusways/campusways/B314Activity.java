package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B314Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b314);

        ImageView room314_image = (ImageView) findViewById(R.id.imageView314);
        room314_image.setImageResource(R.drawable.b314);
    }
}
