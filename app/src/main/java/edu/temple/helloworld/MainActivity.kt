package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var displayTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val name = nameEditText.text.toString().trim()

            if (name.isEmpty()) {
                displayTextView.text = getString(R.string.error_message_no_name)
            } else {
                displayTextView.text = getString(R.string.greeting_text, name)
            }
        }
    }
}
