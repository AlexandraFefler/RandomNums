package com.example.randomnums;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1-id in xml

    //2
    TextView tv1;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3
        tv1=findViewById(R.id.tvFirst);// קישור בין המשתנים
        //tv1.setText("Hello word");

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);

    }


    public void go09(View view) {
        if(view==b1)
        {
            int num=(int)((9-0+1)*Math.random())+0;

            tv1.setText(num+"");
        }

        if(view==b2)
        {
            int num=(int)((99-10+1)*Math.random())+10;

            tv1.setText(num+"");

        }
        if(view==b3)
        {
            int num=(int)((999-100+1)*Math.random())+100;

            tv1.setText(num+"");

        }


    }

    // public void go1099(View view)
}