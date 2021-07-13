package com.example.currencyconverter.data.repository.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "eur")
data class EurEntity(
    @PrimaryKey val currency: String,
    val value: Double
)
