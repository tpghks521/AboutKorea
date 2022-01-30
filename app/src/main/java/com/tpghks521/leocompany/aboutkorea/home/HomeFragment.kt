package com.tpghks521.leocompany.aboutkorea.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.tpghks521.leocompany.aboutkorea.R
import com.tpghks521.leocompany.aboutkorea.common.MainPageFragment
import com.tpghks521.leocompany.aboutkorea.databinding.FragmentHomeBinding
import com.tpghks521.leocompany.aboutkorea.home.viewmodel.HomeViewModel

class HomeFragment : MainPageFragment() {

	override val title: Int
		get() = R.string.home_title

	val viewModel by viewModels<HomeViewModel>()


	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val binding: FragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
		return binding.root
	}
}

