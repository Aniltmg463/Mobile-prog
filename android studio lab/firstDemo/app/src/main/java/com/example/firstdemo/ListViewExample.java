package com.example.firstdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewExample extends AppCompatActivity {

    // Declare ListView as a class member
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_example);

        // Initialize the ListView
        listView = findViewById(R.id.mylist);

        // Example data to display in the ListView
        String[] name = {"Ram", "Shyam", "Hari", "Sita"};

        // Create an ArrayAdapter with the example data
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.listviewitems,  // Use the layout resource for list items
                R.id.text,              // The ID of the TextView in listviewitems.xml
                name
        );

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}
