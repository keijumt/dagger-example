package keijumt.dagger.feature2.di

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
        Feature2Module::class,
        Feature2FragmentModule::class
    ]
)
interface Feature2Component : AndroidInjector<Feature2Injector> {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
            @BindsInstance intentResolver: IntentResolver
        ): Feature2Component
    }
}