package com.tasktestingsapplication.app.modules.forgotpasswordentercode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tasktestingsapplication.app.modules.forgotpasswordentercode.`data`.model.ForgotPasswordEnterCodeModel
import org.koin.core.KoinComponent

class ForgotPasswordEnterCodeVM : ViewModel(), KoinComponent {
  val forgotPasswordEnterCodeModel: MutableLiveData<ForgotPasswordEnterCodeModel> =
      MutableLiveData(ForgotPasswordEnterCodeModel())

  var navArguments: Bundle? = null
}
