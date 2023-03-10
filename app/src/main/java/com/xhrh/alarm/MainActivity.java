package com.xhrh.alarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(3);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.stopwatch);
        tabLayout.getTabAt(1).setIcon(R.drawable.alarms);
        tabLayout.getTabAt(2).setIcon(R.drawable.timer);

        tabLayout.selectTab(tabLayout.getTabAt(1));

    }
}