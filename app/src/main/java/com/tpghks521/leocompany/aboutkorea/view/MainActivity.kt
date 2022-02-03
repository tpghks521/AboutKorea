package com.tpghks521.leocompany.aboutkorea.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.tpghks521.leocompany.aboutkorea.R
import com.tpghks521.leocompany.aboutkorea.common.adapter.MainAdapter
import com.tpghks521.leocompany.aboutkorea.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

	lateinit var viewPager: ViewPager2
	lateinit var mainAdapter: MainAdapter
	lateinit var tabLayout: TabLayout
	lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setUpView()
	}

	private fun setUpView() {
		binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
		viewPager = binding.viewPager
		mainAdapter = MainAdapter(this)
		viewPager.adapter = mainAdapter
		tabLayout = binding.tabLayout

		viewPager.isUserInputEnabled = false

		TabLayoutMediator(tabLayout, viewPager) { tab, position ->
			tab.text = mainAdapter.getTitle(position)
		}.attach()
	}
}