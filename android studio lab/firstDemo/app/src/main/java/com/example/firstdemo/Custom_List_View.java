package com.example.firstdemo;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Custom_List_View extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_list_view);

        // Initialize GridView
        gridView = findViewById(R.id.mygrid);

        // Data arrays
        String[] title = {"Title 1", "Title 2", "Title 3", "Title 4"};
        String[] description = {"This is description 1", "This is description 2", "This is description 3", "This is description 4"};
        int[] image = {R.drawable.buzz_cutt, R.drawable.buzz_cutt, R.drawable.buzz_cutt, R.drawable.buzz_cutt};

        // Create adapter
        MyGridAdapter adapter = new MyGridAdapter(this, title, description, image);

        // Set adapter to GridView
        gridView.setAdapter(adapter);
    }
}
