package xyz.neruxov.yookotlin.data.model

import xyz.neruxov.yookotlin.data.enum.VatType

data class VatData(
    val type: VatType,
    val amount: String?,
    val rate: String?,
)