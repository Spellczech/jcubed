package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B301FActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b301_f);

        ImageView room301f_image = (ImageView) findViewById(R.id.imageView301F);
        room301f_image.setImageResource(R.drawable.b301f);
    }
}
