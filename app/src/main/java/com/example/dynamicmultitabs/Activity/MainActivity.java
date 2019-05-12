package com.example.dynamicmultitabs.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dynamicmultitabs.R;

public class MainActivity extends AppCompatActivity {
    EditText edNum;
    Button buGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum = findViewById(R.id.ed_num);
        buGo = findViewById(R.id.bu_go);
        buGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edNum.getText().toString().isEmpty()) {
                    Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                    intent.putExtra("Tabs_Num", Integer.parseInt(edNum.getText().toString()));
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Please Enter Num", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
