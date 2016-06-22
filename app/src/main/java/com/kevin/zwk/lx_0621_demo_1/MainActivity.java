package com.kevin.zwk.lx_0621_demo_1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mContext = this;
    private Intent intent;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5= (Button) findViewById(R.id.button_5);
        button_6= (Button) findViewById(R.id.button_6);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);

    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                Toast.makeText(mContext, "---------", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setClass(mContext, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.button_2:
                intent = new Intent();
                intent.setClass(mContext, Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.button_3:
                intent = new Intent();
                intent.setClass(mContext, Main22Activity.class);
                startActivity(intent);
                break;
            case R.id.button_4:
                intent = new Intent();
                intent.setClass(mContext, Main23Activity.class);
                startActivity(intent);
                break;
            case R.id.button_5:
                intent = new Intent();
                intent.setClass(mContext, Main24Activity.class);
                startActivity(intent);
                break;
            case R.id.button_6:
                intent = new Intent();
                intent.setClass(mContext, Main25Activity.class);
                startActivity(intent);
                break;
        }
    }
}
