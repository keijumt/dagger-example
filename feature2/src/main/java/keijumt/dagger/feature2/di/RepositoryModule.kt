package keijumt.dagger.feature2.di

import dagger.Module
import dagger.Provides
import keijumt.dagger.feature2.Feature2Repository
import keijumt.dagger.feature2.Feature2RepositoryImpl
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideFeature2Repository(): Feature2Repository = Feature2RepositoryImpl()
}