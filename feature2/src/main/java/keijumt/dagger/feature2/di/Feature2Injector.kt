package keijumt.dagger.feature2.di

import dagger.android.DispatchingAndroidInjector
import keijumt.dagger.common.HasDispatchingInjector
import javax.inject.Inject

class Feature2Injector : HasDispatchingInjector {

    @Inject
    lateinit var androidDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun dispatchingAndroidInjector(): DispatchingAndroidInjector<Any> =
        androidDispatchingAndroidInjector
}