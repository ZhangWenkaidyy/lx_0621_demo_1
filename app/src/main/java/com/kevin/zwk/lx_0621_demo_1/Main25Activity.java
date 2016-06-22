package com.kevin.zwk.lx_0621_demo_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import uk.co.senab.photoview.PhotoView;

public class Main25Activity extends AppCompatActivity {
private LinearLayout linearLayout;
    private PhotoView photoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        photoView= (PhotoView) findViewById(R.id.photoview);
        linearLayout= (LinearLayout) findViewById(R.id.linearLayout);
        photoView=new PhotoView(this);
        photoView.setImageResource(R.drawable.zwk);

        setContentView(photoView);

        photoView.setRotationBy(10);


    }
}
