package com.ametov.service;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class WeatherService {
    private final Retrofit retrofit;
    private static WeatherService instance;
    private static final String baseUrl="https://api.weatherapi.com";

    public WeatherService(){
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static WeatherService getInstance(){
        if(instance == null) {
            instance = new WeatherService();
        }
        return instance;
    }

    public WeatherApi api(){
        return retrofit.create(WeatherApi.class);
    }
}
