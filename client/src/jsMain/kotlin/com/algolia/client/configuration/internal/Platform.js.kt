package com.algolia.client.configuration.internal

import com.algolia.client.configuration.AgentSegment
import com.algolia.client.configuration.ClientOptions
import io.ktor.client.*

internal actual fun platformAgentSegment(): AgentSegment {
    return if (isNode) {
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

/**
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 *
 * see: [ktorio/ktor](https://github.com/ktorio/ktor/blob/6cd529b2dcedfcfc4ca2af0f62704764e160d7fd/ktor-utils/js/src/io/ktor/util/PlatformUtilsJs.kt#L16)
 */
internal val isNode: Boolean by lazy {
    js(
        """
          (typeof process !== 'undefined' 
              && process.versions != null 
              && process.versions.node != null) ||
          (typeof window !== 'undefined' 
              && typeof window.process !== 'undefined' 
              && window.process.versions != null 
              && window.process.versions.node != null)
        """
    ) as Boolean
}