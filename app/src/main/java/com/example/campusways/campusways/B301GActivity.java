package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B301GActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b301_g);

        ImageView room301g_image = (ImageView) findViewById(R.id.imageView301g);
        room301g_image.setImageResource(R.drawable.b301g);

    }
}
