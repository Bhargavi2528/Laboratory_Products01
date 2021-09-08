package com.cssolution.labproduct.DashboardModule.frgement;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cssolution.labproduct.DashboardModule.activity.ContactusActivity;
import com.cssolution.labproduct.DashboardModule.activity.EditProfileActivity;
import com.cssolution.labproduct.DashboardModule.activity.MyAddressActivity;
import com.cssolution.labproduct.DashboardModule.activity.MyFamilyActivity;
import com.cssolution.labproduct.DashboardModule.activity.MyOrderActivity;
import com.cssolution.labproduct.DashboardModule.activity.NotificationActivity;
import com.cssolution.labproduct.DashboardModule.activity.RefundPolicyActivity;
import com.cssolution.labproduct.LoginModule.LoginActivity;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.FragmentAccountBinding;

public class AccountFragment extends Fragment {

    FragmentAccountBinding binding;
//    AccountFragment context = getActivity();
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_account, container, false);

        onclick();

        return binding.getRoot();

    }

    private void onclick()
    {

        binding.ivProfileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), EditProfileActivity.class));

            }
        });

        binding.lMyorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), MyOrderActivity.class));

            }
        });

        binding.lMyfamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), MyFamilyActivity.class));

            }
        });

        binding.lMyaddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), MyAddressActivity.class));

            }
        });

        binding.lNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), NotificationActivity.class));

            }
        });

        binding.lChangecity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Change City", Toast.LENGTH_SHORT).show();

            }
        });

        binding.lContactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), ContactusActivity.class));

            }
        });

        binding.lRefundpolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), RefundPolicyActivity.class));

            }
        });

        binding.lLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), LoginActivity.class));

            }
        });

    }
}