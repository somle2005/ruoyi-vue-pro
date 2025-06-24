package com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.request.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubsidyGetImgUrlParam implements Serializable {
   private Long orderId;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }
}
