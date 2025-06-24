package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderDefaultResultStatus implements Serializable {
   private String eclpSoNo;
   private String isvUUID;
   private List<OrderStatus> orderStatusList;

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("isvUUID")
   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   @JsonProperty("isvUUID")
   public String getIsvUUID() {
      return this.isvUUID;
   }

   @JsonProperty("orderStatusList")
   public void setOrderStatusList(List<OrderStatus> orderStatusList) {
      this.orderStatusList = orderStatusList;
   }

   @JsonProperty("orderStatusList")
   public List<OrderStatus> getOrderStatusList() {
      return this.orderStatusList;
   }
}
