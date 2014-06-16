package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // création du broadcoast personnalisé
    public void broadcastIntent(View view)
    {
        Intent intent = new Intent();
        intent.setAction("com.example.app.custom");
        sendBroadcast(intent);
    }


}
