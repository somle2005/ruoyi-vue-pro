package com.jd.open.api.sdk.domain.plgz.BrandOperateFacade.request.queryOperateBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CallerParam implements Serializable {
   private Integer buid;
   private Integer tenantId;

   @JsonProperty("buid")
   public void setBuid(Integer buid) {
      this.buid = buid;
   }

   @JsonProperty("buid")
   public Integer getBuid() {
      return this.buid;
   }

   @JsonProperty("tenantId")
   public void setTenantId(Integer tenantId) {
      this.tenantId = tenantId;
   }

   @JsonProperty("tenantId")
   public Integer getTenantId() {
      return this.tenantId;
   }
}
