package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName
import xyz.neruxov.yookotlin.data.enum.PaymentMethodType

data class PaymentMethod(
    val type: PaymentMethodType,
    val id: String,
    val saved: Boolean,
    val title: String?,
    val card: Card?,
    val login: String?,
    val phone: String?,
    @SerializedName("account_number") val accountNumber: String?,
    @SerializedName("payer_bank_details") val payerBankDetails: PayerBankDetails?,
    @SerializedName("payment_purpose") val paymentPurpose: String?,
    @SerializedName("vat_data") val vatData: VatData?,
)
