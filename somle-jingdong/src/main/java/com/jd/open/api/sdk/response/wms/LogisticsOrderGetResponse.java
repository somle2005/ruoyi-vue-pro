package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class LogisticsOrderGetResponse extends AbstractResponse {
   private String receiptNo;
   private List<OrderStatusDetail> orderStatusDetails;
   private List<OrderPackageDetail> orderPackageDetails;

   @JsonProperty("receipt_no")
   public void setReceiptNo(String receiptNo) {
      this.receiptNo = receiptNo;
   }

   @JsonProperty("receipt_no")
   public String getReceiptNo() {
      return this.receiptNo;
   }

   @JsonProperty("order_status_details")
   public void setOrderStatusDetails(List<OrderStatusDetail> orderStatusDetails) {
      this.orderStatusDetails = orderStatusDetails;
   }

   @JsonProperty("order_status_details")
   public List<OrderStatusDetail> getOrderStatusDetails() {
      return this.orderStatusDetails;
   }

   @JsonProperty("order_package_details")
   public void setOrderPackageDetails(List<OrderPackageDetail> orderPackageDetails) {
      this.orderPackageDetails = orderPackageDetails;
   }

   @JsonProperty("order_package_details")
   public List<OrderPackageDetail> getOrderPackageDetails() {
      return this.orderPackageDetails;
   }
}
