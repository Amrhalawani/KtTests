package com.amrhal.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    val TAG: String = "tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, CalculatorActivity::class.java)
        btn_calc.setOnClickListener {
            startActivity(intent)
        }

        //  TestArray()
        //  TestWhen()
        //  testIF()
//         testFor()
       // testWhile()
        testVararg(5,10,100,156,89,489)


    }

    private fun testVararg(vararg numbers: Int) {
        //limitless input parameters, you can add parameters as many as you likne
        for (i in numbers){
            Log.e(TAG,"" + i)
        }
    }

    private fun testWhile() {
        // you have to init it before dive in while statement
        var i = 0;
//        while (i >= 5) {
//            Log.e(TAG, "" + i)
//            i++
//        }
        var j=0
        do {
            Log.e(TAG, "test" + j)
            j++
        }
        while (j<=2)
    }

    private fun testFor() {
        for (i in 0..5) {
            Log.e(TAG, "" + i)
        }

        for (i in 5 downTo 0) {
            Log.e(TAG, "" + i)
        }
        for (i in 0..10 step 2) {
            Log.e(TAG, "---" + i)
        }


        val name = "Amr"
        for (i in name) {
            Log.e(TAG, "" + i)
        } // for each
        val langs = arrayOf("عربي", "english", "dutch", "deutsche")
        for (i in langs) {
            Log.e(TAG, "" + i)
        } // for

        val nums = arrayOf("zero", "one", "two", "three", "four")

        for (item in nums.indices) {

            // printing array elements having even index only
            if (item % 2 == 0)
                println(nums[item])
        }
        for (i in 0..10) {

            // printing array elements having even index only
            if (i==5) continue // continue means neglect or you can break(exit)
            else
            Log.e(TAG, "" + i)
        }


    }

    private fun testIF() {
        //as a expression
        val s = 44
        val boo = if (s > 20) true else false

        //or  val boo = s > 20

        val arr = arrayOf(1, 48, 45, 55)

        if (s in arr) {
            Log.e(TAG, "yes we found $s in our array")
        } else Log.e(TAG, " $s not found")
    }


    private fun TestArray() {
        var arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, "amr")
        var arr2 = arrayOf(1, "amr", 156.5, 'a') // the type is "any"
        var arr3 = Array(5, { 10 })


        for (s in 0..arr.size - 1) {
            Log.e("tag", arr[s].toString())
        }
        for (i in 0..arr3.size - 1) {
            Log.e("tag", arr3[i].toString())
        }

        Log.e(TAG, "" + arr.contains("amr"))
    }

    private fun TestWhen() {
        val a = 12
        val b = 5
        println("Enter operator either +, -, * or /")

        val operator = "+" // add operator here

        when (operator) {
            "+" -> println("........................... $a + $b = ${a + b}")
            "-" -> println("........................... $a - $b = ${a - b}")
            "*" -> println("........................... $a * $b = ${a * b}")
            "/" -> println("........................... $a / $b = ${a / b}")
            else -> println("$operator is invalid")
        }

        //you can return value from when exp and you have to add else
        val result = when (operator) {
            "+" -> "........................... $a + $b = ${a + b}"
            "-" -> "........................... $a - $b = ${a - b}"
            "*" -> "........................... $a * $b = ${a * b}"
            "/" -> "........................... $a / $b = ${a / b}"
            else -> "$operator is invalid"
        }
        println(result)
    }

}
