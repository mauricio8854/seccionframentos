package com.mauriciogarcia.seccionframentos

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Main4Activity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val manager = supportFragmentManager
        val transaction=manager.beginTransaction()

        when (item.itemId) {
            R.id.navigation_superman -> {
                val supermanFragment= supermanFragment()
                transaction.replace(R.id.contenedor, supermanFragment).commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_batman -> {
                val batmanFragment= BatmanFragment()
                transaction.replace(R.id.contenedor, batmanFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_flash -> {
                val flashFragment= flashFragment()
                transaction.replace(R.id.contenedor, flashFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        //textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
