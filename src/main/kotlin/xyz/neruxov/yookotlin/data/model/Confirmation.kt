package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName


data class Confirmation(
    val type: String?,
    @SerializedName("confirmation_url") val confirmationUrl: String?,
    @SerializedName("confirmation_token") val confirmationToken: String?,
    @SerializedName("confirmation_data") val confirmationData: String?,
    @SerializedName("enforce") val enforce: Boolean?,
    @SerializedName("return_url") val returnUrl: String?,
)