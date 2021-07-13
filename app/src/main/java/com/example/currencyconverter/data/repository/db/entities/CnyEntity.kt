package com.example.currencyconverter.data.repository.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cny")
data class CnyEntity(
    @PrimaryKey val currency: String,
    val value: Double
)