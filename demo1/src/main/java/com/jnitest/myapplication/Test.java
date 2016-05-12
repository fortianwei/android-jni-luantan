package com.jnitest.myapplication;

public class Test {
    static {
        System.loadLibrary("test");
    }
    public native String getNativeString();
}