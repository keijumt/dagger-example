package keijumt.dagger.feature1.di

import dagger.android.DispatchingAndroidInjector
import keijumt.dagger.common.HasDispatchingInjector
import javax.inject.Inject

class Feature1Injector : HasDispatchingInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun dispatchingAndroidInjector(): DispatchingAndroidInjector<Any> =
        dispatchingAndroidInjector
}