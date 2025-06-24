package com.jd.open.api.sdk.domain.xny.CarOrderService.request.getBatchChargeOrderMappingInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class String implements Serializable {
   private java.lang.String startChargeSeq;

   @JsonProperty("startChargeSeq")
   public void setStartChargeSeq(java.lang.String startChargeSeq) {
      this.startChargeSeq = startChargeSeq;
   }

   @JsonProperty("startChargeSeq")
   public java.lang.String getStartChargeSeq() {
      return this.startChargeSeq;
   }
}
