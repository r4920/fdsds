package com.tasktestingsapplication.app.modules.forgotpasswordverification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityForgotPasswordVerificationBinding
import com.tasktestingsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.tasktestingsapplication.app.modules.forgotpasswordentercode.ui.ForgotPasswordEnterCodeActivity
import com.tasktestingsapplication.app.modules.forgotpasswordverification.`data`.viewmodel.ForgotPasswordVerificationVM
import kotlin.String
import kotlin.Unit

class ForgotPasswordVerificationActivity :
    BaseActivity<ActivityForgotPasswordVerificationBinding>(R.layout.activity_forgot_password_verification)
    {
  private val viewModel: ForgotPasswordVerificationVM by viewModels<ForgotPasswordVerificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordVerificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSubmit.setOnClickListener {
      val destIntent = ForgotPasswordEnterCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup23.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_VERIFICATION_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordVerificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
