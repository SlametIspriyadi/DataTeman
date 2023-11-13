package com.example.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val menuText = arrayOf("Teman", "Github", "Profile")
    val menuIcon = arrayOf(R.drawable.ic_house, R.drawable.ic_add, R.drawable.ic_profile)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter =ViewPagerAdapter(this)
        binding.viewPager.setAdapter(adapter);
        TabLayoutMediator(binding.tab_layout, binding.view_pager, { tab, position ->
                tab.text=menuText[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }
}