package com.example.baiust_meal_system;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Front_page extends AppCompatActivity {

    private Button buttonadmin;
    private Button buttonstudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        buttonadmin = (Button) findViewById(R.id.Admin);
        buttonstudent = (Button) findViewById(R.id.Student);


        buttonstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Front_page.this,StudentLogin_page.class));
            }
        });

        buttonadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Front_page.this,Admin_page.class));
            }
        });




    }
}
