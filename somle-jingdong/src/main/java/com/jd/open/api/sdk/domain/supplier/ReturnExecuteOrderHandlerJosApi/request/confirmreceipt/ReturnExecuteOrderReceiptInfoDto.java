package com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.request.confirmreceipt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReturnExecuteOrderReceiptInfoDto implements Serializable {
   private Integer isInvoice;
   private List<ReturnExecuteOrderReceiptInfoDetailDto> receiptDetails;
   private String requestId;
   private String returnExecutionOrderId;

   @JsonProperty("isInvoice")
   public void setIsInvoice(Integer isInvoice) {
      this.isInvoice = isInvoice;
   }

   @JsonProperty("isInvoice")
   public Integer getIsInvoice() {
      return this.isInvoice;
   }

   @JsonProperty("receiptDetails")
   public void setReceiptDetails(List<ReturnExecuteOrderReceiptInfoDetailDto> receiptDetails) {
      this.receiptDetails = receiptDetails;
   }

   @JsonProperty("receiptDetails")
   public List<ReturnExecuteOrderReceiptInfoDetailDto> getReceiptDetails() {
      return this.receiptDetails;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("returnExecutionOrderId")
   public void setReturnExecutionOrderId(String returnExecutionOrderId) {
      this.returnExecutionOrderId = returnExecutionOrderId;
   }

   @JsonProperty("returnExecutionOrderId")
   public String getReturnExecutionOrderId() {
      return this.returnExecutionOrderId;
   }
}
