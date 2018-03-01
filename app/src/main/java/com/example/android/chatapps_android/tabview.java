package com.example.android.chatapps_android;

import android.support.v7.app.ActionBar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;

public class tabview extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabview);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add fragments

        adapter.AddFragment(new FragmentContact(), "Contact");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Remove shadow from action bar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
