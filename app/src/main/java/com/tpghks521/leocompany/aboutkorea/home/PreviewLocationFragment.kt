package com.tpghks521.leocompany.aboutkorea.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.tpghks521.leocompany.aboutkorea.R
import com.tpghks521.leocompany.aboutkorea.databinding.FragmentPreviewLocationBinding
import com.tpghks521.leocompany.aboutkorea.model.Location

class PreviewLocationFragment : Fragment() {

	lateinit var binding: FragmentPreviewLocationBinding
	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val location: Location = arguments?.getSerializable("location") as Location
		binding = DataBindingUtil.inflate(inflater, R.layout.fragment_preview_location, container, false)
		binding.title = location.name
		return binding.root
	}

	fun setUpView() {

	}


}