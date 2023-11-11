package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    String strTag="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(strTag,"onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(strTag,"onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(strTag,"onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(strTag,"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(strTag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(strTag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(strTag,"onDestroy");
    }
}