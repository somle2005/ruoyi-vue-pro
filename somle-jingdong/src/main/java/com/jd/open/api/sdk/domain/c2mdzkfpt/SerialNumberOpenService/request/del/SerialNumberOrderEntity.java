package com.jd.open.api.sdk.domain.c2mdzkfpt.SerialNumberOpenService.request.del;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SerialNumberOrderEntity implements Serializable {
   private String serialNumber;
   private Long coId;
   private String sku;

   @JsonProperty("serialNumber")
   public void setSerialNumber(String serialNumber) {
      this.serialNumber = serialNumber;
   }

   @JsonProperty("serialNumber")
   public String getSerialNumber() {
      return this.serialNumber;
   }

   @JsonProperty("coId")
   public void setCoId(Long coId) {
      this.coId = coId;
   }

   @JsonProperty("coId")
   public Long getCoId() {
      return this.coId;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }
}
