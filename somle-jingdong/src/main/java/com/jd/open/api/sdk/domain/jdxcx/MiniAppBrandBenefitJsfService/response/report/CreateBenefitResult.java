package com.jd.open.api.sdk.domain.jdxcx.MiniAppBrandBenefitJsfService.response.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CreateBenefitResult implements Serializable {
   private Integer status;

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
