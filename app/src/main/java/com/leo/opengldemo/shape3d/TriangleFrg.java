package com.leo.opengldemo.shape3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
