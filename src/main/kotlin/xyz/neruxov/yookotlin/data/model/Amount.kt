package xyz.neruxov.yookotlin.data.model

import xyz.neruxov.yookotlin.data.enum.Currency

data class Amount(
    val value: String,
    val currency: Currency,
)
