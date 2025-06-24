package com.jd.open.api.sdk.domain.youE.OrderConfirmExportService.response.orderConfirmReceive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ConfirmFail implements Serializable {
   private String orderNo;
   private Integer failCode;
   private String failReason;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("failCode")
   public void setFailCode(Integer failCode) {
      this.failCode = failCode;
   }

   @JsonProperty("failCode")
   public Integer getFailCode() {
      return this.failCode;
   }

   @JsonProperty("failReason")
   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   @JsonProperty("failReason")
   public String getFailReason() {
      return this.failReason;
   }
}
