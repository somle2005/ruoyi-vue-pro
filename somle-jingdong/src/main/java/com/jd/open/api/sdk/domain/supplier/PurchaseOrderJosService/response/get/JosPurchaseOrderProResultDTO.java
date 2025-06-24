package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosPurchaseOrderProResultDTO implements Serializable {
   private Integer recordCount;
   private List<JosPurchaseOrderProDTO> purchaseOrderList;
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

   @JsonProperty("purchaseOrderList")
   public void setPurchaseOrderList(List<JosPurchaseOrderProDTO> purchaseOrderList) {
      this.purchaseOrderList = purchaseOrderList;
   }

   @JsonProperty("purchaseOrderList")
   public List<JosPurchaseOrderProDTO> getPurchaseOrderList() {
      return this.purchaseOrderList;
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
