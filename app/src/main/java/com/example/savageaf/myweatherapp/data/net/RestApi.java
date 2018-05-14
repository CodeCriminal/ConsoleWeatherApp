package com.example.savageaf.myweatherapp.data.net;

import com.example.savageaf.myweatherapp.data.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Savage AF on 21.04.2018.
 */

public interface RestApi {
    @GET("weather?q=Kharkiv")
    Call<WeatherResponse> getCurrentWeather();
}
