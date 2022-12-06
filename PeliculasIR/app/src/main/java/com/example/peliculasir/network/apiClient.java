package com.example.peliculasir.network;

import java.lang.reflect.GenericSignatureFormatError;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiClient {
    private static Retrofit retrofit;
    private static Retrofit getClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
