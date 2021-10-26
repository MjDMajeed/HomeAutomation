package com.application.app.modules.profile2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.profile2.`data`.model.Profile2Model
import com.application.app.modules.profile2.`data`.model.Profile3RowModel
import kotlin.collections.MutableList

public class Profile2VM : ViewModel() {
  public val profile2Model: MutableLiveData<Profile2Model> = MutableLiveData(Profile2Model())

  public val recyclerListList: MutableLiveData<MutableList<Profile3RowModel>> =
      MutableLiveData(mutableListOf())
}
