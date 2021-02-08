package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QsixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qsix);
    }

    public void onClick61(View v) {
        Intent intent = new Intent(this, QsevenActivity.class);
        startActivity(intent);
    }

    public void onClick62(View v) {
        Intent intent = new Intent(this, QsevenActivity.class);
        startActivity(intent);
    }

    public void onClick63(View v) {
        Intent intent = new Intent(this, QsevenActivity.class);
        startActivity(intent);
    }
}