package com.bombadu.tabsvp23

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter(fm: FragmentManager?, private val numOfTabs: Int) : FragmentPagerAdapter(fm!!, numOfTabs) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ChatFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            else -> ChatFragment()
        }
    }

    override fun getCount(): Int {
        return numOfTabs
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Chat"
            1 -> return "Status"
            2 -> return "Calls"
        }
        return null
    }

}