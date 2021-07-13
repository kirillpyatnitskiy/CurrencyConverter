package com.example.currencyconverter.data.repository.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chf")
data class ChfEntity(
    @PrimaryKey val currency: String,
    val value: Double
)
