package com.example.firstdemo.folder;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstdemo.R;

public class RecyclerViewExample extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_example); // Ensure this is the correct layout file name

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerview);

        // Sample data arrays
        String[] name = { "Ram", "Shyam", "Hari", "Gita", "Sita" };
        String[] address = { "Birtamode", "Kathmandu", "Pokhara", "Birtamode", "Kathmandu" };
        int[] image = {
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };

        // Setting layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Passing data to Adapter class
        adapter = new RecyclerViewAdapter(this, name, address, image);
        recyclerView.setAdapter(adapter);
    }
}
