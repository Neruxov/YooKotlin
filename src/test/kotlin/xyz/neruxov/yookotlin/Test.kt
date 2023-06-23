package xyz.neruxov.yookotlin

import org.junit.jupiter.api.Test
import xyz.neruxov.yookotlin.util.JsonUtil

internal class Test {

    private val yooKassa: YooKassa = YooKassa("", "")

    @Test
    fun main() {
//        val response = yooKassa.createPayment(mapOf(
//            "amount" to mapOf(
//                "value" to "2.00",
//                "currency" to "RUB"
//            ),
//            "confirmation" to mapOf(
//                "type" to "redirect",
//                "return_url" to "https://example.com"
//            ),
//            "description" to "testing sdk",
//            "capture" to true
//        ))
        val response = yooKassa.getPayment("2c279a98-000f-5000-8000-1392de9bc9f2")
//        val response = yooKassa.getPayments()
//        val response = yooKassa.capturePayment("2c26f1a8-000f-5000-a000-103d445eeb5e", mapOf(
//            "amount" to mapOf(
//                "value" to "2.00",
//                "currency" to "RUB"
//            )
//        ))
//        val response = yooKassa.cancelPayment("2c26f252-000f-5000-9000-1ce906af2e4f")
        println(response)
        try {
            println(JsonUtil.toJson(response))
        } catch (_: Exception) { }
    }

}