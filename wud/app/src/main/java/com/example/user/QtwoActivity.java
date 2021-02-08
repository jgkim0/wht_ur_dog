package com.example.user;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QtwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qtwo);
    }

    public void onClick21(View v) {
        Intent intent = new Intent(this, QthreeActivity.class);
        startActivity(intent);
    }

    public void onClick22(View v) {
        Intent intent = new Intent(this, QthreeActivity.class);
        startActivity(intent);
    }
}