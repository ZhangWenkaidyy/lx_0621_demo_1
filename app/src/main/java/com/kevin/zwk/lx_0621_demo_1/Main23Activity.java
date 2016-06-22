package com.kevin.zwk.lx_0621_demo_1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.header.MaterialHeader;

public class Main23Activity extends AppCompatActivity {
private PtrFrameLayout ptrFrameLayout_material;
    private Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        ptrFrameLayout_material= (PtrFrameLayout) findViewById(R.id.ptrFrameLayout_material);
//创建Material样式的刷新头部
        MaterialHeader materialHeader=new MaterialHeader(this);

 //设置头部颜色的变化
        materialHeader.setColorSchemeColors(new int[]{R.color.colorAccent, R.color.colorPrimary, R.color.colorPrimaryDark});

//设置头部的宽高的测量方式
       materialHeader.setLayoutParams(new PtrFrameLayout.LayoutParams(-1, -2));
     //   header.setPadding(0, LocalDisplay.dp2px(15), 0, LocalDisplay.dp2px(10));

        //设置header中的下拉控件
        materialHeader.setPtrFrameLayout(ptrFrameLayout_material);


        //刷新最短时间
        ptrFrameLayout_material.setLoadingMinTime(1000);
        //头部收起的动画时长
        ptrFrameLayout_material.setDurationToCloseHeader(1500);
        //设置头部
        ptrFrameLayout_material.setHeaderView(materialHeader);
        //根据下拉刷新的状态更新头部内容
        ptrFrameLayout_material.addPtrUIHandler(materialHeader);

        ptrFrameLayout_material.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ptrFrameLayout_material.refreshComplete();
                    }
                }, 3000);
            }
        });
    }
}
