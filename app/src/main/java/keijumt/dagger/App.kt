package keijumt.dagger

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector
import keijumt.dagger.common.ModuleInjector
import keijumt.dagger.di.AppInjector
import keijumt.dagger.feature1.di.DaggerFeature1Component
import keijumt.dagger.feature1.di.Feature1Injector
import keijumt.dagger.feature2.di.DaggerFeature2Component
import keijumt.dagger.feature2.di.Feature2Injector

class App : Application(), HasAndroidInjector {

    private val moduleInjector = ModuleInjector()

    override fun onCreate() {
        super.onCreate()

        val appInjector = AppInjector()
        val appComponent = DaggerAppComponent.factory().create(this)
        appComponent.inject(appInjector)

        val intentResolver = appComponent.intentResolver()

        val feature1Injector = Feature1Injector()
        val feature1Component = DaggerFeature1Component.factory().create(
            application = this,
            intentResolver = intentResolver
        )
        feature1Component.inject(feature1Injector)

        val feature2Injector = Feature2Injector()
        val feature2Component = DaggerFeature2Component.factory().create(
            application = this,
            intentResolver = intentResolver
        )
        feature2Component.inject(feature2Injector)

        moduleInjector.addInjector(feature1Injector)
        moduleInjector.addInjector(feature2Injector)
    }

    override fun androidInjector(): AndroidInjector<Any> = moduleInjector
}