package com.example.myapplication.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    public static final String MAIN_URL = "https://criccoach.digitalfiroz.com/";
    public static final String BASE_URL = MAIN_URL + "appapi/";
    public static final String IMG = MAIN_URL + "upload/category/";

    private static Retrofit retrofit = null;

    public static ApiInterface getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        ApiInterface api = retrofit.create(ApiInterface.class);
        return api; // return the APIInterface object
    }
}
