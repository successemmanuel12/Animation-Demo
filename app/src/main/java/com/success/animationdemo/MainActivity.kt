package com.success.animationdemo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.success.animationdemo.transformers.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageArray = intArrayOf(
            R.drawable.first, R.drawable.second,
            R.drawable.third, R.drawable.fourth, R.drawable.fifth
        )

        val adapter = ViewPagerAdapter(this@MainActivity, imageArray)
        viewPager!!.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        when (id) {

            R.id.zoom_out       -> setPageTransformer(ZoomOutTransformation())
            R.id.depth_page     -> setPageTransformer(DepthPageTransformation())
            R.id.vertical_flip  -> setPageTransformer(VerticalFlipTransformation())
            R.id.fade_out       -> setPageTransformer(FadeOutTransformation())
            R.id.cube_out       -> setPageTransformer(CubeOutDepthTransformation())
            R.id.hinge          -> setPageTransformer(HingeTransformation())
            R.id.cube_in        -> setPageTransformer(CubeInDepthTransformation())
            R.id.cube_in_scaling -> setPageTransformer(CubeInScalingTransformation())
            R.id.cube_out_rotation -> setPageTransformer(CubeOutRotationTransformation())
            R.id.cube_out_scaling -> setPageTransformer(CubeOutScalingTransformation())
            R.id.fan            -> setPageTransformer(FanTransformation())
            R.id.gate           -> setPageTransformer(GateTransformation())
            R.id.pop            -> setPageTransformer(Rotation())
            R.id.spinner        -> setPageTransformer(SpinnerTransformation())
            R.id.vertical_shut  -> setPageTransformer(VerticalShutTransformation())
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setPageTransformer(transformer: ViewPager.PageTransformer ) {
        viewPager!!.setPageTransformer(true, transformer)
    }
}
