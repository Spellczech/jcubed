package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B312Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b312);

        ImageView room312_image = (ImageView) findViewById(R.id.imageView312);
        room312_image.setImageResource(R.drawable.b312);
    }
}
