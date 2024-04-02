
package com.example.ex1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.ex2.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val layout: LinearLayout =findViewById(R.id.layout)
        val tv1: TextView =findViewById(R.id.tv1)
        val btn1:Button=findViewById(R.id.btn1)
        val btn2: Button =findViewById(R.id.btn2)
        val btn3:Button=findViewById(R.id.btn3)
        var size:Float=10f
        var x:Int=0
        var y:Int=0

        btn1.setOnClickListener {
            tv1.setTextSize(size)
            size=(size+10)%80
        }
        btn2.setOnClickListener {
            when(x%3){
                0->tv1.setTextColor(Color.CYAN)
                1->tv1.setTextColor(Color.MAGENTA)
                2->tv1.setTextColor(Color.BLACK)
            }
            x=x+1
        }
        btn3.setOnClickListener {
            when(y%3){
                0->layout.setBackgroundColor(Color.BLUE)
                1->layout.setBackgroundColor(Color.MAGENTA)
                2->layout.setBackgroundColor(Color.GREEN)
            }
            y=y+1
        }
    }
}
