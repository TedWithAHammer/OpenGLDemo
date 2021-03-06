package com.leo.opengldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.leo.opengldemo.fragment.TriangleFragment;

public class OpenGLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_gl);
        inflateFragment();
    }

    private void inflateFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, TriangleFragment.newInstance(null)).commit();
    }
}
