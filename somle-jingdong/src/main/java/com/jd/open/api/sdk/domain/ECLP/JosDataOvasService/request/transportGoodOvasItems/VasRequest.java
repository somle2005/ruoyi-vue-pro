package com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.request.transportGoodOvasItems;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VasRequest implements Serializable {
   private String serviceCode;
   private String goodsDemand;
   private String status;

   @JsonProperty("serviceCode")
   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   @JsonProperty("serviceCode")
   public String getServiceCode() {
      return this.serviceCode;
   }

   @JsonProperty("goodsDemand")
   public void setGoodsDemand(String goodsDemand) {
      this.goodsDemand = goodsDemand;
   }

   @JsonProperty("goodsDemand")
   public String getGoodsDemand() {
      return this.goodsDemand;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }
}
