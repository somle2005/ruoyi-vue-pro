package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PaymentInfoOrderOpenResp implements Serializable {
   private Integer paymentType;

   @JsonProperty("paymentType")
   public void setPaymentType(Integer paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("paymentType")
   public Integer getPaymentType() {
      return this.paymentType;
   }
}
