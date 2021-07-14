package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.models.Currency
import com.example.currencyconverter.data.repository.db.DataBase
import com.example.currencyconverter.data.repository.db.entities.ChfEntity
import com.example.currencyconverter.data.repository.db.entities.CnyEntity
import com.example.currencyconverter.data.repository.db.entities.EurEntity
import com.example.currencyconverter.data.repository.db.entities.GbpEntity
import com.example.currencyconverter.data.repository.db.entities.RubEntity
import com.example.currencyconverter.data.repository.db.entities.UsdEntity

interface Repository {

    var db: DataBase

    fun getRub(): Map<Currency, Double>
    fun getUsd(): Map<Currency, Double>
    fun getEur(): Map<Currency, Double>
    fun getGbp(): Map<Currency, Double>
    fun getChf(): Map<Currency, Double>
    fun getCny(): Map<Currency, Double>

    fun saveRub(quotations: List<RubEntity>)
    fun saveUsd(quotations: List<UsdEntity>)
    fun saveEur(quotations: List<EurEntity>)
    fun saveGbp(quotations: List<GbpEntity>)
    fun saveChf(quotations: List<ChfEntity>)
    fun saveCny(quotations: List<CnyEntity>)
}