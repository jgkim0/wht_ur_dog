package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QfourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qfour);
    }

    public void onClick41(View v) {
        Intent intent = new Intent(this, QfiveActivity.class);
        startActivity(intent);
    }

    public void onClick42(View v) {
        Intent intent = new Intent(this, QfiveActivity.class);
        startActivity(intent);
    }
}