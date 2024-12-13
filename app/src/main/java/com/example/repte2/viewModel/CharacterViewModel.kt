package com.example.repte2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CharacterViewModel(character: Int) : ViewModel() {
    val character: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(character)
    }

    fun updateCharacter(character: Int) {
        this.character.value = character
    }
}