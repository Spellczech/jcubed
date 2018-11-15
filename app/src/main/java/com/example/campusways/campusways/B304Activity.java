package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B304Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b304);

        ImageView room301_image = null;
        room301_image.findViewById(R.id.imageView304);
        room301_image.setImageResource(R.drawable.room_304);
    }
}
