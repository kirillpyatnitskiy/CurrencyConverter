package com.example.currencyconverter

import android.app.Application
import com.example.currencyconverter.data.repository.RepositoryImpl
import com.example.currencyconverter.data.repository.db.DataBase

class App : Application() {

    var db: DataBase? = null

    override fun onCreate() {
        super.onCreate()
        db = DataBase.getDB(this.applicationContext)
        db?.let {
            RepositoryImpl.db = it
        }
    }
}