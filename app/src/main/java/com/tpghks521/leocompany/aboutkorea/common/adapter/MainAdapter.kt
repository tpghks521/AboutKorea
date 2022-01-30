package com.tpghks521.leocompany.aboutkorea.common.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tpghks521.leocompany.aboutkorea.common.MainPageFragment
import com.tpghks521.leocompany.aboutkorea.home.HomeFragment
import com.tpghks521.leocompany.aboutkorea.profile.ProfileFragment
import com.tpghks521.leocompany.aboutkorea.wisi_list.WishListFragment

class MainAdapter(private val activity: AppCompatActivity) : FragmentStateAdapter(activity) {

	private val fragmentList: List<MainPageFragment> = listOf(
		HomeFragment(),
		WishListFragment(),
		ProfileFragment()
	)

	fun getTitle(position: Int): String {
		return activity.getString(fragmentList[position].title)
	}

	override fun getItemCount(): Int {
		return fragmentList.size
	}

	override fun createFragment(position: Int): Fragment {
		return fragmentList[position]
	}
}