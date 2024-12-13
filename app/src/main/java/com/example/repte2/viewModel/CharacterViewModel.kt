package com.example.repte2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CharacterViewModel(character: String) : ViewModel() {
    val character: MutableLiveData<String> by lazy {
        MutableLiveData<String>(character)
    }

    fun updateCharacter(character: String) {
        this.character.value = character
    }
}