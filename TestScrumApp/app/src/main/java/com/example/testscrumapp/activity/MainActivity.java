package com.example.testscrumapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.testscrumapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInstClick(View view) {

      //  startActivity(new Intent(MainActivity.this , InstractionActivity.class));
    }

    public void onStartClick(View view) {
        startActivity(new Intent(MainActivity.this , InstractionActivity.class));
    }
}
