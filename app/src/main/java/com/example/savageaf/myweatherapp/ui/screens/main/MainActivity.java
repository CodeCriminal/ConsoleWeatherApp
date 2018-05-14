package com.example.savageaf.myweatherapp.ui.screens.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.savageaf.myweatherapp.R;
import com.example.savageaf.myweatherapp.data.model.WeatherResponse;
import com.example.savageaf.myweatherapp.databinding.ActivityMainWeatherBinding;
import com.example.savageaf.myweatherapp.ui.screens.BaseActivity;

public class MainActivity extends BaseActivity <MainPresenter , MainView> implements MainView {
    private MainPresenter mainPresenter;
    private ActivityMainWeatherBinding mainWeatherBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainWeatherBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_weather);
        mainPresenter = new MainPresenterImpl();
        mainPresenter.getCurrentWeather();
    }

    @Override
    public void getCurrentWeather(WeatherResponse weatherResponse) {
        Toast.makeText(this, weatherResponse.getName(), Toast.LENGTH_SHORT).show();
    }
}
