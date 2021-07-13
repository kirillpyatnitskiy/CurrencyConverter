package com.example.currencyconverter

import androidx.lifecycle.ViewModel
import com.example.currencyconverter.models.Currency
import com.example.currencyconverter.models.Currency.RUB
import com.example.currencyconverter.models.Currency.USD
import com.example.currencyconverter.models.Currency.EUR
import com.example.currencyconverter.models.Currency.GBP
import com.example.currencyconverter.models.Currency.CHF
import com.example.currencyconverter.models.Currency.CNY



class MainViewModel : ViewModel(){

    val listCurrency = listOf<Currency>(RUB, USD, EUR, GBP, CHF, CNY)

}