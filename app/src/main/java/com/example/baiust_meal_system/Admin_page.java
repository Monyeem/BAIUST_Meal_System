package com.example.baiust_meal_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Admin_page extends AppCompatActivity {

    private EditText editTextadminname;
    private EditText editTextadminpass;
    private Button buttonloginadmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        editTextadminname = (EditText) findViewById(R.id.usernameadmin);
        editTextadminpass = (EditText) findViewById(R.id.passwordadmin);
        buttonloginadmin = (Button) findViewById(R.id.loginadmin);








    }
}
