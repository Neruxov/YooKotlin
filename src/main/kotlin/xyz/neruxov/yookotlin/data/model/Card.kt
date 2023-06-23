package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName

data class Card(
    val first6: String?,
    val last4: String,
    @SerializedName("expiry_year")  val expiryYear: String,
    @SerializedName("expiry_month")  val expiryMonth: String,
    @SerializedName("card_type") val cardType: String,
    @SerializedName("issuer_country") val issuerCountry: String?,
    @SerializedName("issuer_name") val issuerName: String?,
    val source: String?,
)
