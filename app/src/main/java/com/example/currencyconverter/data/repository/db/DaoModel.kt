package com.example.currencyconverter.data.repository.db

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.currencyconverter.data.models.Currency
import com.example.currencyconverter.data.repository.db.entities.ChfEntity
import com.example.currencyconverter.data.repository.db.entities.CnyEntity
import com.example.currencyconverter.data.repository.db.entities.EurEntity
import com.example.currencyconverter.data.repository.db.entities.GbpEntity
import com.example.currencyconverter.data.repository.db.entities.RubEntity
import com.example.currencyconverter.data.repository.db.entities.UsdEntity
import com.example.currencyconverter.data.repository.db.helpers.CurrencyHelper

interface DaoModel {

    @Query("Select * FROM rub")
    fun getRubQuotation() : List<CurrencyHelper>

    @Query("Select * FROM usd")
    fun getUsdQuotation() : List<CurrencyHelper>

    @Query("Select * FROM eur")
    fun getEurQuotation() : List<CurrencyHelper>

    @Query("Select * FROM gbp")
    fun getGbpQuotation() : List<CurrencyHelper>

    @Query("Select * FROM chf")
    fun getChfQuotation() : List<CurrencyHelper>

    @Query("Select * FROM cny")
    fun getCnyQuotation() : List<CurrencyHelper>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveRubQuotation() : List<RubEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveUsdQuotation() : List<UsdEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveEurQuotation() : List<EurEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveGbpQuotation() : List<GbpEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveChfQuotation() : List<ChfEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCnyQuotation() : List<CnyEntity>

}