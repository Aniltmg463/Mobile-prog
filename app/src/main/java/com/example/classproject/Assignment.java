package com.example.classproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Assignment extends AppCompatActivity {

    // Declare UI components
    private EditText username;
    private EditText userAddress;
    private CheckBox cmale;
    private CheckBox cfemale;
    private RadioGroup radioGroupPaisa;
    private Spinner spinner;
    private Button button;
    private TextView output1;
    private TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content view to the XML layout
        setContentView(R.layout.activity_assignment);

        // Initialize UI components
        username = findViewById(R.id.username);
        userAddress = findViewById(R.id.userAddress);
        cmale = findViewById(R.id.cmale);
        cfemale = findViewById(R.id.cfemale);
        radioGroupPaisa = findViewById(R.id.radioGroupPaisa);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.button);
        output1 = findViewById(R.id.output1);
        output2 = findViewById(R.id.output2);

        // Set up button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Collect input data
                String name = username.getText().toString();
                String address = userAddress.getText().toString();
                String gender = getSelectedGender();
                String paisa = getSelectedPaisa();
                String game = spinner.getSelectedItem().toString();

                // Display collected data
                output1.setText("Name: " + name + "\nAddress: " + address + "\nGender: " + gender);
                output2.setText("Paisa: " + paisa + "\nSelected Game: " + game);

                // Optional: Show a toast message
                Toast.makeText(Assignment.this, "Data displayed!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Method to get selected gender
    private String getSelectedGender() {
        if (cmale.isChecked()) {
            return "Male";
        } else if (cfemale.isChecked()) {
            return "Female";
        } else {
            return "Not specified";
        }
    }

    // Method to get selected paisa value
    private String getSelectedPaisa() {
        int selectedId = radioGroupPaisa.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            return selectedRadioButton.getText().toString();
        } else {
            return "Not specified";
        }
    }
}
