package com.example.parcijalni2_28062023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcijalni2_28062023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var remindersList: ArrayList<Reminders> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            supportFragmentManager.beginTransaction()
                .replace(R.id.flFragment, Fragment())
                .commit()
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rvReminders.layoutManager = LinearLayoutManager(this)
         binding.rvReminders.adapter =ReminedersAdapter(remindersList, this)

       // setupListeners()


    }




}