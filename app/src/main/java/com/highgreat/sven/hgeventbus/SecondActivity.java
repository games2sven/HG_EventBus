package com.highgreat.sven.hgeventbus;

import android.os.Bundle;
import android.view.View;

import com.highgreat.sven.hgeventbus.core.HGEventbus;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void send(View view) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
                HGEventbus.getDefault().post(new Friend("Sven", 18));
//            }
//        }).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
