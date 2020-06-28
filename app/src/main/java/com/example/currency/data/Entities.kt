package com.example.currency.data

import com.google.gson.annotations.SerializedName

data class Currency(
    val rates: Rates
)

data class Rates(
    @SerializedName("RUB") val rub: Double,
    @SerializedName("EUR") val eur: Double
)
