package com.tasktestingsapplication.app.modules.dashboard.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDASHBOARD: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)

)
