package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getpurchaseorderlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JOSOrderResultDto implements Serializable {
   private Integer recordCount;
   private List<PurchaseOrderDto> purchaseOrderList;
   private boolean success;
   private String resultCode;
   private String resultMessage;

   @JsonProperty("record_count")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("record_count")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("purchase_order_list")
   public void setPurchaseOrderList(List<PurchaseOrderDto> purchaseOrderList) {
      this.purchaseOrderList = purchaseOrderList;
   }

   @JsonProperty("purchase_order_list")
   public List<PurchaseOrderDto> getPurchaseOrderList() {
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

   @JsonProperty("result_code")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_message")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("result_message")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
