package com.example.dynamicmultitabs.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dynamicmultitabs.R;

public class Main2Activity extends AppCompatActivity {
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        num = getIntent().getIntExtra("Tabs_Num", 1);
        Toast.makeText(this, ""+num, Toast.LENGTH_SHORT).show();
    }
}
