package com.example.classproject;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Popup_Menu_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        button1 = findViewById(R.id.button1);

        // Set click listener for the button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a PopupMenu
                PopupMenu popupMenu = new PopupMenu(Popup_Menu_Activity.this, button1);

                // Inflate the menu resource (assuming you have a menu XML file)
                MenuInflater inflater = popupMenu.getMenuInflater();
                inflater.inflate(R.menu.popup_menu, popupMenu.getMenu());

                // Set a click listener for menu items
                popupMenu.setOnMenuItemClickListener(Popup_Menu_Activity.this);

                // Show the popup menu
                popupMenu.show();
            }
        });
    }

    // Handle menu item clicks
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        // Handle item selection
        int id = item.getItemId();
        if (R.id.menu_item1 == id) {
            Toast.makeText(getApplicationContext(), "menu1 selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.menu_item2 == id) {
            Toast.makeText(getApplicationContext(), "menu2 selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (R.id.item3 == id) {
            Toast.makeText(getApplicationContext(), "info selected", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    // Helper method to show a toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
