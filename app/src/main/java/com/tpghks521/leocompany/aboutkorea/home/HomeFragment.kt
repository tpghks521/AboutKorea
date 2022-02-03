package com.tpghks521.leocompany.aboutkorea.home

import android.graphics.Rect
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.tpghks521.leocompany.aboutkorea.R
import com.tpghks521.leocompany.aboutkorea.common.MainPageFragment
import com.tpghks521.leocompany.aboutkorea.common.adapter.PreviewListAdapter
import com.tpghks521.leocompany.aboutkorea.databinding.FragmentHomeBinding
import com.tpghks521.leocompany.aboutkorea.home.viewmodel.HomeViewModel

class HomeFragment : MainPageFragment() {

	override val title: Int
		get() = R.string.home_title

	val viewModel by viewModels<HomeViewModel>()

	lateinit var previewListAdapter: PreviewListAdapter
	lateinit var binding: FragmentHomeBinding


	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
		setUpView()
		return binding.root
	}

	private fun setUpView() {
		setUpPreviewList()
	}

	private fun setUpPreviewList() {
		previewListAdapter = PreviewListAdapter(this)
		binding.previewList.adapter = previewListAdapter
	}
}

