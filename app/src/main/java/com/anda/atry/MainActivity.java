package com.anda.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import anda.comm.TryUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TryUtils.test();
    }
}
