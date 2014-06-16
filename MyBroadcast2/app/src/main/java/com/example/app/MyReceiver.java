package com.example.app;

/**
 * Created by film on 13.06.14.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, "Intent detecte", Toast.LENGTH_LONG).show();
    }

}
