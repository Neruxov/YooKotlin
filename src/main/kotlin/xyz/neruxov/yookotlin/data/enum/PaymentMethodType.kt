package xyz.neruxov.yookotlin.data.enum

import com.google.gson.annotations.SerializedName

enum class PaymentMethodType {
    @SerializedName("alfabank") ALFABANK,
    @SerializedName("mobile_balance") MOBILE_BALANCE,
    @SerializedName("bank_card") BANK_CARD,
    @SerializedName("installments") INSTALLMENTS,
    @SerializedName("cash") CASH,
    @SerializedName("sbp") SBP,
    @SerializedName("b2b_sberbank") B2B_SBERBANK,
    @SerializedName("tinkoff_bank") TINKOFF_BANK,
    @SerializedName("yoo_money") YOO_MONEY,
    @SerializedName("apply_pay") APPLE_PAY,
    @SerializedName("google_pay") GOOGLE_PAY,
    @SerializedName("qiwi") QIWI,
    @SerializedName("sberpay") SBERPAY,
    @SerializedName("wechat") WECHAT,
    @SerializedName("webmoney") WEBMONEY,
}