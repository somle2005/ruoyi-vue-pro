package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderPaymentResp implements Serializable {
   private Date payCompleteTime;
   private Integer paymentType;
   private boolean delayPay;
   private List<AdditionalPaymentResp> additionalPayments;

   @JsonProperty("payCompleteTime")
   public void setPayCompleteTime(Date payCompleteTime) {
      this.payCompleteTime = payCompleteTime;
   }

   @JsonProperty("payCompleteTime")
   public Date getPayCompleteTime() {
      return this.payCompleteTime;
   }

   @JsonProperty("paymentType")
   public void setPaymentType(Integer paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("paymentType")
   public Integer getPaymentType() {
      return this.paymentType;
   }

   @JsonProperty("delayPay")
   public void setDelayPay(boolean delayPay) {
      this.delayPay = delayPay;
   }

   @JsonProperty("delayPay")
   public boolean getDelayPay() {
      return this.delayPay;
   }

   @JsonProperty("additionalPayments")
   public void setAdditionalPayments(List<AdditionalPaymentResp> additionalPayments) {
      this.additionalPayments = additionalPayments;
   }

   @JsonProperty("additionalPayments")
   public List<AdditionalPaymentResp> getAdditionalPayments() {
      return this.additionalPayments;
   }
}
