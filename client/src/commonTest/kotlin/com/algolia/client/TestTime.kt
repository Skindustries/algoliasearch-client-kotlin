package com.algolia.client

import com.algolia.client.transport.internal.currentTimeMillis
import kotlin.test.Test
import kotlin.test.assertTrue

class TestTime {

  @Test
  fun currentTimeMillisIsEpochMillis() {
    val now = currentTimeMillis()
    // 2020-01-01T00:00:00Z
    assertTrue(now > 1_577_836_800_000L, "Expected epoch milliseconds, got $now")
  }

  @Test
  fun currentTimeMillisIsMonotonicEnough() {
    val first = currentTimeMillis()
    val second = currentTimeMillis()
    assertTrue(second >= first, "Expected $second >= $first")
  }
}
