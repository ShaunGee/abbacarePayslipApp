package com.example.abbacarepayslipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShiftDataEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_data_entry);
    }


    public void nextButton(View view) {

        Intent reviewIntent = new Intent(this, ReviewShift.class);
        startActivity(reviewIntent);

    }

}
