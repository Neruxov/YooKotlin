package xyz.neruxov.yookotlin.data.enum

import com.google.gson.annotations.SerializedName

enum class PaymentStatus {
    @SerializedName("pending") PENDING,
    @SerializedName("waiting_for_capture") WAITING_FOR_CAPTURE,
    @SerializedName("succeeded") SUCCEEDED,
    @SerializedName("canceled") CANCELED,
}