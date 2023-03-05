package com.cj3dreams.smarthome.view.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.cj3dreams.smarthome.R
import com.cj3dreams.smarthome.utils.AppConstants
import com.cj3dreams.smarthome.utils.AppConstants.listPanels
import com.cj3dreams.smarthome.view.adapter.home.HomePanelsAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        homeRecyclerView.adapter = HomePanelsAdapter(listPanels)


    }
}