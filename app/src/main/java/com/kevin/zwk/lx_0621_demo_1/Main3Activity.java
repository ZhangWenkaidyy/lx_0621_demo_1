package com.kevin.zwk.lx_0621_demo_1;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;

public class Main3Activity extends AppCompatActivity {
    private PtrClassicFrameLayout ptrClassicFrameLayout;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ptrClassicFrameLayout = (PtrClassicFrameLayout) findViewById(R.id.ptrClassicFrameLayout);
        //下拉刷新的监听,下拉刷新和listview以及ScrollView事件冲突在PtrDefaultHandler中已经解决
        ptrClassicFrameLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        ptrClassicFrameLayout.refreshComplete();
                    }
                }, 3000);
            }
        });
        //刷新时界面不动
        //ptrClassicFrameLayout.setPinContent(true);

        //阻尼系数
        // ptrClassicFrameLayout.setResistance(1.7f);

        //设置触发刷新的位置
        // ptrClassicFrameLayout.setRatioOfHeaderHeightToRefresh(1.0f);

        //回弹到头部的时间
        // ptrClassicFrameLayout.setDurationToClose(200);

        // 头部收起的时间
        // ptrClassicFrameLayout.setDurationToCloseHeader(1000);
//取消头部的显示
        //ptrClassicFrameLayout.setPullToRefresh(false);
//刷新时保持头部
       // ptrClassicFrameLayout.setKeepHeaderWhenRefresh(true);

    }
}
