package com.example.baiust_meal_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class Meal_page extends AppCompatActivity {

    private CheckBox checkBoxbreakfast;
    private CheckBox checkBoxlunch;
    private CheckBox checkBoxdinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_page);

        checkBoxbreakfast = (CheckBox) findViewById(R.id.breakfast);
        checkBoxlunch = (CheckBox) findViewById(R.id.lunch);
        checkBoxdinner = (CheckBox) findViewById(R.id.dinner);




    }
}
