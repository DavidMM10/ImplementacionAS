package com.example.reconocimiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void toDetectionActivity(View v)
    {
        Intent intent = new Intent(this, DetectionActivity.class);
        startActivity(intent);
        return;

    }

    public void toRecognitionActivity(View v)
    {
        Intent intent = new Intent(this, RecognitionActivity.class);
        startActivity(intent);
        return;

    }
}
