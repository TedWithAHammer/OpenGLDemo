package com.leo.opengldemo.fragment;

import android.os.Bundle;

import com.leo.opengldemo.R;

/**
 * Created by Leo on 2016/4/11.
 */
public class TriangleFrg extends BaseShapeFrg {

    public static TriangleFrg newInstance(Bundle arg) {
        TriangleFrg frg = new TriangleFrg();
        if (arg != null) {
            frg.setArguments(arg);
        }
        return frg;
    }


    @Override
    int inflateContentView() {
        return R.layout.fragment_triangle;
    }


}
