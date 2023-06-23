package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName

data class AuthorizationDetails(
    val rrn: String?,
    @SerializedName("auth_code") val authCode: String?,
    @SerializedName("three_d_secure") val threeDSecure: ThreeDSecure,
)