package com.tasktestingsapplication.app.modules.forgotpasswordverification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tasktestingsapplication.app.modules.forgotpasswordverification.`data`.model.ForgotPasswordVerificationModel
import org.koin.core.KoinComponent

class ForgotPasswordVerificationVM : ViewModel(), KoinComponent {
  val forgotPasswordVerificationModel: MutableLiveData<ForgotPasswordVerificationModel> =
      MutableLiveData(ForgotPasswordVerificationModel())

  var navArguments: Bundle? = null
}
