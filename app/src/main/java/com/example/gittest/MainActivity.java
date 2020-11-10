package com.example.gittest;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.gittest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setTvColor();
        setTvSize();
        //this v1.1.0 with bug
    }

    private void setTvColor(){
       binding.tvHelloWorld.setTextColor(Color.RED);
    }

    private void setTvSize(){
        binding.tvHelloWorld.setTextSize(20f);
    }
}