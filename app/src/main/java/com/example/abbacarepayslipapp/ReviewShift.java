package com.example.abbacarepayslipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReviewShift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_shift);

    }

    public void saveButton(View view) {

        Intent mainMenuIntent = new Intent(this, MainActivity.class);
        startActivity(mainMenuIntent);

    }
}
