package xyz.neruxov.yookotlin.data.model

data class Settlement(
    val type: String = "payout",
    val amount: Amount,
)