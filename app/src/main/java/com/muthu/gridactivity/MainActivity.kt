package com.muthu.gridactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private var listOfData = ArrayList<String>()
    val SPAN_ROW_COUNT = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        prepareData()


        setDataToAdapter()

    }

    private fun setDataToAdapter() {

        rvLoadNumbers.setHasFixedSize(true)
        rvLoadNumbers.layoutManager = GridLayoutManager(this, SPAN_ROW_COUNT)
        rvLoadNumbers.adapter = NumberAdapter(listOfData)

    }

    private fun prepareData() {

        for (i in 0..30) {
            listOfData.add("Number $i")
        }
    }


}
