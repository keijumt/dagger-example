package keijumt.dagger.feature2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Feature2ViewModel(
    feature2Repository: Feature2Repository
) : ViewModel() {

    val item = MutableLiveData<String>()

    init {
        item.value = feature2Repository.getItem()
    }
}
