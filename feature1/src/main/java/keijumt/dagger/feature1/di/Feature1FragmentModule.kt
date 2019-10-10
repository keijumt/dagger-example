package keijumt.dagger.feature1.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import keijumt.dagger.feature1.Feature1Fragment

@Module
abstract class Feature1FragmentModule {
    @ContributesAndroidInjector
    abstract fun feature1Fragment(): Feature1Fragment
}