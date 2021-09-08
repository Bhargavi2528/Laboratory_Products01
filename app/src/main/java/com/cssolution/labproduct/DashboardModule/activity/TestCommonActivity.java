package com.cssolution.labproduct.DashboardModule.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.ActivityTestCommonBinding;

public class TestCommonActivity extends AppCompatActivity {

    ActivityTestCommonBinding binding;
    TestCommonActivity context = TestCommonActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_common);

        binding = DataBindingUtil.setContentView(context,R.layout.activity_test_common);

        if (savedInstanceState == null) {

            binding.toolbar.ivBackarrow.setVisibility(View.VISIBLE);
            binding.toolbar.ivNotification.setVisibility(View.INVISIBLE);
            binding.toolbar.tvToolbar.setText(R.string.test);

        }

        onclick();

    }

    private void onclick() {

        binding.toolbar.ivBackarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MainDashboardActivity.class));
            }
        });

    }
}