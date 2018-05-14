package com.example.savageaf.myweatherapp.ui.screens;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.savageaf.myweatherapp.ui.BasePresenter;
import com.example.savageaf.myweatherapp.ui.BaseView;

/**
 * Created by Savage AF on 21.04.2018.
 */

public class BaseActivity <T extends BasePresenter, V extends BaseView> extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
