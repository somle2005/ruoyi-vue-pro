package com.jd.open.api.sdk.domain.youE.OrderTakeOutExportService.response.receiveOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FailOrderVO implements Serializable {
   private String orderNo;
   private Integer failCode;
   private String failInfo;

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

   @JsonProperty("failInfo")
   public void setFailInfo(String failInfo) {
      this.failInfo = failInfo;
   }

   @JsonProperty("failInfo")
   public String getFailInfo() {
      return this.failInfo;
   }
}
