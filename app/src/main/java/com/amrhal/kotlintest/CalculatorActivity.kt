package com.amrhal.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        calc()



    }

    fun calc() {

        textView.text = "00"

        btn_add.setOnClickListener {
            textView.text = "" + sum()
        }

        btn_sub.setOnClickListener {
            textView.text = "" + sub()
        }
        btn_multi.setOnClickListener {
            textView.text = "" + multi()
        }
        btn_divid.setOnClickListener {
            textView.text = "" + div()
        }
    }

    fun sum(): Long {
        val a = editText.text.toString()
        val b = editText2.text.toString()
        return a.toLong() + b.toLong()
    }

    fun sub(): Long {
        val a = editText.text.toString()
        val b = editText2.text.toString()
        return a.toLong() - b.toLong()
    }

    fun multi(): Long {
        val a = editText.text.toString()
        val b = editText2.text.toString()
        return a.toLong() * b.toLong()
    }

    fun div(): Double {
        val a = editText.text.toString()
        val b = editText2.text.toString()
        return a.toDouble() / b.toDouble()
    }
}
