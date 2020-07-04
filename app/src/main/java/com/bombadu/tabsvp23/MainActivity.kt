package com.bombadu.tabsvp23

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabBar)
        tabLayout.setupWithViewPager(viewPager)
        val pagerAdapter = PagerAdapter(supportFragmentManager,
                tabLayout.tabCount)
        viewPager.adapter = pagerAdapter
    }
}