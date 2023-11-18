package com.crash2333.wanandroid

import android.app.Application
import com.blankj.utilcode.util.LogUtils
import com.didichuxing.doraemonkit.DoKit

class App : Application() {
    companion object {
        var token = ""
    }

//    val Context.dataStore by preferencesDataStore(name = "settings")

    override fun onCreate() {
        super.onCreate()
        initLog()
        DoKit.Builder(this)
//            .productId("需要使用平台功能的话，需要到dokit.cn平台申请id")
            .build()
    }

    private fun initLog() {
        val logConfig = LogUtils.getConfig()
        logConfig.isLogSwitch = BuildConfig.DEBUG //log开关
    }
}