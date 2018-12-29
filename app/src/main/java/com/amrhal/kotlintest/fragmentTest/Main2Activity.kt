package com.amrhal.kotlintest.fragmentTest

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.amrhal.kotlintest.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    val fragment1 = FirstFragment.newInstance()
    val fragment2 = SecondFragment.newInstance()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                setupFragment1(fragment1)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                setupFragment2(fragment2)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


    }

    fun setupFragment1(fragment: FirstFragment) {

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }

    fun setupFragment2(fragment: SecondFragment) {

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
}
