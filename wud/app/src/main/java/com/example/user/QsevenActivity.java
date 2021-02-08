package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QsevenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qseven);
    }

    public void onClick71(View v) {
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }

    public void onClick72(View v) {
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }

    public void onClick73(View v) {
        Intent intent = new Intent(this, FinalActivity.class);
        startActivity(intent);
    }
}