package com.tasktestingsapplication.app.modules.register.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityRegisterBinding
import com.tasktestingsapplication.app.modules.login.ui.LoginActivity
import com.tasktestingsapplication.app.modules.register.`data`.viewmodel.RegisterVM
import com.tasktestingsapplication.app.modules.registerverification.ui.RegisterVerificationActivity
import com.tasktestingsapplication.app.modules.welcomepage.ui.WelcomePageActivity
import kotlin.String
import kotlin.Unit

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {
  private val viewModel: RegisterVM by viewModels<RegisterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup23.setOnClickListener {
      val destIntent = WelcomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtRegister1.setOnClickListener {
      val destIntent = RegisterVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
