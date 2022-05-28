package com.xavijimenezmulet.savenullextension

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.xavijimenezmulet.safenullextension.util.saveNull
import com.xavijimenezmulet.savenullextension.databinding.FragmentFirstBinding
import com.xavijimenezmulet.savenullextension.domain.entity.Example

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ExampleFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    lateinit var example: Example

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        initExample()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initExample() {
        example = Example()
        val byte: Byte = example.byte.saveNull()
    }
}