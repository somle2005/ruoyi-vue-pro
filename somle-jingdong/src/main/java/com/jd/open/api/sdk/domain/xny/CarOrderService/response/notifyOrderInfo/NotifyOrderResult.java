package com.jd.open.api.sdk.domain.xny.CarOrderService.response.notifyOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NotifyOrderResult implements Serializable {
   private String connectorID;
   private Integer confirmResult;
   private String startChargeSeq;

   @JsonProperty("connectorID")
   public void setConnectorID(String connectorID) {
      this.connectorID = connectorID;
   }

   @JsonProperty("connectorID")
   public String getConnectorID() {
      return this.connectorID;
   }

   @JsonProperty("confirmResult")
   public void setConfirmResult(Integer confirmResult) {
      this.confirmResult = confirmResult;
   }

   @JsonProperty("confirmResult")
   public Integer getConfirmResult() {
      return this.confirmResult;
   }

   @JsonProperty("startChargeSeq")
   public void setStartChargeSeq(String startChargeSeq) {
      this.startChargeSeq = startChargeSeq;
   }

   @JsonProperty("startChargeSeq")
   public String getStartChargeSeq() {
      return this.startChargeSeq;
   }
}
