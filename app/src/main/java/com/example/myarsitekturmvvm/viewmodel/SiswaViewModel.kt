package com.example.myarsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myarsitekturmvvm.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(listData: MutableList<String>) {
        _statusUI.update { currentState ->
            currentState.copy(
                nama = listData[0],
                gender = listData[1],

            )
        }
    }
}