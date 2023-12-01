package com.andreas.fiedler.example.telefon_register.fragmente

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.andreas.fiedler.example.telefon_register.MainActivity
import com.andreas.fiedler.example.telefon_register.R
import com.andreas.fiedler.example.telefon_register.databinding.FragmentDetailBinding
import com.andreas.fiedler.example.telefon_register.databinding.FragmentStartBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //(Daten)Team geladen werden
        val position = args.position
        val mainActivity = activity as MainActivity
        val item = mainActivity.dataset[position]


        //(Views)Detailinformation in Views schreiben
        binding.titleTV.text = item.name


    }

}