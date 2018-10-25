package com.example.campusways.campusways;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BeaumontRooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaumont_rooms);

        /*
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(BeaumontRooms.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.rooms));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        */


    }
    public void roomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B301Activity.class));
    }


}
