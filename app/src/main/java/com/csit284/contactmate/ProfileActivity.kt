package com.csit284.contactmate

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ProfileActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val editButton = findViewById<Button>(R.id.editButton)
        editButton.setOnClickListener {
            Toast.makeText(this, "Edit button clicked", Toast.LENGTH_SHORT).show()
            // To be implemented
        }

        val cancelButton = findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener {
            Toast.makeText(this, "Cancel button clicked", Toast.LENGTH_SHORT).show()
            // Logic to be implemented
        }
    }
}