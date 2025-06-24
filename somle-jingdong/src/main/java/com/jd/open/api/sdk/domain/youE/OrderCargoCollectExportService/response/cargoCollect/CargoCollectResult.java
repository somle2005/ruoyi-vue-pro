package com.jd.open.api.sdk.domain.youE.OrderCargoCollectExportService.response.cargoCollect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CargoCollectResult implements Serializable {
   private String orderNo;
   private String orderState;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("orderState")
   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public String getOrderState() {
      return this.orderState;
   }
}
