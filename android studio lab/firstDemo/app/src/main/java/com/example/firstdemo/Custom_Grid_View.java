package com.example.firstdemo;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class Custom_Grid_View extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        gridView = findViewById(R.id.mygrid);

        String[] title = {
                "Title 1", "Title 2",
                "Title 3", "Title 4"
        };
        String[] description = {
                "This is description 1",
                "This is description 2",
                "This is description 3",
                "This is description 4"
        };
        int[] image = {
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background
        };

        Custom_Grid_Items adapter = new Custom_Grid_Items(this, title, description, image);
        gridView.setAdapter(adapter);
    }
}
