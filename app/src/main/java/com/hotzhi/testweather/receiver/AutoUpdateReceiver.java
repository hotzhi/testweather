package com.hotzhi.testweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hotzhi.testweather.service.AutoUpdateService;

public class AutoUpdateReceiver extends BroadcastReceiver {
    public AutoUpdateReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
    }
}
