package com.example.campusways.campusways;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BuildingSelection extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_selection);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(BuildingSelection.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

    }
/*
    public void roomActivity(Intent intent) {
        roomActivity(new Intent(BuildingSelection.this, BeaumontRooms.class));
        String[] elements = (getResources().getStringArray(R.array.names));

        if (elements[0]) {

        } else {
            return;
        }
    }
    */


    public void roomActivity(View view) {
        startActivity(new Intent(BuildingSelection.this, BeaumontRooms.class));
    }
}
