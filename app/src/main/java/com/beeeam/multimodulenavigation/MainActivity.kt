package com.beeeam.multimodulenavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.beeeam.multimodulenavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initNav()

        // 바텀 뷰 아이템 클릭 시 이동 선언
        binding.bottomView.setOnItemSelectedListener  { item ->
            navController.navigate(
                when(item.itemId) {
                    R.id.navigation_a -> com.beeeam.apple.R.id.nav_graph_apple
                    R.id.navigation_b -> com.beeeam.banana.R.id.nav_graph_banana
                    R.id.navigation_c -> com.beeeam.cherry.R.id.nav_graph_cherry
                    R.id.navigation_d -> com.beeeam.durian.R.id.nav_graph_durian
                    else -> 0
                }
            )
            return@setOnItemSelectedListener true
        }
    }

    private fun initNav() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        navController = navHostFragment.navController

        binding.apply {
            bottomView.setupWithNavController(navController)
            bottomView.setOnItemReselectedListener { }
        }
    }
}