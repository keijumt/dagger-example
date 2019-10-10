package keijumt.dagger.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.AndroidSupportInjection
import keijumt.dagger.common.IntentResolver
import keijumt.dagger.feature1.databinding.FragmentFeature1Binding
import javax.inject.Inject

class Feature1Fragment : Fragment() {

    companion object {
        fun newInstance() = Feature1Fragment()
    }

    @Inject
    lateinit var viewModelFactory: Feature1ViewModelFactory

    @Inject
    lateinit var intentResolver: IntentResolver

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        AndroidSupportInjection.inject(this)
        val feature1ViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(Feature1ViewModel::class.java)
        val binding = FragmentFeature1Binding.inflate(
            inflater,
            container,
            false
        ).apply {
            viewModel = feature1ViewModel
            lifecycleOwner = viewLifecycleOwner
        }

        binding.button.setOnClickListener {
            startActivity(intentResolver.feature2(requireContext()))
        }

        return binding.root
    }
}
