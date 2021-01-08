package com.example.androidjokelib;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.javajokelibrary.JokeJavaLib;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent i = getIntent();
        String joke =   i.getStringExtra("result");




        TextView text = findViewById(R.id.java_lib_joke);

        text.setText(joke);
    }
}