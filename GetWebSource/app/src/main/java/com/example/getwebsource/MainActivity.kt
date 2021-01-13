package com.example.getwebsource

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var urLink = findViewById<TextInputEditText>(R.id.webInput)
        val getButton = findViewById<Button>(R.id.button)
        val pageSource = findViewById<TextView>(R.id.pageSource)
        val myspinner = findViewById<Spinner>(R.id.spinner)

        getButton.setOnClickListener {
            if (urLink.length()==0){
                urLink.setError("Enter URL!")
            }
            else {
                val getLink = urLink.text.toString()
                pageSource.text = getLink
            }
        }
    }
}