package keijumt.dagger.di

import dagger.Module
import dagger.Provides
import keijumt.dagger.IntentResolverImpl
import keijumt.dagger.common.IntentResolver
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideIntentResolver(): IntentResolver = IntentResolverImpl()
}