package com.example.covidtracer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView totalConfirm;
    private TextView totalActive;
    private TextView totalRecovered;
    private TextView totalDeath;
    private TextView totalTests;
    private TextView todayConfirm;
    private TextView todayRecovered;
    private TextView todayDeath;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }


    private void init() {
        totalConfirm = findViewById(R.id.totalConfirm);
        totalActive = findViewById(R.id.totalActive);
        totalRecovered = findViewById(R.id.totalRecovered);
        totalDeath = findViewById(R.id.totalDeath);
        todayConfirm = findViewById(R.id.todayConfirm);
        todayRecovered = findViewById(R.id.todayRecovered);
        todayDeath = findViewById(R.id.todayDeath);
    }
}