package com.jing.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("callme");
                intent.setComponent(new ComponentName("com.jing.broadcasttest","com.jing.broadcasttest.mBroadcastReceiver"));
                //ComponentName 参数1：接收方App包名，参数2：接收类名
                sendBroadcast(intent);
            }
        });
    }
}
