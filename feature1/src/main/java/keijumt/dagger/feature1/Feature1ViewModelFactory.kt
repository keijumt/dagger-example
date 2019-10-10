package keijumt.dagger.feature1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class Feature1ViewModelFactory @Inject constructor(
    private val feature1Repository: Feature1Repository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        Feature1ViewModel(feature1Repository) as T
}
