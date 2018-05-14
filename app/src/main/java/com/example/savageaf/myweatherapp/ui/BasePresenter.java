package com.example.savageaf.myweatherapp.ui;

/**
 * Created by Savage AF on 21.04.2018.
 */

public interface BasePresenter<T extends BaseView> {

    void bindView(T view);

    void unbindView();

    void onDestroy();
}

