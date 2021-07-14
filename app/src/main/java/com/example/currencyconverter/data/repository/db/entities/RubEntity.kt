package com.example.currencyconverter.data.repository.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rub")
data class RubEntity(
    @PrimaryKey val currency: String,
    val value: Double
)