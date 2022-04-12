package com.tasktestingsapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityLoginBinding
import com.tasktestingsapplication.app.modules.dashboard.ui.DashboardActivity
import com.tasktestingsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.tasktestingsapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.tasktestingsapplication.app.modules.register.ui.RegisterActivity
import com.tasktestingsapplication.app.modules.welcomepage.ui.WelcomePageActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtRegister.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup23.setOnClickListener {
      val destIntent = WelcomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLogin1.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etContinueWithG.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
