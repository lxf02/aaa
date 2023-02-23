package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     private TextView tv;private Button cs,qy,jy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv=findViewById(R.id.tv);
         qy=findViewById(R.id.qy);
         jy=findViewById(R.id.jy);
         cs=findViewById(R.id.cs);
         qy.setOnClickListener(this);
         jy.setOnClickListener(this);
         cs.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if(v.getId()==R.id.cs){
        tv.setText(((Button)v).getText());
        }else if(v.getId()==R.id.qy){
            cs.setEnabled(true);
        }else if(v.getId()==R.id.jy){
            cs.setEnabled(false);
        }
    }
}