package com.csit284.contactmate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegisterActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val goBack = findViewById<Button>(R.id.go_back)
        goBack.setOnClickListener {
            Toast.makeText(this, "Go back button clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val signUpButton = findViewById<Button>(R.id.sign_up)
        signUpButton.setOnClickListener {
            Toast.makeText(this, "Sign up button clicked", Toast.LENGTH_SHORT).show()
            // sign up logic to be implemented
        }

    }
}