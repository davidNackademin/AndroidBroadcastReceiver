package com.example.david.wed14androidbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by david on 2018-03-14.
 */

public class MyThirdBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = MyThirdBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent)
    {

        int initcode = getResultCode();
        String initData = getResultData();

        Bundle bundle = getResultExtras(true);
        String name = bundle.getString("name");

        Log.d(TAG,  "Hello from my third receiver" );
        Toast.makeText(context, "Hello from my 3st receiver", Toast.LENGTH_SHORT).show();
        Log.d(TAG,  "Code: " + initcode + " data: " + initData + " Bundle: " + name );

    }
}
