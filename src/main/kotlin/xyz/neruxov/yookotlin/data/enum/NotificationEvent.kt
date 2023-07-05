package xyz.neruxov.yookotlin.data.enum

import com.google.gson.annotations.SerializedName

enum class NotificationEvent {
    @SerializedName("payment.waiting_for_capture")
    PAYMENT_WAITING_FOR_CAPTURE,
    @SerializedName("payment.succeeded")
    PAYMENT_SUCCEEDED,
    @SerializedName("payment.canceled")
    PAYMENT_CANCELED,
    @SerializedName("refund.succeeded")
    REFUND_SUCCEEDED,
}