package com.example.android.chatapps_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ImageButtonActivity extends AppCompatActivity {

    Toolbar toolbar_imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        toolbar_imagebutton = (Toolbar) findViewById(R.id.toolbar);
        toolbar_imagebutton.setTitle("Chat Apps");
        toolbar_imagebutton.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar_imagebutton);

        TextView txtInfo = (TextView) findViewById(R.id.txtInfo);
        if(getIntent() != null)
        {
            String info = getIntent().getStringExtra("info");
            txtInfo.setText(info);
        }
    }
}
