package com.example.savageaf.myweatherapp.data.net;

/**
 * Created by Savage AF on 21.04.2018.
 */


import android.support.annotation.NonNull;

import com.example.savageaf.myweatherapp.BuildConfig;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class NetManager {

    private static final String TAG = NetManager.class.getSimpleName();

    /**
     * Instance RetrofitManager's
     *
     * @return {@link NetManager}
     */
    public static NetManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new NetManager();
        }
        return ourInstance;
    }

    private static NetManager ourInstance;

    private NetManager() {

    }

    /**
     * @return {@link RestApi} interface with endpoints
     */
    public RestApi getRestApi() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.SERVER_URL)
                .client(initClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(RestApi.class);
    }

    private OkHttpClient initClient() {
        final HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder()
                .addNetworkInterceptor(interceptor)
                .addNetworkInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(@NonNull final Chain chain) throws IOException {
                        Request request;
                        Request original = chain.request();
                        Request.Builder requestBuilder = original.newBuilder()
                                .addHeader("Content-Type", "application/json")
                                .addHeader("x-api-key", "3962b5d0dab0fe6bed517708ff542c44");
                        request = requestBuilder.build();
                        return chain.proceed(request);
                    }
                })
                .build();
    }
}