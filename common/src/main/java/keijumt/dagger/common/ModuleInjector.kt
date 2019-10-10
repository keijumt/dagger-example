package keijumt.dagger.common

import dagger.android.AndroidInjector

class ModuleInjector : AndroidInjector<Any> {

    private val injectorList = mutableListOf<HasDispatchingInjector>()

    fun addInjector(injector: HasDispatchingInjector) {
        injectorList.add(injector)
    }

    override fun inject(instance: Any) {
        val wasInjected =
            injectorList.any { it.dispatchingAndroidInjector().maybeInject(instance) }
        require(wasInjected) { "injection failed" }
    }
}
