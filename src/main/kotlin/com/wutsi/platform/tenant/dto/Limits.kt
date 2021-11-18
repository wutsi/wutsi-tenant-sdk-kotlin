package com.wutsi.platform.tenant.dto

import kotlin.Double
import kotlin.String

public data class Limits(
  public val country: String = "",
  public val minCashin: Double = 0.0,
  public val minCashout: Double = 0.0
)
