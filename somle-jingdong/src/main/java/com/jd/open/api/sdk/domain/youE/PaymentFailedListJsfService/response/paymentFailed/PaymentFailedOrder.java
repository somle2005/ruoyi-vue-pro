package com.jd.open.api.sdk.domain.youE.PaymentFailedListJsfService.response.paymentFailed;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PaymentFailedOrder implements Serializable {
   private String paymentErrInfo;
   private String orderNo;

   @JsonProperty("paymentErrInfo")
   public void setPaymentErrInfo(String paymentErrInfo) {
      this.paymentErrInfo = paymentErrInfo;
   }

   @JsonProperty("paymentErrInfo")
   public String getPaymentErrInfo() {
      return this.paymentErrInfo;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }
}
