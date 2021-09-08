package com.cssolution.labproduct.DashboardModule.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cssolution.labproduct.DashboardModule.adapter.TabAdapter;
import com.cssolution.labproduct.DashboardModule.frgement.PackageFragment;
import com.cssolution.labproduct.DashboardModule.frgement.TestFragment;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.ActivityCommonTabBinding;

public class CommonTabActivity extends AppCompatActivity {

    ActivityCommonTabBinding binding;
    CommonTabActivity context = CommonTabActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_tab);

        binding= DataBindingUtil.setContentView(context, R.layout.activity_common_tab);

        setupview();
        binding.tabs.setupWithViewPager(binding.viewPager);

        Intent i = getIntent();
        String a =i.getStringExtra("Title");

        if (savedInstanceState == null) {

            binding.toolbar.ivBackarrow.setVisibility(View.VISIBLE);
            binding.toolbar.ivNotification.setVisibility(View.INVISIBLE);
            binding.toolbar.tvToolbar.setText(a);

        }

        onclick();

    }

    private void setupview()
    {

        TabAdapter tabadapter = new TabAdapter(getSupportFragmentManager());
        tabadapter.addfragment(new TestFragment(), "Test");
        tabadapter.addfragment(new PackageFragment(), "Package");
        binding.viewPager.setAdapter(tabadapter);

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