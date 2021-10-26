package com.application.app.modules.profile2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityProfile2Binding
import com.application.app.modules.profile2.`data`.model.Profile3RowModel
import com.application.app.modules.profile2.`data`.viewmodel.Profile2VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class Profile2Activity : BaseActivity<ActivityProfile2Binding>(R.layout.activity_profile_2) {
  private val viewModel: Profile2VM by viewModels<Profile2VM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerList(
    view: View,
    position: Int,
    item: Profile3RowModel
  ): Unit {
    when(view.id) {


            }
  }

  public override fun onInitialized(): Unit {
    val recyclerListAdapter =
                               
        RecyclerListAdapter(viewModel.recyclerListList.value?:mutableListOf())
    binding.recyclerList.adapter = recyclerListAdapter
    recyclerListAdapter.setOnItemClickListener(
                        object : RecyclerListAdapter.OnItemClickListener {
                            override fun onItemClick(view:View, position:Int, item :
        Profile3RowModel) {
                                onClickRecyclerList(view, position, item)
                            }
                        }
                        )
    viewModel.recyclerListList.observe(this) {
                            recyclerListAdapter.updateData(it)
                        }
    binding.profile2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Profile2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
