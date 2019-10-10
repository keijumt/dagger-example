package keijumt.dagger.feature1.di

import dagger.Module
import dagger.Provides
import keijumt.dagger.feature1.Feature1Repository
import keijumt.dagger.feature1.Feature1RepositoryImpl
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideFeateure1Repository(): Feature1Repository = Feature1RepositoryImpl()
}