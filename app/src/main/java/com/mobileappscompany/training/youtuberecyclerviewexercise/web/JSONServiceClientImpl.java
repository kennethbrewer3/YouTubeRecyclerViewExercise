package com.mobileappscompany.training.youtuberecyclerviewexercise.web;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Android1 on 4/25/2015.
 */
public class JSONServiceClientImpl implements JSONServiceClient {

    private static JSONServiceClient instance;
    private static Context context;
    private static String url;

    private RequestQueue queue;
    private StringRequest stringRequest;
    private String jsonResponse;

    public JSONServiceClientImpl(final Context context, final String url) {
        this.context = context;
        this.url = url;

        queue = Volley.newRequestQueue(context);

        stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        jsonResponse = response;
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        jsonResponse = "Error: " + error.toString();
                    }
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    @Override
    public String getURL() {
        return url;
    }

    @Override
    public String getData() {
        return jsonResponse;
    }
}
