package com.jd.open.api.sdk.domain.ware.OrderBankAdapterJsfService.response.getPaymentNoResultByVender;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PaymentNoResult implements Serializable {
   private Long orderId;
   private Boolean success;
   private String errMsg;
   private String paymentNo;
   private String parentPaymentNo;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("paymentNo")
   public void setPaymentNo(String paymentNo) {
      this.paymentNo = paymentNo;
   }

   @JsonProperty("paymentNo")
   public String getPaymentNo() {
      return this.paymentNo;
   }

   @JsonProperty("parentPaymentNo")
   public void setParentPaymentNo(String parentPaymentNo) {
      this.parentPaymentNo = parentPaymentNo;
   }

   @JsonProperty("parentPaymentNo")
   public String getParentPaymentNo() {
      return this.parentPaymentNo;
   }
}
