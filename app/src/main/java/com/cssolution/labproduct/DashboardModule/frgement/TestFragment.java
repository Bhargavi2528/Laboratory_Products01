package com.cssolution.labproduct.DashboardModule.frgement;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cssolution.labproduct.DashboardModule.activity.TestCommonActivity;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.FragmentTestBinding;

public class TestFragment extends Fragment {

    FragmentTestBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false);

        onclick();

        return binding.getRoot();
    }

    private void onclick()
    {

        binding.tvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), TestCommonActivity.class));

            }
        });

    }
}