package com.anshayweather.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anshayweather.R;
import com.anshayweather.gson.Weather;

public class ChooseAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather",null)!=null) {
            //如果之前有缓存，就不用让用户选择城市，直接跳到WeatherActivity。
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();

        }
    }
}
