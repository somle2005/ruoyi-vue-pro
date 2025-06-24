package com.jd.open.api.sdk.domain.hudong.SuitPromoInitOuterService.request.SuitPromoInitOuterService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SuitPromoInitQueryVO implements Serializable {
   private String busiCode;
   private Long venderId;

   @JsonProperty("busiCode")
   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   @JsonProperty("busiCode")
   public String getBusiCode() {
      return this.busiCode;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }
}
