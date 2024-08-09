package com.example.classproject;

import android.os.Bundle;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

public class Chechbox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chechbox);  // Ensure this references the correct layout file

        // Initialize the CheckBox using the correct ID from XML
        CheckBox checkBox = findViewById(R.id.coffee);

        // Check if the CheckBox is already checked
        if (checkBox.isChecked()) {
            // Uncheck the CheckBox if it is checked
            checkBox.setChecked(false);
        }
    }
}
