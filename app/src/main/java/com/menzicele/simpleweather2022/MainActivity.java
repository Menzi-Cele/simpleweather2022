package com.menzicele.simpleweather2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "AccuweatherURL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        URL accuweatherURL = NetworkUtil.buildURL();
        Log.i(TAG, "onCreate: " + accuweatherURL);
    }
}