package com.jd.open.api.sdk.domain.order.OcsQueryJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class AmountExpand implements Serializable {
   private List<OrderCostAmount> orderCostAmounts;
   private Integer type;
   private String typeName;
   private BigDecimal amount;

   @JsonProperty("orderCostAmounts")
   public void setOrderCostAmounts(List<OrderCostAmount> orderCostAmounts) {
      this.orderCostAmounts = orderCostAmounts;
   }

   @JsonProperty("orderCostAmounts")
   public List<OrderCostAmount> getOrderCostAmounts() {
      return this.orderCostAmounts;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("typeName")
   public void setTypeName(String typeName) {
      this.typeName = typeName;
   }

   @JsonProperty("typeName")
   public String getTypeName() {
      return this.typeName;
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
