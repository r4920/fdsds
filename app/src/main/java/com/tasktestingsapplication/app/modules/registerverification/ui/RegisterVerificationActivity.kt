package com.tasktestingsapplication.app.modules.registerverification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityRegisterVerificationBinding
import com.tasktestingsapplication.app.modules.dashboard.ui.DashboardActivity
import com.tasktestingsapplication.app.modules.register.ui.RegisterActivity
import com.tasktestingsapplication.app.modules.registerverification.`data`.viewmodel.RegisterVerificationVM
import kotlin.String
import kotlin.Unit

class RegisterVerificationActivity :
    BaseActivity<ActivityRegisterVerificationBinding>(R.layout.activity_register_verification) {
  private val viewModel: RegisterVerificationVM by viewModels<RegisterVerificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerVerificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtRegister1.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup23.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_VERIFICATION_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterVerificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
