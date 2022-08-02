package com.menzicele.simpleweather2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "AccuweatherURL";
    Fragment FiveDayWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FiveDayWeather = new Fragment();

        URL accuweatherURL = NetworkUtil.buildURL();
        Log.i(TAG, "onCreate: " + accuweatherURL);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.weather_frame, FiveDayWeather);
        transaction.commit();
    }
}