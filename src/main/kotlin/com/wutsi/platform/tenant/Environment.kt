package com.wutsi.platform.tenant

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-tenant-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-tenant-server-prod.herokuapp.com"),
  ;
}
