package com.algolia.client.configuration.internal

import com.algolia.client.configuration.AgentSegment
import com.algolia.client.configuration.ClientOptions
import io.ktor.client.*

internal actual fun platformAgentSegment(): AgentSegment {
    return if (js("typeof process !== 'undefined' && process.versions && process.versions.node") as Boolean) {
        // Node.js environment
        val nodeVersion = js("process.versions.node") as String
        AgentSegment("Node.js", nodeVersion)
    } else {
        // Browser environment
        val userAgent = js("navigator.userAgent") as? String ?: "Unknown Browser"
        AgentSegment("Browser", userAgent)
    }
}

internal actual fun HttpClientConfig<*>.platformConfig(options: ClientOptions) {
    // NO-OP for JavaScript - Ktor JS client handles configuration automatically
}