package com.jd.open.api.sdk.domain.youE.OrderConfirmExportService.request.orderConfirmReceive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ChangeInfoParam implements Serializable {
   private String orderNo;
   private String changeInfoVersion;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("changeInfoVersion")
   public void setChangeInfoVersion(String changeInfoVersion) {
      this.changeInfoVersion = changeInfoVersion;
   }

   @JsonProperty("changeInfoVersion")
   public String getChangeInfoVersion() {
      return this.changeInfoVersion;
   }
}
