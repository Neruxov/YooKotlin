package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName

data class Transfer(
    @SerializedName("account_id") val accountId: String,
    val amount: Amount,
    val status: String,
    @SerializedName("platform_fee_amount") val platformFeeAmount: Amount?,
    val description: String?,
    val metadata: Map<String, String>?,
)