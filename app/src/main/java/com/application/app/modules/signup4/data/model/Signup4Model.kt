package com.application.app.modules.signup4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Signup4Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtByContinuing: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_continuing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOrRegisterWit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_register_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etFullNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etConfirmPassworValue: String? = null
)
