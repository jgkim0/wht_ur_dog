package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QthreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qthree);
    }

    public void onClick31(View v) {
        Intent intent = new Intent(this, QfourActivity.class);
        startActivity(intent);
    }

    public void onClick32(View v) {
        Intent intent = new Intent(this, QfourActivity.class);
        startActivity(intent);
    }

    public void onClick33(View v) {
        Intent intent = new Intent(this, QfourActivity.class);
        startActivity(intent);
    }

    public void onClick34(View v) {
        Intent intent = new Intent(this, QfourActivity.class);
        startActivity(intent);
    }
}