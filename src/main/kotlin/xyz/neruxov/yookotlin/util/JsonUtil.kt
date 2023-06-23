package xyz.neruxov.yookotlin.util

import com.google.gson.Gson
import com.google.gson.JsonObject

class JsonUtil {

    companion object {
        private val gson = Gson()

        @JvmStatic
        fun toJson(data: Any): JsonObject {
            return gson.toJsonTree(data).asJsonObject
        }

        @JvmStatic
        fun fromJson(json: String, clazz: Class<*>): Any {
            return gson.fromJson(json, clazz)
        }

        @JvmStatic
        fun fromJson(json: JsonObject, clazz: Class<*>): Any {
            return gson.fromJson(json, clazz)
        }

    }

}