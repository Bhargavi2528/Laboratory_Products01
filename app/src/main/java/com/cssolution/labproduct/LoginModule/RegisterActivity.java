package com.cssolution.labproduct.LoginModule;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.cssolution.labproduct.LoginModule.Model.RegisterModel;
import com.cssolution.labproduct.R;
import com.cssolution.labproduct.Util.ProgressHubKt;
import com.cssolution.labproduct.Util.WebApiClient;
import com.cssolution.labproduct.databinding.ActivityRegisterBinding;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;
    RegisterActivity context = RegisterActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        binding = DataBindingUtil.setContentView(context, R.layout.activity_register);

        onclick();

    }

    private void onclick() {

        binding.tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "onclick", Toast.LENGTH_SHORT).show();
                SignUp();
//                if(binding.edtName.equals("") && binding.edtEmail.equals("") && binding.edtNumber.equals("") && binding.edtPassword.equals(""))
//                {
//                    Toast.makeText(context, "Please Enter Valid Credentials.", Toast.LENGTH_SHORT).show();
//                }else {
//                    signup();
//                }

            }
        });

    }
    public static boolean isInternetAvailable(Context context) {
        if (context != null) {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            // test for connection
            if (cm.getActiveNetworkInfo() != null
                    && cm.getActiveNetworkInfo().isAvailable()
                    && cm.getActiveNetworkInfo().isConnected()) {
                return true;
            } else {
                return false;
            }
        } else return false;
    }
    private void SignUp() {
        if (isInternetAvailable(context)){
            ProgressHubKt.showLoader(context);
            WebApiClient.getInstance().SignUp(binding.edtName.getText().toString(),
                    binding.edtName.getText().toString(),
                    binding.edtEmail.getText().toString(),
                    binding.edtNumber.getText().toString(),
                    "rajkot",
                    binding.edtPassword.getText().toString()).enqueue(new Callback<RegisterModel>() {
                @Override
                public void onResponse(Call<RegisterModel> call, Response<RegisterModel> response) {
                    ProgressHubKt.dismissLoader();
                    if (response.body().status==1){
                        Toast.makeText(context, response.body().msg, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Toast.makeText(context, ""+response.body().msg, Toast.LENGTH_SHORT).show();
                    }


                }

                @Override
                public void onFailure(Call<RegisterModel> call, Throwable t) {

                    Toast.makeText(context, t.toString(), Toast.LENGTH_SHORT).show();

                }
            });
        }else {
            Toast.makeText(context, "Please Check Your Internet.", Toast.LENGTH_SHORT).show();
        }
    }

    private Map<String, String> param() {
        Map<String, String> params = new HashMap<>();
        params.put("FullName", binding.edtName.getText().toString());
        params.put("Email", binding.edtEmail.getText().toString());
        params.put("PhNo", binding.edtNumber.getText().toString());
        params.put("Password", binding.edtPassword.getText().toString());
        params.put("CountryCode", "+1");
        params.put("DeviceType", "A");
        params.put("DeviceId", "1234");
        Log.d("param", params.toString());
        return params;
    }

}