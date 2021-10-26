package com.application.app.modules.signup4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.signup4.`data`.model.Signup4Model
import com.application.app.modules.signup4.`data`.model.Signup5RowModel
import kotlin.collections.MutableList

public class Signup4VM : ViewModel() {
  public val signup4Model: MutableLiveData<Signup4Model> = MutableLiveData(Signup4Model())

  public val recyclerViewList: MutableLiveData<MutableList<Signup5RowModel>> =
      MutableLiveData(mutableListOf())
}
