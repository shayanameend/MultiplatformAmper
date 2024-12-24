package com.zedsols.multiplatform_app

import KoinKt
import android.app.Application

class AndroidApp : Application() {
  override fun onCreate() {
    super.onCreate()

    KoinKt.doInit()
  }
}