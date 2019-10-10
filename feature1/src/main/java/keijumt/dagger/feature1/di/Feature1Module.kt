package keijumt.dagger.feature1.di

import dagger.Module

@Module(
    includes = [
        RepositoryModule::class
    ]
)
internal class Feature1Module {
}