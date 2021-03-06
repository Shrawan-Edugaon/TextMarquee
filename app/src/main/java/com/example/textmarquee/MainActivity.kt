package com.example.textmarquee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marquee = findViewById<TextView>(R.id.txtMarquee)
        val click = findViewById<Button>(R.id.btnClick)

        click.setOnClickListener {
            marquee.text ="This is Marquee Text this text needs to be logn and single line in order to see the marquee effects....Enjoy:-)"
            marquee.setSingleLine()
            marquee.ellipsize = TextUtils.TruncateAt.MARQUEE
            marquee.marqueeRepeatLimit=-1 // -1 -> for infinnite effects and 1 -> for finite effect
            marquee.isSelected = true
        }
    }
}