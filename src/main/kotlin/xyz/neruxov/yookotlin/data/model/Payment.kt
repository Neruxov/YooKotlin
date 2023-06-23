package xyz.neruxov.yookotlin.data.model

import com.google.gson.annotations.SerializedName
import xyz.neruxov.yookotlin.data.enum.PaymentMethodType
import xyz.neruxov.yookotlin.data.enum.PaymentStatus

data class Payment(
    val id: String,
    val status: PaymentStatus,
    val amount: Amount,
    @SerializedName("income_amount") val incomeAmount: Amount?,
    val description: String?,
    val recipient: Recipient,
    @SerializedName("payment_method") val paymentMethod: PaymentMethod,
    @SerializedName("captured_at") val capturedAt: String?,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("expires_at") val expiresAt: String?,
    val confirmation: Confirmation?,
    val test: Boolean,
    @SerializedName("refunded_amount") val refundedAmount: Amount?,
    val paid: Boolean,
    val refundable: Boolean,
    @SerializedName("receipt_registration") val receiptRegistration: PaymentMethodType?,
    val metadata: Map<String, String>,
    @SerializedName("cancellation_details") val cancellationDetails: CancellationDetails?,
    @SerializedName("authorization_details") val authorizationDetails: AuthorizationDetails?,
    val transfers: List<Transfer>?,
    val deal: Deal?,
    @SerializedName("merchant_customer_id") val merchantCustomerId: String?,
)
