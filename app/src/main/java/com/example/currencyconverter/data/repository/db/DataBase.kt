package com.example.currencyconverter.data.repository.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.currencyconverter.data.repository.db.entities.ChfEntity
import com.example.currencyconverter.data.repository.db.entities.CnyEntity
import com.example.currencyconverter.data.repository.db.entities.EurEntity
import com.example.currencyconverter.data.repository.db.entities.GbpEntity
import com.example.currencyconverter.data.repository.db.entities.RubEntity
import com.example.currencyconverter.data.repository.db.entities.UsdEntity

@Database(
    entities = [
        ChfEntity::class,
        CnyEntity::class,
        RubEntity::class,
        EurEntity::class,
        GbpEntity::class,
        UsdEntity::class
    ],
    version = 1
)
abstract class DataBase: RoomDatabase() {
    abstract fun daoModel(): DaoModel

    companion object {
        private var INSTANCE: DataBase? = null

        fun destroyDB() {
            INSTANCE = null
        }

        fun getDB(context : Context? = null) : DataBase?{
            context?.let {
                if(INSTANCE == null){
                    synchronized(DataBase::class){
                        INSTANCE = Room.databaseBuilder(
                            it.applicationContext,
                            DataBase::class.java,
                            "currencyDB"
                        ).build()
                    }
                }
            }
            return INSTANCE
        }
    }
}