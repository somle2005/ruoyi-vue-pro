package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StateOrderOpenResp implements Serializable {
   private Integer cancelOrderState;
   private Integer deliveryState;
   private Integer confirmState;
   private Integer jdOrderState;

   @JsonProperty("cancelOrderState")
   public void setCancelOrderState(Integer cancelOrderState) {
      this.cancelOrderState = cancelOrderState;
   }

   @JsonProperty("cancelOrderState")
   public Integer getCancelOrderState() {
      return this.cancelOrderState;
   }

   @JsonProperty("deliveryState")
   public void setDeliveryState(Integer deliveryState) {
      this.deliveryState = deliveryState;
   }

   @JsonProperty("deliveryState")
   public Integer getDeliveryState() {
      return this.deliveryState;
   }

   @JsonProperty("confirmState")
   public void setConfirmState(Integer confirmState) {
      this.confirmState = confirmState;
   }

   @JsonProperty("confirmState")
   public Integer getConfirmState() {
      return this.confirmState;
   }

   @JsonProperty("jdOrderState")
   public void setJdOrderState(Integer jdOrderState) {
      this.jdOrderState = jdOrderState;
   }

   @JsonProperty("jdOrderState")
   public Integer getJdOrderState() {
      return this.jdOrderState;
   }
}
