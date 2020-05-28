package com.highgreat.sven.hgeventbus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.highgreat.sven.hgeventbus.core.HGEventbus;
import com.highgreat.sven.hgeventbus.core.HGSubscribe;
import com.highgreat.sven.hgeventbus.core.HGThreadMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HGEventbus.getDefault().register(this);
    }

    public void change(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    @HGSubscribe(threadMode = HGThreadMode.MAIN)
    public void receive(Friend friend){
        Toast.makeText(this, friend.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        EventBus.getDefault().unregister(this);
        HGEventbus.getDefault().unregister(this);
    }

}
