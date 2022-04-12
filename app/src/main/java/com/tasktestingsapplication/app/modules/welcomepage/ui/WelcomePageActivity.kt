package com.tasktestingsapplication.app.modules.welcomepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityWelcomePageBinding
import com.tasktestingsapplication.app.modules.dashboard.ui.DashboardActivity
import com.tasktestingsapplication.app.modules.login.ui.LoginActivity
import com.tasktestingsapplication.app.modules.register.ui.RegisterActivity
import com.tasktestingsapplication.app.modules.welcomepage.`data`.viewmodel.WelcomePageVM
import kotlin.String
import kotlin.Unit

class WelcomePageActivity : BaseActivity<ActivityWelcomePageBinding>(R.layout.activity_welcome_page)
    {
  private val viewModel: WelcomePageVM by viewModels<WelcomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etContinueWithG.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etContinueWithE.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "WELCOME_PAGE_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WelcomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
