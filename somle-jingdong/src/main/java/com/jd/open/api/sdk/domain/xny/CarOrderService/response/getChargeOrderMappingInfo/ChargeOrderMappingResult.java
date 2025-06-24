package com.jd.open.api.sdk.domain.xny.CarOrderService.response.getChargeOrderMappingInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ChargeOrderMappingResult implements Serializable {
   private String startChargeSeq;
   private String mappingJson;

   @JsonProperty("startChargeSeq")
   public void setStartChargeSeq(String startChargeSeq) {
      this.startChargeSeq = startChargeSeq;
   }

   @JsonProperty("startChargeSeq")
   public String getStartChargeSeq() {
      return this.startChargeSeq;
   }

   @JsonProperty("mappingJson")
   public void setMappingJson(String mappingJson) {
      this.mappingJson = mappingJson;
   }

   @JsonProperty("mappingJson")
   public String getMappingJson() {
      return this.mappingJson;
   }
}
