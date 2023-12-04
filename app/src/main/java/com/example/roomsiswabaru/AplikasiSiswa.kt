package com.example.roomsiswabaru

import android.app.Application
import com.example.roomsiswabaru.repositori.ContainerDataApp

class AplikasiSiswa: Application() {
    lateinit var container: ContainerDataApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}