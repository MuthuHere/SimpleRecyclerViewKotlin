package com.muthu.gridactivity

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_number_adapter.view.*

class NumberAdapter(val listOfData: ArrayList<String>) : RecyclerView.Adapter<NumberAdapter.NumberHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NumberHolder {

        return NumberHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_number_adapter, p0, false))
    }

    override fun getItemCount(): Int {
        return listOfData.size
    }

    override fun onBindViewHolder(p0: NumberHolder, p1: Int) {
        p0.onBindData(listOfData[p1])

    }

    inner class NumberHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun onBindData(nameString: String) {
            view.tvNumberList.text = nameString
        }
    }
}