package com.tasktestingsapplication.app.modules.registerverification.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterVerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeHaveSentAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_have_sent_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerificationCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verification_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEX123456: String? = MyApp.getInstance().resources.getString(R.string.lbl_ex_123456)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister1: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)

)
