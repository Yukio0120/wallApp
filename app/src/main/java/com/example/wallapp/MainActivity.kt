package com.example.wallapp

import android.annotation.SuppressLint
import android.app.WallpaperManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img_wallpaper.setImageResource(R.drawable.one_img)
        img_wallpaper.setImageResource(R.drawable.img_two)
        set_up.setOnClickListener {
            val imgManager: WallpaperManager = WallpaperManager.getInstance(this)
            imgManager.setResource(R.drawable.one_img)
            imgManager.setResource(R.drawable.img_two)
        }
    }
}





