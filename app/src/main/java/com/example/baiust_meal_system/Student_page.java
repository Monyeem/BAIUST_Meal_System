package com.example.baiust_meal_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_page extends AppCompatActivity {

    private Button buttonmeal;
    private Button buttonbill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_page);

        buttonmeal = (Button) findViewById(R.id.meal);
        buttonbill = (Button) findViewById(R.id.bill);

        buttonmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(Student_page.this,Meal_page.class));


            }
        });


    }
}
