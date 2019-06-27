package com.example.sportsapp;
import com.example.sportsapp.data.model.Sports;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {
    //Specify the request type and pass the relative URL//
    @GET("/api/sport/")
    //Wrap the response in a Call object with the type of the expected result//
    Call<Sports> getAllSports();

//    @FormUrlEncoded
//    @POST("api/login")
//    Call<ResponseBody> userRegister(
//            @Field("name") String name,
//            @Field("password") String password,
//            @Field("email") String email
//    );
}
