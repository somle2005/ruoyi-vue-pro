package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosPurchaseOrderDetailProResultDTO implements Serializable {
   private Integer recordCount;
   private List<JosPurchaseOrderLineDTO> purchaseOrderLineList;
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

   @JsonProperty("purchaseOrderLineList")
   public void setPurchaseOrderLineList(List<JosPurchaseOrderLineDTO> purchaseOrderLineList) {
      this.purchaseOrderLineList = purchaseOrderLineList;
   }

   @JsonProperty("purchaseOrderLineList")
   public List<JosPurchaseOrderLineDTO> getPurchaseOrderLineList() {
      return this.purchaseOrderLineList;
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
