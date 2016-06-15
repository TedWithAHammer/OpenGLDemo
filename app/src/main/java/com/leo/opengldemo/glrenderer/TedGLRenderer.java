package com.leo.opengldemo.glrenderer;

import android.opengl.GLSurfaceView;

import com.leo.opengldemo.utils.BufferUtil;

import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Leo on 2016/4/11.
 */
public class TedGLRenderer implements GLSurfaceView.Renderer {
    float[] triangleArray = {
            0f, 1f, 0f,
            -1f, -1f, 0f,
            1f, -1f, 0f
    };

    FloatBuffer triangleBuffer;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        triangleBuffer= BufferUtil.float2Buffer(triangleArray);
        gl.glShadeModel(GL10.GL_SMOOTH);

        gl.glClearColor(0f, 0f, 0f, 0f);

        gl.glClearDepthf(1.0f);

        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);

        gl.glEnable(GL10.GL_DEPTH_TEST);

        gl.glDepthFunc(GL10.GL_LEQUAL);

        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glColor4f(1.0f,0f,0f,1.0f);
        gl.glVertexPointer(3,GL10.GL_FLOAT,0,triangleBuffer);
        gl.glDrawArrays(GL10.GL_TRIANGLES,0,3);
    }
}
