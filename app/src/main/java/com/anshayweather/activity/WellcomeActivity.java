package com.anshayweather.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anshayweather.R;

import java.util.Timer;
import java.util.TimerTask;

public class WellcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(WellcomeActivity.this, ChooseAreaActivity.class);
                startActivity(intent);
                finish();
            }
        },1000);
    }
}
