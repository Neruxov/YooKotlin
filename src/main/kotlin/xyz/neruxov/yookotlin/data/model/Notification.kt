package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName
import xyz.neruxov.yookotlin.data.enum.NotificationEvent

data class Notification (
    val type: String,
    val event: NotificationEvent,
    @SerializedName("object") val payment: Payment,
)