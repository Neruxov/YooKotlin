package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName

data class Recipient(
    @SerializedName("account_id") val accountId: String?,
    @SerializedName("gateway_id") val gatewayId: String,
)
