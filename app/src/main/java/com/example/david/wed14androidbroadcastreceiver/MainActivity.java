package com.example.david.wed14androidbroadcastreceiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        BroadcastReceiver br = new MyFirstBroadcastreceiver();

        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        this.registerReceiver(br, filter);
*/
    }

    public void sendBroadcastMessage(View view) {


        Intent intent = new Intent("com.example.david.message");

        Bundle b = new Bundle();
        b.putString("name",  "David");

        sendOrderedBroadcast(intent, null, new MyThirdBroadcastReceiver(), null, 20 , "Laura", b);


    }
}
