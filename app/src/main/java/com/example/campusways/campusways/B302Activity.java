package com.example.campusways.campusways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class B302Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b302);

        ImageView room302_image = (ImageView) findViewById(R.id.imageView302);
        room302_image.setImageResource(R.drawable.b302);
    }
}
