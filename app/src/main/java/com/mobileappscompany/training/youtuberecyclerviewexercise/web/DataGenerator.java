package com.mobileappscompany.training.youtuberecyclerviewexercise.web;

import com.google.gson.Gson;
import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Data;
import com.mobileappscompany.training.youtuberecyclerviewexercise.domain.youtube.Response;

import java.io.Reader;

/**
 * A singleton object that accepts a Reader and returns a Data object from the
 * JSon string provided in the Reader.
 *
 * Created by Android1 on 4/21/2015.
 */
public enum DataGenerator {
    INSTANCE;

    private Gson gson;

    private DataGenerator() {
        gson = new Gson();
    }

    public Data generate(Reader reader) {
        return gson.fromJson(reader,Response.class).getData();
    }
}
