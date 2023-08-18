package com.example.cvc;

import static com.example.cvc.MainActivity.mCount;

import android.util.Log;

public class aaa {
    public static aaa ins = new aaa();

    public static int bbb = 123;

    public static void DGSD() {
        String s = "my" + "Class";
        bbb += 123;
        int result = ins.sum(2, 3);
        Log.d(s, String.format("thisisaaa:%d", result));
    }

    public static void o0asss() {
        mCount += 1;
        Log.d("mCount", String.format("mCount is %d", mCount));
    }

    private int sum(int a, int b) {
        int c = a + b;
        Log.i("sum", "sum: " + c);
        return c;
    }

    private int sum2(int a, int b) {
        int c = a + b;
        Log.i("sum2", "sum2: " + c);
        return c;
    }
}
