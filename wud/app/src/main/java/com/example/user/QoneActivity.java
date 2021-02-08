package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class QoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qone);
    }

    public void onClick11(View v) {
        Intent intent = new Intent(this, QtwoActivity.class);
        startActivity(intent);
    }

    public void onClick12(View v) {
        Intent intent = new Intent(this, QtwoActivity.class);
        startActivity(intent);
    }

    public void onClick13(View v) {
        Intent intent = new Intent(this, QtwoActivity.class);
        startActivity(intent);
    }

    public void onClick14(View v) {
        Intent intent = new Intent(this, QtwoActivity.class);
        startActivity(intent);
    }
}