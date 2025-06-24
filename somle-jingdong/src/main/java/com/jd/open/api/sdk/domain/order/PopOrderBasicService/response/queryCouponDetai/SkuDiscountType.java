package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.queryCouponDetai;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SkuDiscountType implements Serializable {
   private Integer type;
   private BigDecimal amount;

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal getAmount() {
      return this.amount;
   }
}
