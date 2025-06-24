package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.request.queryOrderLogisticsStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LogisticsStatusParam implements Serializable {
   private String orderNo;
   private Long orderLogisticsStateId;
   private String logisticsState;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("orderLogisticsStateId")
   public void setOrderLogisticsStateId(Long orderLogisticsStateId) {
      this.orderLogisticsStateId = orderLogisticsStateId;
   }

   @JsonProperty("orderLogisticsStateId")
   public Long getOrderLogisticsStateId() {
      return this.orderLogisticsStateId;
   }

   @JsonProperty("logisticsState")
   public void setLogisticsState(String logisticsState) {
      this.logisticsState = logisticsState;
   }

   @JsonProperty("logisticsState")
   public String getLogisticsState() {
      return this.logisticsState;
   }
}
