package com.cj3dreams.smarthome.view.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cj3dreams.smarthome.R
import com.cj3dreams.smarthome.model.ItemHorizontal

class HomeHorizontalAdapter(private val list: List<ItemHorizontal>):RecyclerView.Adapter<HomeHorizontalAdapter.HomeHorizontalViewHolder>() {

    class HomeHorizontalViewHolder(view: View): RecyclerView.ViewHolder(view){

        val homeHumidityPercentTx = view.findViewById(R.id.homeHumidityPercentTx) as TextView
        val homeHumidityImgView = view.findViewById(R.id.homeHumidityImgView) as ImageView
        val homeHumidityNameTx = view.findViewById(R.id.homeHumidityNameTx) as TextView
        val homeHumiditySwitcherTx = view.findViewById(R.id.homeHumiditySwitcherTx) as TextView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHorizontalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontals, parent, false)

        return HomeHorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeHorizontalViewHolder, position: Int) {
        val item = list[position]
        holder.homeHumidityPercentTx.text = item.homeHumidityPercentTx
        holder.homeHumidityImgView.setImageResource(item.homeHumidityImgView)
        holder.homeHumidityNameTx.text = item.homeHumidityNameTx
        holder.homeHumiditySwitcherTx.text = item.homeHumiditySwitcherTx
    }

    override fun getItemCount() = list.size
}