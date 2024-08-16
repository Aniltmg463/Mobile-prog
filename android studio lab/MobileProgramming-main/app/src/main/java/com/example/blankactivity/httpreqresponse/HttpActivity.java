package com.example.blankactivity.httpreqresponse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.blankactivity.R;

public class HttpActivity extends AppCompatActivity {
    Button b1;
    Button b2;

    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;
    private String getUrl = "https://66bd632074dfc195586c7d8f.mockapi.io/www/ask/me/anask";//mock api url halne
    private String postUrl = "https://66bd632074dfc195586c7d8f.mockapi.io/www/ask/me/anask";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
        getData();
        addListenerOnButton1();
        addListenerOnButton2();
    }


    public void addListenerOnButton1() {
        b1 = findViewById(R.id.get);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               getData();

            }
        });
    } public void addListenerOnButton2() {
        b2 = findViewById(R.id.post);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("back pressed");
                Intent i = new Intent();
                i.putExtra("result", "testing");
                setResult(200, i);
                finish();
            }
        });
    }

    private void postData() {

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        // RequestQueue initialized
        mRequestQueue = Volley.newRequestQueue(this);

        // String Request initialized
        mStringRequest = new StringRequest(Request.Method.POST, postUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("//////////////////////////////////////////");
                System.out.println(response);
                Toast.makeText(getApplicationContext(), "Response :" + response.toString(), Toast.LENGTH_LONG).show();//display the response on screen
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println( "Error :" + error.toString());
            }
        });

        mRequestQueue.add(mStringRequest);
    }

    private void getData() {

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        // RequestQueue initialized
        mRequestQueue = Volley.newRequestQueue(this);

        // String Request initialized
        mStringRequest = new StringRequest(Request.Method.GET, getUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("//////////////////////////////////////////");
                System.out.println(response);
                Toast.makeText(getApplicationContext(), "Response :" + response.toString(), Toast.LENGTH_LONG).show();//display the response on screen
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println( "Error :" + error.toString());
            }
        });

        mRequestQueue.add(mStringRequest);
    }
}