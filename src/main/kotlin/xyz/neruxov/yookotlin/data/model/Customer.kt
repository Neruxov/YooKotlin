package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName

data class Customer(
    @SerializedName("full_name") val fullName: String?,
    val inn: String?,
    val email: String?,
    val phone: String?,
)
