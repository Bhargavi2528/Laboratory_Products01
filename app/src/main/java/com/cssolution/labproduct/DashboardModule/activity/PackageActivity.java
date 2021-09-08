package com.cssolution.labproduct.DashboardModule.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.ActivityPackageBinding;

public class PackageActivity extends AppCompatActivity {

    ActivityPackageBinding binding;
    PackageActivity context = PackageActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);

        binding= DataBindingUtil.setContentView(context,R.layout.activity_package);

        if (savedInstanceState == null) {

            binding.ivBackarrow.setVisibility(View.VISIBLE);
            binding.tvToolbar.setText("Package");
            binding.ivNotification.setVisibility(View.VISIBLE);
            binding.ivNotification.setImageResource(R.drawable.ic_refresh);

        }

        onclick();

    }

    private void onclick() {

        binding.ivPackage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,PackageDetailsActivity.class));

            }
        });
        binding.ivPackage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,PackageDetailsActivity.class));

            }
        });
        binding.ivPackage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,PackageDetailsActivity.class));

            }
        });
        binding.ivPackage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,PackageDetailsActivity.class));

            }
        });
        binding.ivPackage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(context,PackageDetailsActivity.class));

            }
        });

        binding.ivBackarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MainDashboardActivity.class));
            }
        });

    }
}