package com.jd.open.api.sdk.domain.jialilue.IOpenOrderService.response.syncOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderMoney implements Serializable {
   private BigDecimal realOrderPrice;

   @JsonProperty("realOrderPrice")
   public void setRealOrderPrice(BigDecimal realOrderPrice) {
      this.realOrderPrice = realOrderPrice;
   }

   @JsonProperty("realOrderPrice")
   public BigDecimal getRealOrderPrice() {
      return this.realOrderPrice;
   }
}
