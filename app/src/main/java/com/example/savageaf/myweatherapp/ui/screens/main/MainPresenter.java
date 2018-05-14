package com.example.savageaf.myweatherapp.ui.screens.main;

import com.example.savageaf.myweatherapp.ui.BasePresenter;
import com.example.savageaf.myweatherapp.ui.BaseView;

/**
 * Created by Savage AF on 21.04.2018.
 */
    /*
    Т - не типизированный параметр( загуглить)
     */
public interface MainPresenter <T extends BaseView> extends BasePresenter<T>{
    void getCurrentWeather();
}
