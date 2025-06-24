package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PaymentReq implements Serializable {
   private Integer paymentType;
   private Integer delayPay;

   @JsonProperty("paymentType")
   public void setPaymentType(Integer paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("paymentType")
   public Integer getPaymentType() {
      return this.paymentType;
   }

   @JsonProperty("delayPay")
   public void setDelayPay(Integer delayPay) {
      this.delayPay = delayPay;
   }

   @JsonProperty("delayPay")
   public Integer getDelayPay() {
      return this.delayPay;
   }
}
