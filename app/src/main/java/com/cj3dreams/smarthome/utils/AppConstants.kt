package com.cj3dreams.smarthome.utils

import com.cj3dreams.smarthome.R
import com.cj3dreams.smarthome.model.DevicesModel
import com.cj3dreams.smarthome.model.PanelsModel

object AppConstants {
    val listPanels = listOf(PanelsModel("36%", R.drawable.ic_humidity,
    "Humidifier\nAir", "Mode 2"),
        PanelsModel("73%", R.drawable.ic_clean, "Purifier\nAir",
            "On")
        )

    val listDevices = listOf(DevicesModel(R.drawable.dark_wider, "Bork V530",
        "Vacuum cleaner"),
        DevicesModel(R.drawable.smart_lamp, "LIFX LED Light",
            "Smart bulb"),
        DevicesModel(R.drawable.air_cleaner, "Xiaomi DEM-F600",
            "Humidifier"),
        DevicesModel(R.drawable.ic_wifi, "Not found device?",
            "Select manually"),
    )

}