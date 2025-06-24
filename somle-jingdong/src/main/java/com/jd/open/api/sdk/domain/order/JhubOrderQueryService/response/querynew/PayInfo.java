package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PayInfo implements Serializable {
   private Integer payType;
   private Long payMoney;

   @JsonProperty("payType")
   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   @JsonProperty("payType")
   public Integer getPayType() {
      return this.payType;
   }

   @JsonProperty("payMoney")
   public void setPayMoney(Long payMoney) {
      this.payMoney = payMoney;
   }

   @JsonProperty("payMoney")
   public Long getPayMoney() {
      return this.payMoney;
   }
}
