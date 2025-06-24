package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.response.queryOrderLogisticsStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class LogisticsStatusInfo implements Serializable {
   private String logisticsTime;
   private String orderNo;
   private Long orderLogisticsStateId;
   private String mainOrderId;
   private String logisticsState;

   @JsonProperty("logisticsTime")
   public void setLogisticsTime(String logisticsTime) {
      this.logisticsTime = logisticsTime;
   }

   @JsonProperty("logisticsTime")
   public String getLogisticsTime() {
      return this.logisticsTime;
   }

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

   @JsonProperty("mainOrderId")
   public void setMainOrderId(String mainOrderId) {
      this.mainOrderId = mainOrderId;
   }

   @JsonProperty("mainOrderId")
   public String getMainOrderId() {
      return this.mainOrderId;
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
