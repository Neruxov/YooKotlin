package xyz.neruxov.yookotlin.data.enum

import com.google.gson.annotations.SerializedName

enum class ReceiptRegistration {
    @SerializedName("pending") PENDING,
    @SerializedName("succeeded") SUCCEEDED,
    @SerializedName("canceled") CANCELED,
}