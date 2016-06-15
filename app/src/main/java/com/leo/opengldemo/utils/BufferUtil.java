package com.leo.opengldemo.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/**
 * Created by Leo on 2016/6/15.
 */
public class BufferUtil {
    public static FloatBuffer float2Buffer(float[] a) {
        FloatBuffer floatBuffer;
        ByteBuffer bb = ByteBuffer.allocateDirect(a.length * 4);
        bb.order(ByteOrder.nativeOrder());
        floatBuffer = bb.asFloatBuffer();
        floatBuffer.put(a);
        floatBuffer.position(0);
        return floatBuffer;
    }
}
