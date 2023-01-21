package com.pmadcode7.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button1);

       // final Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
       // String name="Sachin";
       // int age=23;
       // intent.putExtra("Name",name);
       // intent.putExtra("Age",age);

        Intent intent=new Intent(Intent.ACTION_SEND);
        Intent chooser;
        intent.setData(Uri.parse("mailto"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"someone@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"This is your test subject");
        intent.putExtra(Intent.EXTRA_TEXT,"This is the TEST");
        intent.setType("text/plain");
        chooser= Intent.createChooser(intent,"SEND EMAL VIA ");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(chooser);
            }
        });

    }
}