package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getdetailbyorderid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class JOSDetailResultDto implements Serializable {
   private Long orderId;
   private Date deliveryTime;
   private Integer recordCount;
   private List<PurchaseAllocationDetailDto> purchaseAllocationDetailList;
   private boolean success;
   private String resultCode;
   private String resultMessage;

   @JsonProperty("order_id")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("delivery_time")
   public void setDeliveryTime(Date deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   @JsonProperty("delivery_time")
   public Date getDeliveryTime() {
      return this.deliveryTime;
   }

   @JsonProperty("record_count")
   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("record_count")
   public Integer getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("purchase_allocation_detail_list")
   public void setPurchaseAllocationDetailList(List<PurchaseAllocationDetailDto> purchaseAllocationDetailList) {
      this.purchaseAllocationDetailList = purchaseAllocationDetailList;
   }

   @JsonProperty("purchase_allocation_detail_list")
   public List<PurchaseAllocationDetailDto> getPurchaseAllocationDetailList() {
      return this.purchaseAllocationDetailList;
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
