package com.example.mobprog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycle extends AppCompatActivity {

    private TextView txt;
    private static final int GET_DATA_REQUEST_CODE = 2; // Request code for starting GetData activity

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("Life cycle: ", "Created");

        Button btn = findViewById(R.id.button);
        txt = findViewById(R.id.textView); // Initialize txt assuming you have a TextView in your layout

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(LifeCycle.this, GetData.class);

                i.putExtra("id", 626); // Use integer for id
                i.putExtra("name", "Anil");
                i.putExtra("address", "BKT");
                startActivityForResult(i, GET_DATA_REQUEST_CODE); // Start GetData activity for result with request code
            }
        });
    }

    // Callback method to get the Message from another Activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Check if the request code is the same as what is passed; here it is GET_DATA_REQUEST_CODE
        if (requestCode == GET_DATA_REQUEST_CODE && resultCode == RESULT_OK) {
            String message = data.getStringExtra("message");
            txt.setText("Data from GetData:\n" + message); // Set the text received from GetData activity
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle: ", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle: ", "Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle: ", "Restarted");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle: ", "Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle: ", "Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle: ", "Destroyed");
    }
}
