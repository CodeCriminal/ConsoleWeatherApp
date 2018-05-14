package com.example.savageaf.myweatherapp.ui.screens.main;

import com.example.savageaf.myweatherapp.data.model.WeatherResponse;
import com.example.savageaf.myweatherapp.data.net.NetManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Savage AF on 21.04.2018.
 */

public class MainPresenterImpl implements MainPresenter <MainView> {
    private MainView mainView;

    @Override
    public void bindView(MainView view) {
        mainView = view;
    }

    @Override
    public void unbindView() {
    mainView = null;
    }

    @Override
    public void onDestroy() {
    mainView = null;
    }

    @Override
    public void getCurrentWeather() {
        Call<WeatherResponse> weatherResponseCall = NetManager.getInstance().getRestApi().getCurrentWeather();
        weatherResponseCall.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
            mainView.getCurrentWeather(response.body());
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
            }
        });
    }
}
