package com.tasktestingsapplication.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityForgotPasswordBinding
import com.tasktestingsapplication.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.tasktestingsapplication.app.modules.forgotpasswordverification.ui.ForgotPasswordVerificationActivity
import com.tasktestingsapplication.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup23.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSubmit.setOnClickListener {
      val destIntent = ForgotPasswordVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
