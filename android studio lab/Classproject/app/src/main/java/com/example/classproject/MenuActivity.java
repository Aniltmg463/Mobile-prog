package com.example.classproject;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); // Set the correct layout file

        btnClick = findViewById(R.id.button); // Initialize the button after setting the content view
        registerForContextMenu(btnClick);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.test_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (R.id.item1 == id) {
            Toast.makeText(getApplicationContext(), "search selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item2 == id) {
            Toast.makeText(getApplicationContext(), "contact selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item3 == id) {
            Toast.makeText(getApplicationContext(), "info selected", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (R.id.item1 == id) {
            Toast.makeText(getApplicationContext(), "search selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item2 == id) {
            Toast.makeText(getApplicationContext(), "contact selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item3 == id) {
            Toast.makeText(getApplicationContext(), "info selected", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }
}
