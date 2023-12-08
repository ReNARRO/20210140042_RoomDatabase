package com.example.roomsiswabaru.model

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.roomsiswabaru.repositori.RepositoriSiswa

class DetailsViewModel (
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
):ViewModel(){
    private val siswaId: Int = checkNotNull(SavedStateHandle[DetailsDestination.siswaIdArg])
}