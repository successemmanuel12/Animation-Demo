package com.success.animationdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sriyank.animationsdemo.Landscape
import com.sriyank.animationsdemo.RecyclerAdapter
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter
import jp.wasabeef.recyclerview.animators.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		setUpRecyclerView()
	}

	private fun setUpRecyclerView() {

		val adapter = RecyclerAdapter(this, Landscape.data)
		recyclerView.adapter = ScaleInAnimationAdapter(adapter)

		val layoutManager = LinearLayoutManager(this)
		layoutManager.orientation = LinearLayoutManager.VERTICAL 
		recyclerView.layoutManager = layoutManager

		recyclerView.itemAnimator = ScaleInBottomAnimator()
		recyclerView.itemAnimator?.apply {
			addDuration = 500 //duration of add operation
			removeDuration = 500 //duration of delete operation
		}
	}
}

