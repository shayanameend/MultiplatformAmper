package com.zedsols.multiplatform_amper

import android.app.Application

class AndroidApp : Application() {
  override fun onCreate() {
    super.onCreate()

    KoinKt.init()
  }
}