package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B305Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b305);

        ImageView room305_image = (ImageView) findViewById(R.id.imageView305);
        room305_image.setImageResource(R.drawable.b305);
    }
}
