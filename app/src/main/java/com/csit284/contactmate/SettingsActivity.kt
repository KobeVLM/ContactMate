package com.csit284.contactmate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        val logout_button = findViewById<Button>(R.id.logoutButton)
        logout_button.setOnClickListener {
            Toast.makeText(this, "Logout button clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LogoutActivity::class.java)
            startActivity(intent)
        }
    }
}