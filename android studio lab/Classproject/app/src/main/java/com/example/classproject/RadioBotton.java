package com.example.classproject;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RadioBotton extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_botton);

        // Initialize the RadioGroup
        radioGroup = findViewById(R.id.radioGroup);

        // Set a check change listener for the RadioGroup
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the selected RadioButton using the checkedId
                RadioButton radioButton = findViewById(checkedId);

                // Display a toast message with the selected RadioButton's text
                Toast.makeText(RadioBotton.this, "Selected Radio Button is: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}