package com.bombadu.tabsvp23;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager viewPager = findViewById(R.id.viewPager);
        final TabLayout tabLayout = findViewById(R.id.tabBar);
        tabLayout.setupWithViewPager(viewPager);

        TabItem tabChats = findViewById(R.id.tabChats);
        TabItem tabStatus = findViewById(R.id.tabStatus);
        TabItem tabCalls = findViewById(R.id.tabCalls);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //viewPager.setCurrentItem(tab.getPosition());

                //Toast.makeText(MainActivity.this, "Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //Toast.makeText(MainActivity.this, "UnSelected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //Toast.makeText(MainActivity.this, "Reselected", Toast.LENGTH_SHORT).show();

            }
        });
    }
}