package com.example.campusways.campusways;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BeaumontRooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaumont_rooms);


        final Button button = findViewById(R.id.b301);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                startActivity(new Intent(BeaumontRooms.this, B301Activity.class));
            }
        });


    }

    public void b301RoomActivity(View view) {

    }
    public void b301fRoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B301FActivity.class));
    }
    public void b301gRoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B301GActivity.class));
    }
    public void b302RoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B302Activity.class));
    }
    public void b304RoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B304Activity.class));
    }
    public void b305RoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B305Activity.class));
    }
    public void b312RoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B312Activity.class));
    }
    public void b314RoomActivity(View view) {
        startActivity(new Intent(BeaumontRooms.this, B314Activity.class));
    }


}
