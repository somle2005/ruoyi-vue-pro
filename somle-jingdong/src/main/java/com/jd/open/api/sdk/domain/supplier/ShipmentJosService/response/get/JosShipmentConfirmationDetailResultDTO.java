package com.jd.open.api.sdk.domain.supplier.ShipmentJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosShipmentConfirmationDetailResultDTO implements Serializable {
   private Integer recordCount;
   private List<JosShipmentConfirmationLineDTO> shipmentConfirmationLineList;
   private boolean success;
   private String resultMessage;

   @JsonProperty("recordCount")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("shipmentConfirmationLineList")
   public void setShipmentConfirmationLineList(List<JosShipmentConfirmationLineDTO> shipmentConfirmationLineList) {
      this.shipmentConfirmationLineList = shipmentConfirmationLineList;
   }

   @JsonProperty("shipmentConfirmationLineList")
   public List<JosShipmentConfirmationLineDTO> getShipmentConfirmationLineList() {
      return this.shipmentConfirmationLineList;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
