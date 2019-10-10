package keijumt.dagger.feature1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

internal class Feature1ViewModel(
    feature1Repository: Feature1Repository
) : ViewModel() {

    val item = MutableLiveData<String>()

    init {
        item.value = feature1Repository.getItem()
    }
}
