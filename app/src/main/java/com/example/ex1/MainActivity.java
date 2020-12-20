package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        Button b1,b2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.a);
        b2=findViewById(R.id.b);

     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(MainActivity.this,a.class);
             startActivity(i);
         }
     });
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i=new Intent(MainActivity.this,b.class);
             startActivity(i);

         }
     });

    }
}