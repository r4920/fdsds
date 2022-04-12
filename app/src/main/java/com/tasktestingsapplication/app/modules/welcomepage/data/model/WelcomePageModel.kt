package com.tasktestingsapplication.app.modules.welcomepage.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeTo: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaxPense: String? = MyApp.getInstance().resources.getString(R.string.lbl_maxpense)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAPlaceWhereY: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_place_where_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsGetStart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etContinueWithGValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContinueWithEValue: String? = null
)
