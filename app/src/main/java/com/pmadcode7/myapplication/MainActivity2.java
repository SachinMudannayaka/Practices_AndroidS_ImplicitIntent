package com.pmadcode7.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button B1;
TextView Na,Ag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Na.findViewById(R.id.textView2);
        Ag.findViewById(R.id.textView3);

        Intent i=getIntent();
        B1=findViewById(R.id.button2);
        String name=i.getStringExtra("Name");
        int age=i.getIntExtra("Age",0);

        Na.setText(name);
        Ag.setText(String.valueOf(age));




    }
}