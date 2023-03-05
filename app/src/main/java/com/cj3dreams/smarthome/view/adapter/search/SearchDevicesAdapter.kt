package com.cj3dreams.smarthome.view.adapter.search

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cj3dreams.smarthome.R
import com.cj3dreams.smarthome.model.DevicesModel
import com.google.android.material.card.MaterialCardView

class SearchDevicesAdapter(private val list: List<DevicesModel>): RecyclerView.Adapter<SearchDevicesAdapter.SearchDevicesViewHolder>() {


    class SearchDevicesViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val devicesSearchCv = view.findViewById(R.id.devicesSearchCv) as MaterialCardView
        var devicesImgView = view.findViewById(R.id.devicesImgView) as ImageView
        val devicesNameTx = view.findViewById(R.id.devicesNameTx) as TextView
        val devicesInfoTx = view.findViewById(R.id.devicesInfoTx) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchDevicesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_devices, parent, false)

        return SearchDevicesViewHolder(view)
    }

    @SuppressLint("UseCompatLoadingForColorStateLists", "UseCompatLoadingForDrawables")
    override fun onBindViewHolder(holder: SearchDevicesViewHolder, position: Int) {
        val itemData = list[position]

        holder.devicesImgView.setImageResource(itemData.devicesImgView)
        holder.devicesNameTx.text = itemData.devicesNameTx
        holder.devicesInfoTx.text = itemData.devicesInfoTx
        if (position == 0) {
            holder.devicesSearchCv.strokeWidth = 2
            holder.devicesSearchCv.strokeColor = holder.itemView.rootView.context
                .resources.getColor(R.color.tab_color_selected)
        }
        if (position == 3) {
            val params: ViewGroup.LayoutParams = holder.devicesImgView.layoutParams
            params.width = 120
            params.height = 120
            holder.devicesImgView.layoutParams = params
            holder.devicesSearchCv.backgroundTintList = holder.itemView.rootView
                .context.resources.getColorStateList(R.color.darkBackground)
            holder.devicesInfoTx.setTextColor(holder.itemView.rootView.context
                .resources.getColor(R.color.tab_color_selected))
        }
    }

    override fun getItemCount() = list.size
}