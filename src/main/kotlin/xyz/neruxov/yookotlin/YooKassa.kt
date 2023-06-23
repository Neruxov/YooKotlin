package xyz.neruxov.yookotlin

import com.google.gson.JsonObject
import xyz.neruxov.yookotlin.data.model.Payment
import xyz.neruxov.yookotlin.util.JsonUtil
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.*

class YooKassa (
    val shopId: String,
    val secretKey: String,
) {

    fun createPayment(data: Map<String, Any>): Payment {
        return post(Payment::class.java, "https://api.yookassa.ru/v3/payments", JsonUtil.toJson(data)) as Payment
    }

    fun getPayment(id: String): Payment {
        return get(Payment::class.java, "https://api.yookassa.ru/v3/payments/$id") as Payment
    }

    fun getPayments(): List<Payment> {
        val response = get(JsonObject::class.java, "https://api.yookassa.ru/v3/payments") as JsonObject
        val payments = response.getAsJsonArray("items")
        val list = mutableListOf<Payment>()
        payments.forEach { payment ->
            list.add(JsonUtil.fromJson(payment.asJsonObject, Payment::class.java) as Payment)
        }
        return list
    }

    fun capturePayment(id: String, data: Map<String, Any>): Payment {
        return post(Payment::class.java, "https://api.yookassa.ru/v3/payments/$id/capture", JsonUtil.toJson(data)) as Payment
    }

    fun cancelPayment(id: String): Payment {
        return post(Payment::class.java, "https://api.yookassa.ru/v3/payments/$id/cancel", JsonObject()) as Payment
    }

    private fun get(responseType: Class<*>, url: String): Any {
        val client = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("Content-Type", "application/json")
            .header("Idempotence-Key", UUID.randomUUID().toString())
            .header("Authorization", "Basic ${Base64.getEncoder().encodeToString("$shopId:$secretKey".toByteArray())}")
            .GET()
            .build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        return JsonUtil.fromJson(response.body(), responseType)
    }

    private fun post(responseType: Class<*>, url: String, data: JsonObject): Any {
        val client = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .header("Content-Type", "application/json")
            .header("Idempotence-Key", UUID.randomUUID().toString())
            .header("Authorization", "Basic ${Base64.getEncoder().encodeToString("$shopId:$secretKey".toByteArray())}")
            .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
            .build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        return JsonUtil.fromJson(response.body(), responseType)
    }

}