package xyz.neruxov.yookotlin.data.enum

import com.google.gson.annotations.SerializedName

enum class VatType {
    @SerializedName("untaxed") UNTAXED,
    @SerializedName("calculated") CALCULATED,
    @SerializedName("mixed") MIXED,
}