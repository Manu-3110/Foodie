package com.example.foodie


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class Viewmodel(application: Application) : AndroidViewModel(application) {
    val allNotes: LiveData<List<CartItems>>

    init{
        val dao= WordRoomDatabase.getDatabase(application).wordDao()
        val repository= Repository(dao)
        allNotes= repository.allNotes
    }
}
