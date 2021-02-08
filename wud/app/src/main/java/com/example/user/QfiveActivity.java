package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QfiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qfive);
    }

    public void onClick51(View v) {
        Intent intent = new Intent(this, QsixActivity.class);
        startActivity(intent);
    }

    public void onClick52(View v) {
        Intent intent = new Intent(this, QsixActivity.class);
        startActivity(intent);
    }
}