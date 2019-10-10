package keijumt.dagger.feature2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.AndroidSupportInjection
import keijumt.dagger.common.IntentResolver
import keijumt.dagger.feature2.databinding.FragmentFeature2Binding
import javax.inject.Inject

class Feature2Fragment : Fragment() {

    companion object {
        fun newInstance() = Feature2Fragment()
    }

    @Inject
    lateinit var viewModelFactory: Feature2ViewModelFactory

    @Inject
    lateinit var intentResolver: IntentResolver

    private lateinit var viewModel: Feature2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        AndroidSupportInjection.inject(this)
        val feature2ViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(Feature2ViewModel::class.java)
        val binding = FragmentFeature2Binding.inflate(
            inflater,
            container,
            false
        ).apply {
            viewModel = feature2ViewModel
        }

        binding.button.setOnClickListener {
            startActivity(intentResolver.feature1(requireContext()))
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Feature2ViewModel::class.java)
        // TODO: Use the ViewModel
    }


}
