package keijumt.dagger.di

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
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<AppInjector> {
    fun intentResolver(): IntentResolver

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }
}