package com.example.currencyconverter.data.repository

import com.example.currencyconverter.data.models.Currency

interface DataProvider {
    fun getRub(): Map<Currency, Double>
    fun getUsd(): Map<Currency, Double>
    fun getEur(): Map<Currency, Double>
    fun getGbp(): Map<Currency, Double>
    fun getChf(): Map<Currency, Double>
    fun getCny(): Map<Currency, Double>
}