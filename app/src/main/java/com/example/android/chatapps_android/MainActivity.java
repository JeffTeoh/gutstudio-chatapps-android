package com.example.android.chatapps_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chatbox (View view){
        Intent intent = new Intent(this, chatbox.class);
        Button bLogin = (Button) findViewById(R.id.bLogin);
        startActivity(intent);
    }
}