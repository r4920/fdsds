package com.tasktestingsapplication.app.modules.forgotpasswordentercode.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityForgotPasswordEnterCodeBinding
import com.tasktestingsapplication.app.modules.forgotpasswordentercode.`data`.viewmodel.ForgotPasswordEnterCodeVM
import com.tasktestingsapplication.app.modules.forgotpasswordverification.ui.ForgotPasswordVerificationActivity
import com.tasktestingsapplication.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

class ForgotPasswordEnterCodeActivity :
    BaseActivity<ActivityForgotPasswordEnterCodeBinding>(R.layout.activity_forgot_password_enter_code)
    {
  private val viewModel: ForgotPasswordEnterCodeVM by viewModels<ForgotPasswordEnterCodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordEnterCodeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup23.setOnClickListener {
      val destIntent = ForgotPasswordVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirm.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_ENTER_CODE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordEnterCodeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
