package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName

data class PayerBankDetails (
    @SerializedName("full_name") val fullName: String,
    @SerializedName("short_name") val shortName: String,
    val address: String,
    val inn: String,
    @SerializedName("bank_name")  val bankName: String,
    @SerializedName("bank_branch")  val bankBranch: String,
    @SerializedName("bank_bik")  val bankBik: String,
    val account: String,
    val kpp: String?,
)