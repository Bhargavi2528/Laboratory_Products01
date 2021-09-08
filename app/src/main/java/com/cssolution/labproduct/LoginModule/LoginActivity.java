package com.cssolution.labproduct.LoginModule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cssolution.labproduct.DashboardModule.activity.MainDashboardActivity;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    LoginActivity context =LoginActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        binding= DataBindingUtil.setContentView(context,R.layout.activity_login);

        onclick();

    }

    private void onclick() {

        binding.lSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,RegisterActivity.class));
            }
        });

        binding.tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MainDashboardActivity.class));
            }
        });

    }
}