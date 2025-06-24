package com.jd.open.api.sdk.domain.etms.CloudPrintApi.response.sheet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CodeAssociation implements Serializable {
   private String waybillCode;
   private String orderId;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }
}
