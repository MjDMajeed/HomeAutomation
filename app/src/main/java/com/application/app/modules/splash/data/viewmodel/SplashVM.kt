package com.application.app.modules.splash.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splash.`data`.model.Splash1RowModel
import com.application.app.modules.splash.`data`.model.SplashModel
import kotlin.collections.MutableList

public class SplashVM : ViewModel() {
  public val splashModel: MutableLiveData<SplashModel> = MutableLiveData(SplashModel())

  public val recyclerViewList: MutableLiveData<MutableList<Splash1RowModel>> =
      MutableLiveData(mutableListOf())
}
