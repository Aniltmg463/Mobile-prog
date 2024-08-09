package com.example.mobprog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GetData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        Intent i = getIntent();
        int id = i.getIntExtra("id", 0);
        String name = i.getStringExtra("name");
        String address = i.getStringExtra("address");

        TextView txt = findViewById(R.id.textView);
        txt.setText("Id=" + id + "\n" + "Name=" + name + "\n" + "Address=" + address + "\n");

        Button returnButton = findViewById(R.id.returnButton);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example of sending back a message to the parent activity
                String message = "Data received successfully";
                Intent resultIntent = new Intent();
                resultIntent.putExtra("message", message);
                setResult(RESULT_OK, resultIntent);
                finish(); // Finish the activity and return to the parent
            }
        });
    }
}
