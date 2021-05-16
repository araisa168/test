package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String g="";
    }

    @Override
    protected void onStart() {
        super.onStart();
        String s="1";
    }

    @Override
    protected void onStop() {
        super.onStop();
        String s="1";
    }
}