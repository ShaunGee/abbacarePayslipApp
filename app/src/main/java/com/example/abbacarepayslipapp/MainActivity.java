package com.example.abbacarepayslipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void todayButton(View view) {
        Intent todayIntent = new Intent(this, ShiftDataEntry.class);
        startActivity(todayIntent);
    }

    public void thisFortnightButton(View view) {

        Intent thisFortnightIntent = new Intent(this, CurrentFortnight.class);
        startActivity(thisFortnightIntent);

    }

}