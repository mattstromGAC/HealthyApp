package com.healthyorg.android.healthyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class QuotesActivity : AppCompatActivity() {

    private lateinit var newQuoteButton: Button
    private lateinit var quoteTextView: TextView

    var quotes: Array<String> = arrayOf("You can do this!", "Take a moment to relax", "Take a deep breath",
    "Everything is going to be fine", "You've got this!", "Nice work today!", "Don't stop until you're proud",
    "Every day may not be good, but there is something good in every day", "You tried :)")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)

        newQuoteButton = findViewById(R.id.new_quote_button)
        quoteTextView = findViewById(R.id.quote_text_view)

        newQuoteButton.setOnClickListener {
            val rando = (0..8).random()
            val currentQuote = quotes[rando]
            quoteTextView.setText(currentQuote)
        }

    }
}