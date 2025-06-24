package com.jd.open.api.sdk.domain.plgz.BrandCategoryCheckIsvFacade.request.batchCheckBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CallerParam implements Serializable {
   private Integer buid;
   private Integer tenantId;
   private String terminal;

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

   @JsonProperty("terminal")
   public void setTerminal(String terminal) {
      this.terminal = terminal;
   }

   @JsonProperty("terminal")
   public String getTerminal() {
      return this.terminal;
   }
}
