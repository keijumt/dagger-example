package keijumt.dagger.common

import dagger.android.DispatchingAndroidInjector

interface HasDispatchingInjector {
    fun dispatchingAndroidInjector(): DispatchingAndroidInjector<Any>
}