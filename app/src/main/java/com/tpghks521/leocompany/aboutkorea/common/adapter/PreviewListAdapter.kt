package com.tpghks521.leocompany.aboutkorea.common.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import com.tpghks521.leocompany.aboutkorea.model.Location
import com.tpghks521.leocompany.aboutkorea.home.PreviewLocationFragment

class PreviewListAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

	var locationList: List<Location> = arrayListOf(
		Location(0, "강릉"), Location(1, "제주도"), Location(2, "서울"), Location(3, "경기도")
	)


	override fun getItemCount(): Int {
		return locationList.size
	}

	override fun createFragment(position: Int): Fragment {
		val fragment = PreviewLocationFragment()

		val bundle = Bundle()
		bundle.putSerializable("location", locationList[position])
		fragment.arguments = bundle

		return fragment
	}

	override fun onBindViewHolder(holder: FragmentViewHolder, position: Int, payloads: MutableList<Any>) {
		super.onBindViewHolder(holder, position, payloads)
	}

	override fun getItemViewType(position: Int): Int {
		return super.getItemViewType(position)
	}


}
