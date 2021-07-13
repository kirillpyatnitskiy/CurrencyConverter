package com.example.currencyconverter.data.repository.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usd")
data class UsdEntity(
    @PrimaryKey val currency: String,
    val value: Double
)
