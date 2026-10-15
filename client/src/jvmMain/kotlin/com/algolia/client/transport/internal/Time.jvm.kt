package com.algolia.client.transport.internal

/**
 * Current epoch time in milliseconds.
 *
 * Uses [System.currentTimeMillis] instead of kotlinx-datetime's `Clock.System`, which is backed by
 * `java.time.Instant` and is unavailable on Android API < 26 without core library desugaring.
 */
internal actual fun currentTimeMillis(): Long = System.currentTimeMillis()
