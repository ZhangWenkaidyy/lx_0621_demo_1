package com.kevin.zwk.lx_0621_demo_1;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrUIHandler;
import in.srain.cube.views.ptr.indicator.PtrIndicator;

/**
 * Created by zhonghang on 16/6/21.
 */

public class MyHeaderView extends RelativeLayout implements PtrUIHandler {
    public MyHeaderView(Context context) {
        super(context);
    }

    public MyHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyHeaderView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onUIReset(PtrFrameLayout frame) {

    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {

    }

    private ImageView imageView;
    private ObjectAnimator animator;

    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {
        imageView = (ImageView) findViewById(R.id.imageview);
        animator = ObjectAnimator.ofFloat(imageView, "rotationX", 0, 720).setDuration(3000);
        animator.start();
    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame) {

    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator) {

    }
}
