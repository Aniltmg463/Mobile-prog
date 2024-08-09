package com.example.classproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Custom_Dialog_Layout extends AppCompatActivity {

    private Button btnClick;
    private EditText edtFirst, edtSecond;
    private Button btnCalculate;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_layout);

        btnClick = findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Custom_Dialog_Layout.this);
        builder.setTitle("Calculate Sum");
        builder.setCancelable(true);

        // Inflate the custom dialog view
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_activity, null);
        builder.setView(dialogView);

        // Initialize widgets from the custom dialog view
        edtFirst = dialogView.findViewById(R.id.edtFirst);
        edtSecond = dialogView.findViewById(R.id.edtSecond);
        btnCalculate = dialogView.findViewById(R.id.btnCalculate);
        txtResult = dialogView.findViewById(R.id.txtResult);

        // Set up button click listener
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    System.out.println("jhasdghkjashdkjasdkasdkashd");
                    int first = Integer.parseInt(edtFirst.getText().toString());
                    int second = Integer.parseInt(edtSecond.getText().toString());
                    int result = first+ second;
                    System.out.println(result);
                    txtResult.setText("Result:"+result);
                } catch (NumberFormatException e) {
                    txtResult.setText("Invalid input");
                }
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }
}
