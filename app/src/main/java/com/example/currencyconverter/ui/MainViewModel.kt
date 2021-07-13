package com.example.currencyconverter.ui

import androidx.lifecycle.ViewModel
import com.example.currencyconverter.data.models.Currency
import com.example.currencyconverter.data.models.Currency.CHF
import com.example.currencyconverter.data.models.Currency.CNY
import com.example.currencyconverter.data.models.Currency.EUR
import com.example.currencyconverter.data.models.Currency.GBP
import com.example.currencyconverter.data.models.Currency.RUB
import com.example.currencyconverter.data.models.Currency.USD


class MainViewModel : ViewModel() {

    val listCurrency = listOf<Currency>(RUB, USD, EUR, GBP, CHF, CNY)

}