package com.cssolution.labproduct.DashboardModule.frgement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cssolution.labproduct.DashboardModule.activity.BookTestActivity;
import com.cssolution.labproduct.DashboardModule.activity.CommonTabActivity;
import com.cssolution.labproduct.DashboardModule.activity.PackageActivity;
import com.cssolution.labproduct.DashboardModule.activity.PackageDetailsActivity;
import com.cssolution.labproduct.DashboardModule.activity.UploadPrescriptionActivity;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.FragmentAccountBinding;
import com.cssolution.labproduct.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        v = inflater.inflate(R.layout.fragment_home, container, false);

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);

        onclick();

        return binding.getRoot();
    }

    private void onclick() {

        binding.lSearchBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), BookTestActivity.class));
            }
        });

        binding.lUploadpriscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), UploadPrescriptionActivity.class));
            }
        });

        binding.rlGrid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PackageDetailsActivity.class));
            }
        });
        binding.rlGrid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PackageDetailsActivity.class));
            }
        });
        binding.rlGrid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PackageDetailsActivity.class));
            }
        });
        binding.rlGrid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PackageDetailsActivity.class));
            }
        });
        binding.lOffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PackageDetailsActivity.class));
            }
        });
        binding.lpackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PackageActivity.class));
            }
        });

        binding.lLiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Liver");
                startActivity(i);
            }
        });
        binding.lKidney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Kidney");
                startActivity(i);
            }
        });
        binding.lBone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Bone");
                startActivity(i);
            }
        });
        binding.lVitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Vitamin");
                startActivity(i);
            }
        });
        binding.lDiabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Diabetes");
                startActivity(i);
            }
        });


        binding.lSmoking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Smoking");
                startActivity(i);
            }
        });
        binding.lAlcohol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Alchohol");
                startActivity(i);
            }
        });
        binding.lDrugaddiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Drug");
                startActivity(i);
            }
        });
        binding.lNoexercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "No Exercise");
                startActivity(i);
            }
        });
        binding.lJunkfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CommonTabActivity.class);
                i.putExtra("Title", "Junk Food");
                startActivity(i);
            }
        });

    }
}