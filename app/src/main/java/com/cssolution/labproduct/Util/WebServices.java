package com.cssolution.labproduct.Util;



import com.cssolution.labproduct.LoginModule.Model.RegisterModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface WebServices {
    @FormUrlEncoded
    @POST(ApiKeys.SignUp)
    Call<RegisterModel> SignUp(@Field ("first_name") String first_name,
                               @Field ("last_name") String last_name,
                               @Field ("email") String email,
                               @Field ("mobile_number") String mobile_number,
                               @Field ("city") String city,
                               @Field ("password") String password);

}
