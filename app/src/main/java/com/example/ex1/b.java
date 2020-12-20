package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText ed1;
        final TextView tv1;
        Button b1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        b1=findViewById(R.id.b1);
        ed1=findViewById(R.id.ed1);
        tv1=findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=ed1.getText().toString();
                tv1.setText("HELLO  "+s1);
                Toast.makeText(getApplicationContext(),"HELLO  "+s1,Toast.LENGTH_SHORT).show();
            }
        });
    }

}