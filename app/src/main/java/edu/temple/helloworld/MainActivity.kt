package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    private lateinit var displayTextView: TextView//make it private
    private lateinit var nameEditText: EditText
    private lateinit var clickMeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = nameEditText.text
            displayTextView.text = getString(R.string.greeting_text, name)
        }


    }
}