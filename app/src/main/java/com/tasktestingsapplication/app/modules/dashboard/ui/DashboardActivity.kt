package com.tasktestingsapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tasktestingsapplication.app.R
import com.tasktestingsapplication.app.appcomponents.base.BaseActivity
import com.tasktestingsapplication.app.databinding.ActivityDashboardBinding
import com.tasktestingsapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.tasktestingsapplication.app.modules.welcomepage.ui.WelcomePageActivity
import kotlin.String
import kotlin.Unit

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup23.setOnClickListener {
      val destIntent = WelcomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ACTIVITY"

    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
