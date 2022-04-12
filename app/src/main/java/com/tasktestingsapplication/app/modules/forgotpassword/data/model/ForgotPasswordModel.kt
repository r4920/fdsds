package com.tasktestingsapplication.app.modules.forgotpassword.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecoverYouPas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recover_you_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etExAbcexampleValue: String? = null
)
