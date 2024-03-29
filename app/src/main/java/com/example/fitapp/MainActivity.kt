package com.example.fitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitapp.fragments.DaysFragment
import com.example.fitapp.utils.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FragmentManager.setFragment(DaysFragment.newInstance(), this)
    }

    override fun onBackPressed() {
        if(FragmentManager.currentFragment is DaysFragment)
        super.onBackPressed()
        else FragmentManager.setFragment(DaysFragment.newInstance(),this)
    }
}