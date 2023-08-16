package com.example.photoframeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.alpha


class MainActivity : AppCompatActivity() {
    var currentImg = 0
    lateinit var image : ImageView
    var names = arrayOf("Sandeep Maheshwari", "Shiv Khera", "Les Brown")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prev = findViewById<Button>(R.id.prevbtn)
        val next =findViewById<Button>(R.id.nextbtn)
        val name = findViewById<TextView>(R.id.textView2)

        prev.setOnClickListener {

            val idCurrentImgStr = "img$currentImg"
            val idCurrentImgInt = this.resources.getIdentifier(idCurrentImgStr,"id", packageName)

            image = findViewById(idCurrentImgInt)
            image.alpha = 0F

            currentImg = (3 + currentImg - 1)%3

            val idImgToShowString = "img$currentImg"
            val idImgToShowInt = this.resources.getIdentifier(idImgToShowString, "id", packageName)

            image = findViewById(idImgToShowInt)
            image.alpha = 1F
            name.text = names[currentImg]
        }
        next.setOnClickListener {

            val idCurrentImgStr = "img$currentImg"
            val idCurrentImgInt = this.resources.getIdentifier(idCurrentImgStr,"id", packageName)

            image = findViewById(idCurrentImgInt)
            image.alpha = 0F

            currentImg = (currentImg + 1)%3

            val idImgToShowString = "img$currentImg"
            val idImgToShowInt = this.resources.getIdentifier(idImgToShowString, "id", packageName)

            image = findViewById(idImgToShowInt)
            image.alpha = 1F
            name.text = names[currentImg]

        }
    }
}