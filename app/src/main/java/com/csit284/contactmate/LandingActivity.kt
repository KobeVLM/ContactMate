package com.csit284.contactmate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing)

        val profileButton = findViewById<Button>(R.id.profileButton)
        profileButton.setOnClickListener {
            Toast.makeText(this, "Profile button clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val settingsButton = findViewById<Button>(R.id.settingsButton)
        settingsButton.setOnClickListener {
            Toast.makeText(this, "Settings button clicked!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)

        }

        val developersButton = findViewById<Button>(R.id.developersButton)
        developersButton.setOnClickListener {
            Toast.makeText(this, "Developers button clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DeveloperActivity::class.java)
            startActivity(intent)
        }
    }
}