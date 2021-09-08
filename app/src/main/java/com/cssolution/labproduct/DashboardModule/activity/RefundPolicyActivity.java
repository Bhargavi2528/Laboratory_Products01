package com.cssolution.labproduct.DashboardModule.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.cssolution.labproduct.DashboardModule.frgement.AccountFragment;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.databinding.ActivityRefundPolicyBinding;

public class RefundPolicyActivity extends AppCompatActivity {

    ActivityRefundPolicyBinding binding;
    RefundPolicyActivity context = RefundPolicyActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refund_policy);

        binding= DataBindingUtil.setContentView(context,R.layout.activity_refund_policy);

        if (savedInstanceState == null) {

            binding.toolbar.ivBackarrow.setVisibility(View.VISIBLE);
            binding.toolbar.ivNotification.setVisibility(View.INVISIBLE);
            binding.toolbar.tvToolbar.setText(R.string.refundpolicy);

        }

        onclick();

    }

    private void onclick() {

        binding.toolbar.ivBackarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                binding.toolbar.ivBackarrow.setVisibility(View.VISIBLE);
//                binding.toolbar.tvToolbar.setText(R.string.account);
//                binding.toolbar.ivNotification.setVisibility(View.INVISIBLE);

                AccountFragment account = new AccountFragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main,account).commit();

            }
        });

    }
}