package com.tasktestingsapplication.app.modules.forgotpasswordverification.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordVerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
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
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
