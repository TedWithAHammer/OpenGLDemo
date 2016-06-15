package com.leo.opengldemo.fragment;

import android.os.Bundle;
import android.view.View;

import com.leo.opengldemo.R;
import com.leo.opengldemo.glsurfaceview.TedGLSurfaceView;

/**
 * Created by Leo on 2016/4/11.
 */
public class TriangleFragment extends BaseShapeFragment {
    TedGLSurfaceView glSurfaceView;

    public static TriangleFragment newInstance(Bundle arg) {
        TriangleFragment frg = new TriangleFragment();
        if (arg != null) {
            frg.setArguments(arg);
        }
        return frg;
    }


    @Override
    int inflateRootViewById() {
        return R.layout.fragment_triangle;
    }

    @Override
    void initData() {

    }

    @Override
    void initView(View v) {
    }

    @Override
    View inflateRootView() {
        glSurfaceView=new TedGLSurfaceView(getActivity());
        return glSurfaceView;
    }
}
