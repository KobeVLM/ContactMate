package com.csit284.contactmate

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LoginActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val loginButton = findViewById<Button>(R.id.login)
        loginButton.setOnClickListener {
            Toast.makeText(this, "Login button clicked, going to Landing Page", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LandingActivity::class.java)
            startActivity(intent)
        }

        val registerButton = findViewById<Button>(R.id.register)
        registerButton.setOnClickListener {
            Toast.makeText(this, "Register button clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}