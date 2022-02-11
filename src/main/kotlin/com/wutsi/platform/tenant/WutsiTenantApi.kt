package com.wutsi.platform.tenant

import com.wutsi.platform.tenant.dto.GetTenantResponse
import com.wutsi.platform.tenant.dto.ListTenantResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface WutsiTenantApi {
  @RequestLine("GET /v1/tenants")
  @Headers(value=["Content-Type: application/json"])
  public fun listTenants(): ListTenantResponse

  @RequestLine("GET /v1/tenants/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getTenant(@Param("id") id: Long): GetTenantResponse
}
