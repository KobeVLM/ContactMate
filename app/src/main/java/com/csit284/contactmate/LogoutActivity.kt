package com.csit284.contactmate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LogoutActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logout)

        val cancelButton = findViewById<Button>(R.id.cancel)
        cancelButton.setOnClickListener() {
            Toast.makeText(this, "Cancel button is clicked!", Toast.LENGTH_LONG).show()

        }

        val logoutButton = findViewById<Button>(R.id.logout)
        logoutButton.setOnClickListener {
            Toast.makeText(this, "Logout button is clicked!", Toast.LENGTH_LONG).show()
        }

    }
}