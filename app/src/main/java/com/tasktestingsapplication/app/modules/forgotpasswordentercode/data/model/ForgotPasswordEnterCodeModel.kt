package com.tasktestingsapplication.app.modules.forgotpasswordentercode.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordEnterCodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetYourNewPa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_your_new_pa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterNewPassw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_new_passw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirm: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirm)

)
