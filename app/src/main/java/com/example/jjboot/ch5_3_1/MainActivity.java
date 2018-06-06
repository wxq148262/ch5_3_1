package com.example.jjboot.ch5_3_1;

import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("guangbo");
                //27版本加一句话
                // intent.setComponent(new ComponentName("com.example.administrator.ch5_3_1","com.example.administrator.ch5_3_1.MyBroadcastReceiver"));
                sendBroadcast(intent);
            }
        });
    }
}
