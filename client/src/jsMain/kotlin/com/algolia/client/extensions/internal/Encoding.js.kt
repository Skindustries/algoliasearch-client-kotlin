package com.algolia.client.extensions.internal

@JsModule("crypto-js")
@JsNonModule
private external val CryptoJS: dynamic

internal actual fun encodeKeySHA256(key: String, message: String): String {
    val hmac = CryptoJS.HmacSHA256(message, key)
    return hmac.toString(CryptoJS.enc.Hex) as String
}