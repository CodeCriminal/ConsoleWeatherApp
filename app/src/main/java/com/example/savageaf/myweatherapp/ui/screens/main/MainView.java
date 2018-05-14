package com.example.savageaf.myweatherapp.ui.screens.main;

import com.example.savageaf.myweatherapp.data.model.WeatherResponse;
import com.example.savageaf.myweatherapp.ui.BaseView;

/**
 * Created by Savage AF on 21.04.2018.
 */

public interface MainView extends BaseView {
    void getCurrentWeather(WeatherResponse weatherResponse);
}
