package com.kevin.zwk.lx_0621_demo_1;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.header.StoreHouseHeader;

public class Main22Activity extends AppCompatActivity {
private PtrFrameLayout PtrFrameLayout_store_house;
    private Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        PtrFrameLayout_store_house= (PtrFrameLayout) findViewById(R.id.PtrFrameLayout_store_house);

        StoreHouseHeader storeHouseHeader=new StoreHouseHeader(this);
        storeHouseHeader.setTextColor(Color.RED);
        storeHouseHeader.initWithString("LOADING...");

        PtrFrameLayout_store_house.setHeaderView(storeHouseHeader);
        PtrFrameLayout_store_house.addPtrUIHandler(storeHouseHeader);


        PtrFrameLayout_store_house.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        PtrFrameLayout_store_house.refreshComplete();
                    }
                }, 3000);
            }
        });
    }
}
