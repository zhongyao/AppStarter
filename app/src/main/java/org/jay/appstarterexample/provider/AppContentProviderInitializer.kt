package org.jay.appstarterexample.provider

import android.content.Context
import androidx.startup.AppInitializer
import androidx.startup.InitializationProvider
import androidx.startup.Initializer

/**
 * @author：zhongyao
 * @date：2023/3/20
 * @description：
 * 通过 JetPack 提供的 Startup 将多个初始化的 ContentProvider 聚合成一个来进行优化。
 * @reference：
 * https://juejin.cn/post/7003238879641731102
 */
class AppContentProviderInitializer : Initializer<Unit> {
    /**
     * 在create方法中执行要初始化的代码
     */
    override fun create(context: Context) {

        //此处做sdk的初始化工作，如果希望初始化延迟，则可在特定的时机调用如下方法
//        AppInitializer.getInstance(context).initializeComponent(AppContentProviderInitializer::class.java)
    }

    /**
     * dependencies方法用于配置当前 AppContentProviderInitializer 是否还依赖于其他Initializer
     * 有的话在此配置，没有就return emptyList()即可
     */
    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}