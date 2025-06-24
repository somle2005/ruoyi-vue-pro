package com.jd.open.api.sdk.domain.order.OcsQueryJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderCostAmount implements Serializable {
   private BigDecimal bearAmount;
   private int bearer;
   private double bearRate;

   @JsonProperty("bearAmount")
   public void setBearAmount(BigDecimal bearAmount) {
      this.bearAmount = bearAmount;
   }

   @JsonProperty("bearAmount")
   public BigDecimal getBearAmount() {
      return this.bearAmount;
   }

   @JsonProperty("bearer")
   public void setBearer(int bearer) {
      this.bearer = bearer;
   }

   @JsonProperty("bearer")
   public int getBearer() {
      return this.bearer;
   }

   @JsonProperty("bearRate")
   public void setBearRate(double bearRate) {
      this.bearRate = bearRate;
   }

   @JsonProperty("bearRate")
   public double getBearRate() {
      return this.bearRate;
   }
}
