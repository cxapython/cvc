package com.example.cvc;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static Context sapp = null;
    public static int mCount = 20;

    public static void SendRequest(TroopFileTransferManager.Item m) {
        Log.d("ee", "OidbSvc.0x6d6_2");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (sapp == null) {
            sapp = this;
        }
        cvc(123);
        effffs();
        s ss = new s();
        ss.a = "1.txt";
        ss.b = "/sdcard";
        TroopFileTransferManager.Item m = new TroopFileTransferManager.Item(ss);
        SendRequest(m);
    }

    public int cvc(int a) {
        boolean b = false;
        Toast.makeText(sapp.getApplicationContext(), "in cvc method1234", Toast.LENGTH_SHORT).show();
//        String s1="SSSS";
//        String s2 = "Check123";
        String s = "SSSS" + "Check123";
        Log.d(s, "userInfo: xxxx");
        Log.d(s, String.format("a is %d", a));
        return a * 100;
    }

    public void effffs() {
        aaa.DGSD();
    }
}