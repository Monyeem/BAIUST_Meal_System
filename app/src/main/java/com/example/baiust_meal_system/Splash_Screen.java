package com.example.baiust_meal_system;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        Animation animation = new AlphaAnimation(0,1);
        animation.setDuration(2000);

        imageView = findViewById(R.id.logo);
        textView = findViewById(R.id.text);

        imageView.setAnimation(animation);
        textView.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_Screen.this,Front_page.class));
                finish();
            }
        },3000);


    }
}
