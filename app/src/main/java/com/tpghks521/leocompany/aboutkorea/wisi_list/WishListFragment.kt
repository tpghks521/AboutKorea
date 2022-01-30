package com.tpghks521.leocompany.aboutkorea.wisi_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.tpghks521.leocompany.aboutkorea.R
import com.tpghks521.leocompany.aboutkorea.common.MainPageFragment
import com.tpghks521.leocompany.aboutkorea.databinding.FragmentWishListBinding


class WishListFragment : MainPageFragment() {

	override val title: Int
		get() = R.string.wish_list_title

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		val binding: FragmentWishListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_wish_list, container, false)
		return binding.root
	}

}