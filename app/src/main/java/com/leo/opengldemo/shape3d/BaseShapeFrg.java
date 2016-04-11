package com.leo.opengldemo.shape3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Leo on 2016/4/11.
 */
public abstract class BaseShapeFrg extends Fragment {

    public View getRootView() {
        return rootView;
    }

    View rootView;


    public void launchAct(Bundle params, Class<? extends Activity> toAct) {
        Intent intent = new Intent(getActivity(), toAct);
        intent.putExtra("params", params);
        startActivity(intent);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(inflateContentView(), null);
        return rootView;
    }

    abstract int inflateContentView();
}
