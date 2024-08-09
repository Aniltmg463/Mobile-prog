package com.example.firstdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class GridView_Example extends AppCompatActivity {

    private GridView gridView; // Declare GridView as a member

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_example); // Set content view

        gridView = findViewById(R.id.mygrid); // Initialize GridView

        // Creating string array
        String[] names = {"Ram", "Shyam", "Hari", "Sita", "Gita"};

        // Displaying list using ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.gridview_items, R.id.text, names);
        gridView.setAdapter(adapter);
    }
}
