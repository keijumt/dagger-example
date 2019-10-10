package keijumt.dagger.feature1.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import keijumt.dagger.common.IntentResolver
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        Feature1Module::class,
        Feature1FragmentModule::class
    ]
)
interface Feature1Component : AndroidInjector<Feature1Injector> {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            @BindsInstance intentResolver: IntentResolver
        ): Feature1Component
    }
}