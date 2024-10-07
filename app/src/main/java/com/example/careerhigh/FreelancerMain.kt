package com.example.careerhigh

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class FreelancerMain : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.f_activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        navView = findViewById(R.id.navView)

        val btnCategory: ImageButton = findViewById(R.id.btnCategory)
        btnCategory.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        navView.setNavigationItemSelectedListener { menuItem ->
            // Handle menu item selection
            when (menuItem.itemId) {
                R.id.menu_development -> {
                    // Handle development category selection
                    true
                }
                R.id.menu_design -> {
                    // Handle design category selection
                    true
                }
                // 개발 직무
                R.id.menu_web_developer -> {
                    // Handle web developer position selection
                    true
                }
                R.id.menu_server_developer -> {
                    // Handle server developer position selection
                    true
                }
                R.id.menu_software_developer -> {
                    // Handle software developer position selection
                    true
                }
                R.id.menu_backend_developer -> {
                    // Handle backend developer position selection
                    true
                }
                R.id.menu_frontend_developer -> {
                    // Handle frontend developer position selection
                    true
                }
                R.id.menu_java_developer -> {
                    // Handle Java developer position selection
                    true
                }
                R.id.menu_android_developer -> {
                    // Handle Android developer position selection
                    true
                }
                R.id.menu_ios_developer -> {
                    // Handle iOS developer position selection
                    true
                }
                R.id.menu_c_cpp_developer -> {
                    // Handle C/C++ developer position selection
                    true
                }
                R.id.menu_nodejs_developer -> {
                    // Handle Node.js developer position selection
                    true
                }
                R.id.menu_data_engineer -> {
                    // Handle data engineer position selection
                    true
                }
                R.id.menu_system_network_admin -> {
                    // Handle system/network admin position selection
                    true
                }
                R.id.menu_python_developer -> {
                    // Handle Python developer position selection
                    true
                }
                R.id.menu_machine_learning_engineer -> {
                    // Handle machine learning engineer position selection
                    true
                }
                R.id.menu_security_engineer -> {
                    // Handle security engineer position selection
                    true
                }
                // 디자인 직무
                R.id.menu_uiux_designer -> {
                    // Handle UI/UX designer position selection
                    true
                }
                R.id.menu_graphic_designer -> {
                    // Handle graphic designer position selection
                    true
                }
                R.id.menu_mobile_designer -> {
                    // Handle mobile designer position selection
                    true
                }
                R.id.menu_web_designer -> {
                    // Handle web designer position selection
                    true
                }
                R.id.menu_ad_designer -> {
                    // Handle ad designer position selection
                    true
                }
                R.id.menu_illustrator -> {
                    // Handle illustrator position selection
                    true
                }
                R.id.menu_2d_designer -> {
                    // Handle 2D designer position selection
                    true
                }
                R.id.menu_bibx_designer -> {
                    // Handle BI/BX designer position selection
                    true
                }
                R.id.menu_product_designer -> {
                    // Handle product designer position selection
                    true
                }
                R.id.menu_3d_designer -> {
                    // Handle 3D designer position selection
                    true
                }
                R.id.menu_video_motion_designer -> {
                    // Handle video/motion designer position selection
                    true
                }
                R.id.menu_character_designer -> {
                    // Handle character designer position selection
                    true
                }
                R.id.menu_fashion_designer -> {
                    // Handle fashion designer position selection
                    true
                }
                R.id.menu_space_designer -> {
                    // Handle space designer position selection
                    true
                }
                R.id.menu_publishing_editor_designer -> {
                    // Handle publishing/editor designer position selection
                    true
                }
                R.id.menu_industrial_designer -> {
                    // Handle industrial designer position selection
                    true
                }
                R.id.menu_interior_designer -> {
                    // Handle interior designer position selection
                    true
                }
                R.id.menu_furniture_designer -> {
                    // Handle furniture designer position selection
                    true
                }
                R.id.menu_landscape_designer -> {
                    // Handle landscape designer position selection
                    true
                }
                // Add more cases for other menu items
                else -> false
            }
        }

        // Your existing code...
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}