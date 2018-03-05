package com.example.android.chatapps_android;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class chatui extends AppCompatActivity {

    Toolbar toolbar_chatui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatui);

        /*toolbar_chatui = (Toolbar) findViewById(R.id.toolbar_chatcontact);
        toolbar_chatui.setTitle("Chat Apps");
        toolbar_chatui.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar_chatui);*/
    }
}
