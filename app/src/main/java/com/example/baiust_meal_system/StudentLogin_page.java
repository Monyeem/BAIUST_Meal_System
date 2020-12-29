package com.example.baiust_meal_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentLogin_page extends AppCompatActivity {

    private EditText editTextstudentname;
    private EditText editTextpasstudent;
    private Button buttonloginstudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_page);

        editTextstudentname = (EditText) findViewById(R.id.usernamestudent);
        editTextstudentname = (EditText) findViewById(R.id.passwordstudent);
        buttonloginstudent = (Button) findViewById(R.id.loginstudent);

        buttonloginstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudentLogin_page.this,Student_page.class));
            }
        });

    }
}
