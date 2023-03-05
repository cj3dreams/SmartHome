package com.cj3dreams.smarthome.view.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.cj3dreams.smarthome.R
import com.cj3dreams.smarthome.utils.AppConstants.listDevices
import com.cj3dreams.smarthome.view.adapter.home.HomePanelsAdapter
import com.cj3dreams.smarthome.view.adapter.search.SearchDevicesAdapter
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        searchRecyclerView.adapter = SearchDevicesAdapter(listDevices)
    }

}