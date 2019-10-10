package keijumt.dagger.feature2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class Feature2ViewModelFactory @Inject constructor(
    private val feature2Repository: Feature2Repository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        Feature2ViewModel(feature2Repository) as T
}
