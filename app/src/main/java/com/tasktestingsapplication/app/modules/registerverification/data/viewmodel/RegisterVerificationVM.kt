package com.tasktestingsapplication.app.modules.registerverification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tasktestingsapplication.app.modules.registerverification.`data`.model.RegisterVerificationModel
import org.koin.core.KoinComponent

class RegisterVerificationVM : ViewModel(), KoinComponent {
  val registerVerificationModel: MutableLiveData<RegisterVerificationModel> =
      MutableLiveData(RegisterVerificationModel())

  var navArguments: Bundle? = null
}
