package com.algolia.client.transport.internal

import kotlinx.datetime.Clock

/** Current epoch time in milliseconds */
internal actual fun currentTimeMillis(): Long = Clock.System.now().toEpochMilliseconds()
