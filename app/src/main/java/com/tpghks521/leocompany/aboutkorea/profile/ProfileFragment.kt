package com.tpghks521.leocompany.aboutkorea.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.tpghks521.leocompany.aboutkorea.R
import com.tpghks521.leocompany.aboutkorea.common.MainPageFragment
import com.tpghks521.leocompany.aboutkorea.databinding.FragmentProfileBinding


class ProfileFragment : MainPageFragment() {

	override val title: Int
		get() = R.string.profile_title

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val binding: FragmentProfileBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false)
		return binding.root
	}


}