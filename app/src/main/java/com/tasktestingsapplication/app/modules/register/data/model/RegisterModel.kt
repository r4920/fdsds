package com.tasktestingsapplication.app.modules.register.`data`.model

import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateAnAccou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_accou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourName: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister1: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
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
  var etExAbcexampleValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etExSaulRamireValue: String? = null
)
