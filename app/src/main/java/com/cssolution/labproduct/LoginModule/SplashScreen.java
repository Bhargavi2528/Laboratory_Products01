package com.cssolution.labproduct.LoginModule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.cssolution.labproduct.R;

public class SplashScreen extends AppCompatActivity {

    SplashScreen context = SplashScreen.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(context, LoginActivity.class));
            }
        },2000);

    }
}