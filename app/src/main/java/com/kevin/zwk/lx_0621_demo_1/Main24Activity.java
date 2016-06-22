package com.kevin.zwk.lx_0621_demo_1;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;



import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

public class Main24Activity extends AppCompatActivity {
private PtrFrameLayout ptrFrameLayout_sun;
    private Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        ptrFrameLayout_sun= (PtrFrameLayout) findViewById(R.id.ptrFrameLayout_sun);
        RentalsSunHeaderView rentalsSunHeaderView=new RentalsSunHeaderView(this);
        rentalsSunHeaderView.setLayoutParams(new PtrFrameLayout.LayoutParams(-1, -2));

        rentalsSunHeaderView.setUp(ptrFrameLayout_sun);
        ptrFrameLayout_sun.setLoadingMinTime(1000);
        ptrFrameLayout_sun.setDurationToCloseHeader(1500);
        ptrFrameLayout_sun.setHeaderView(rentalsSunHeaderView);
        ptrFrameLayout_sun.addPtrUIHandler(rentalsSunHeaderView);

        ptrFrameLayout_sun.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ptrFrameLayout_sun.refreshComplete();
                    }
                }, 3000);
            }
        });

    }
}
