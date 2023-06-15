package com.cntcts.contactsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cntcts.contactsapp.databinding.ActivityAddContactBinding
import com.cntcts.contactsapp.databinding.ActivityMainBinding

class AddContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()



        validateAdd()

    }

    fun validateAdd() {
        val name = binding.etname.text.toString()
        val email = binding.etemail.text.toString()
        val phone = binding.etphoneno.text.toString()
        var error = false

        if (name.isBlank()) {
            binding.etname.error = "Name is required"
            error = true
        } else {
            binding.tilname.error = null
        }

        if (email.isBlank()) {
            binding.etemail.error = "Email is required"
            error = true
        } else {
            binding.tilemail.error = null
        }

        if (phone.isEmpty()) {
            binding.etphoneno.error = "Phone Number is required"
            error = true
        } else {
            binding.tilphoneno.error = null
        }

        if (!error) {
            Toast.makeText(this, "contact add succesfully",Toast.LENGTH_SHORT)
                .show()
        }
    }
    }




