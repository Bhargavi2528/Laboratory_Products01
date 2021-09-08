package com.cssolution.labproduct.DashboardModule.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cssolution.labproduct.DashboardModule.frgement.AccountFragment;
import com.cssolution.labproduct.DashboardModule.frgement.CartFragment;
import com.cssolution.labproduct.DashboardModule.frgement.HomeFragment;
import com.cssolution.labproduct.DashboardModule.frgement.LocationFragment;
import com.cssolution.labproduct.DashboardModule.frgement.ReportFragment;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.ActivityMainDashboardBinding;

public class MainDashboardActivity extends AppCompatActivity {
    
    ActivityMainDashboardBinding binding;
    MainDashboardActivity context = MainDashboardActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        binding= DataBindingUtil.setContentView(context,R.layout.activity_main_dashboard);


        if (savedInstanceState == null) {

            binding.ivBackarrow.setVisibility(View.INVISIBLE);
            binding.tvToolbar.setText(R.string.app_name);
            binding.ivNotification.setVisibility(View.VISIBLE);
            binding.ivNotification.setImageResource(R.drawable.ic__notification);


            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main, new HomeFragment())
                    .commit();
        }

        onclick();
        
    }

    private void onclick() {

        binding.bottombar.lHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.ivBackarrow.setVisibility(View.INVISIBLE);
                binding.tvToolbar.setText(R.string.app_name);
                binding.ivNotification.setVisibility(View.VISIBLE);
                binding.ivNotification.setImageResource(R.drawable.ic__notification);

                binding.bottombar.ivHome.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_Selection));
                binding.bottombar.ivLocation.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivReports.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivCart.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivAccount.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));

                binding.bottombar.tvHome.setTextColor(getResources().getColor(R.color.bottom_Selection));
                binding.bottombar.tvLocation.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvReports.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvCart.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvAccount.setTextColor(getResources().getColor(R.color.bottom_unSelection));


                HomeFragment home = new HomeFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main,home).commit();

            }
        });

        binding.bottombar.lLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.ivBackarrow.setVisibility(View.INVISIBLE);
                binding.tvToolbar.setText(R.string.lablocation);
                binding.ivNotification.setVisibility(View.INVISIBLE);

                binding.bottombar.ivHome.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivLocation.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_Selection));
                binding.bottombar.ivReports.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivCart.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivAccount.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));

                binding.bottombar.tvHome.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvLocation.setTextColor(getResources().getColor(R.color.bottom_Selection));
                binding.bottombar.tvReports.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvCart.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvAccount.setTextColor(getResources().getColor(R.color.bottom_unSelection));



                LocationFragment location = new LocationFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main,location).commit();

            }
        });

        binding.bottombar.lReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.ivBackarrow.setVisibility(View.INVISIBLE);
                binding.tvToolbar.setText(R.string.myreports);
                binding.ivNotification.setVisibility(View.INVISIBLE);

                binding.bottombar.ivHome.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivLocation.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivReports.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_Selection));
                binding.bottombar.ivCart.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivAccount.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));

                binding.bottombar.tvHome.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvLocation.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvReports.setTextColor(getResources().getColor(R.color.bottom_Selection));
                binding.bottombar.tvCart.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvAccount.setTextColor(getResources().getColor(R.color.bottom_unSelection));


                ReportFragment report = new ReportFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main,report).commit();

            }
        });

        binding.bottombar.lCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.ivBackarrow.setVisibility(View.INVISIBLE);
                binding.tvToolbar.setText(R.string.cart);
                binding.ivNotification.setVisibility(View.VISIBLE);
                binding.ivNotification.setImageResource(R.drawable.ic_refresh);

                binding.bottombar.ivHome.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivLocation.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivReports.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivCart.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_Selection));
                binding.bottombar.ivAccount.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));

                binding.bottombar.tvHome.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvLocation.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvReports.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvCart.setTextColor(getResources().getColor(R.color.bottom_Selection));
                binding.bottombar.tvAccount.setTextColor(getResources().getColor(R.color.bottom_unSelection));

                CartFragment cart = new CartFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main,cart).commit();

            }
        });

        binding.bottombar.lAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.ivBackarrow.setVisibility(View.INVISIBLE);
                binding.tvToolbar.setText(R.string.account);
                binding.ivNotification.setVisibility(View.INVISIBLE);

                binding.bottombar.ivHome.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivLocation.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivReports.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivCart.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_unSelection));
                binding.bottombar.ivAccount.setColorFilter(ContextCompat.getColor(context,R.color.bottom_ic_Selection));

                binding.bottombar.tvHome.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvLocation.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvReports.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvCart.setTextColor(getResources().getColor(R.color.bottom_unSelection));
                binding.bottombar.tvAccount.setTextColor(getResources().getColor(R.color.bottom_Selection));
                
                AccountFragment account = new AccountFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main,account).commit();


            }
        });

    }
}