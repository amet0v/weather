package com.ametov.service;

import com.ametov.core.DTO.CurrentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("/v1/current.json?key=89f6928f1aa24906b8f103949241811&aqi=yes")
    Call<CurrentResponse> currentResponse(@Query("q") String city);

//    @GET("/v1/current.json")
//    Call<CurrentResponse> currentResponse(
//            @Query("key") String apiKey,
//            @Query("q") String city,
//            @Query("aqi") String aqi
//    );
}
