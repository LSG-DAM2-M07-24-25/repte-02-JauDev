package com.example.repte2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel(character: String, name: String) : ViewModel() {
    val character: MutableLiveData<String> by lazy {
        MutableLiveData<String>(character)
    }

    val name: MutableLiveData<String> by lazy {
        MutableLiveData<String>(name)
    }
}