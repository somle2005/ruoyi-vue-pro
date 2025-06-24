package com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.request.confirmreceipt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReturnExecuteOrderReceiptInfoDetailDto implements Serializable {
   private Integer receiptType;
   private String reportId;
   private List<ReturnExecuteOrderReceiptInfoSkuDetailDto> skuDetails;
   private Integer exceptionReason;

   @JsonProperty("receiptType")
   public void setReceiptType(Integer receiptType) {
      this.receiptType = receiptType;
   }

   @JsonProperty("receiptType")
   public Integer getReceiptType() {
      return this.receiptType;
   }

   @JsonProperty("reportId")
   public void setReportId(String reportId) {
      this.reportId = reportId;
   }

   @JsonProperty("reportId")
   public String getReportId() {
      return this.reportId;
   }

   @JsonProperty("skuDetails")
   public void setSkuDetails(List<ReturnExecuteOrderReceiptInfoSkuDetailDto> skuDetails) {
      this.skuDetails = skuDetails;
   }

   @JsonProperty("skuDetails")
   public List<ReturnExecuteOrderReceiptInfoSkuDetailDto> getSkuDetails() {
      return this.skuDetails;
   }

   @JsonProperty("exceptionReason")
   public void setExceptionReason(Integer exceptionReason) {
      this.exceptionReason = exceptionReason;
   }

   @JsonProperty("exceptionReason")
   public Integer getExceptionReason() {
      return this.exceptionReason;
   }
}
