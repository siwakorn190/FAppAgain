package com.example.fappagain

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.fappagain.database.DatabaseDAO
import com.example.fappagain.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}