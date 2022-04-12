package com.tasktestingsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityAppNavigationBinding
import com.tasktestingsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.tasktestingsapplication.app.modules.dashboard.ui.DashboardActivity
import com.tasktestingsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.tasktestingsapplication.app.modules.forgotpasswordentercode.ui.ForgotPasswordEnterCodeActivity
import com.tasktestingsapplication.app.modules.forgotpasswordverification.ui.ForgotPasswordVerificationActivity
import com.tasktestingsapplication.app.modules.login.ui.LoginActivity
import com.tasktestingsapplication.app.modules.register.ui.RegisterActivity
import com.tasktestingsapplication.app.modules.registerverification.ui.RegisterVerificationActivity
import com.tasktestingsapplication.app.modules.welcomepage.ui.WelcomePageActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRegister.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegisterVerification.setOnClickListener {
      val destIntent = RegisterVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPasswordEnterCode.setOnClickListener {
      val destIntent = ForgotPasswordEnterCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDashboard.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPasswordVerification.setOnClickListener {
      val destIntent = ForgotPasswordVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWelcomePage.setOnClickListener {
      val destIntent = WelcomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
