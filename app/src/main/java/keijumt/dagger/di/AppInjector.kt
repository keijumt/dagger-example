package keijumt.dagger.di

import dagger.android.DispatchingAndroidInjector
import keijumt.dagger.common.HasDispatchingInjector
import javax.inject.Inject

class AppInjector : HasDispatchingInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun dispatchingAndroidInjector(): DispatchingAndroidInjector<Any> =
        dispatchingAndroidInjector
}