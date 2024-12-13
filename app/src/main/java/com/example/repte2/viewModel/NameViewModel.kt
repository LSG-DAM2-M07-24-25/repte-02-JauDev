package com.example.repte2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel(character: Int, name: String) : ViewModel() {
    val character: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(character)
    }

    val name: MutableLiveData<String> by lazy {
        MutableLiveData<String>(name)
    }

    fun updateCharacter(character: Int) {
        this.character.value = character
    }

    fun updateName(name: String) {
        this.name.value = name
    }
}