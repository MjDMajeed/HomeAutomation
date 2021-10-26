package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin4: String? = MyApp.getInstance().resources.getString(R.string.lbl_login_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignup4: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtProfile2: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_2)

)
