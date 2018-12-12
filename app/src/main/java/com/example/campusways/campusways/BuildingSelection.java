package com.example.campusways.campusways;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class BuildingSelection extends AppCompatActivity {

    private Spinner spinner1, spinner2, spinner3;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_selection);


        addItemsOnSpinner2();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(BuildingSelection.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner startSpinner = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> startAdapter = new ArrayAdapter<String>(BuildingSelection.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.startRoom));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        startSpinner.setAdapter(startAdapter);

        Spinner endSpinner = (Spinner) findViewById(R.id.spinner3);

        ArrayAdapter<String> endAdapter = new ArrayAdapter<String>(BuildingSelection.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.endRoom));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        endSpinner.setAdapter(endAdapter);


    }

    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("room 301");
        list.add("room 301f");
        list.add("room 301g");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new ItemSelectedListener());

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new ItemSelectedListener());

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setOnItemSelectedListener(new ItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        btnSubmit = (Button) findViewById(R.id.button_beaumont);


        btnSubmit.setOnClickListener(new OnClickListener() {




            @Override
            public void onClick(View v) {
                String text = (String) spinner2.getSelectedItem();
                String text2 = (String) spinner3.getSelectedItem();


                startActivity(new Intent(BuildingSelection.this, B301Activity.class));
                //startActivity(new Intent(BuildingSelection.this, Beaumont.class));


            }

        });
    }
}
