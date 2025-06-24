package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PriceOrderOpenResp implements Serializable {
   private BigDecimal orderTotalFreight;
   private BigDecimal orderTotalPrice;
   private BigDecimal orderNakedPrice;
   private BigDecimal orderTaxPrice;

   @JsonProperty("orderTotalFreight")
   public void setOrderTotalFreight(BigDecimal orderTotalFreight) {
      this.orderTotalFreight = orderTotalFreight;
   }

   @JsonProperty("orderTotalFreight")
   public BigDecimal getOrderTotalFreight() {
      return this.orderTotalFreight;
   }

   @JsonProperty("orderTotalPrice")
   public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
      this.orderTotalPrice = orderTotalPrice;
   }

   @JsonProperty("orderTotalPrice")
   public BigDecimal getOrderTotalPrice() {
      return this.orderTotalPrice;
   }

   @JsonProperty("orderNakedPrice")
   public void setOrderNakedPrice(BigDecimal orderNakedPrice) {
      this.orderNakedPrice = orderNakedPrice;
   }

   @JsonProperty("orderNakedPrice")
   public BigDecimal getOrderNakedPrice() {
      return this.orderNakedPrice;
   }

   @JsonProperty("orderTaxPrice")
   public void setOrderTaxPrice(BigDecimal orderTaxPrice) {
      this.orderTaxPrice = orderTaxPrice;
   }

   @JsonProperty("orderTaxPrice")
   public BigDecimal getOrderTaxPrice() {
      return this.orderTaxPrice;
   }
}
