package com.leo.opengldemo.glsurfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.leo.opengldemo.glrenderer.TedGLRenderer;

/**
 * Created by Leo on 2016/4/11.
 */
public class TedGLSurfaceView extends GLSurfaceView {
    TedGLRenderer tedGLRenderer;

    public TedGLSurfaceView(Context context) {
        super(context);
        tedGLRenderer = new TedGLRenderer();
        setRenderer(tedGLRenderer);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
