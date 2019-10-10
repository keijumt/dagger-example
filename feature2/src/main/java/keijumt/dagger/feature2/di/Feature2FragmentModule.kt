package keijumt.dagger.feature2.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import keijumt.dagger.feature2.Feature2Fragment

@Module
abstract class Feature2FragmentModule {

    @ContributesAndroidInjector
    abstract fun feature2Fragment(): Feature2Fragment
}