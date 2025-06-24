package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CartReq implements Serializable {
   private BigDecimal totalAmount;
   private BigDecimal totalPurchaseAmount;
   private List<SkuReq> skuItems;
   private List<SuiteReq> suiteItems;

   @JsonProperty("totalAmount")
   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   @JsonProperty("totalPurchaseAmount")
   public void setTotalPurchaseAmount(BigDecimal totalPurchaseAmount) {
      this.totalPurchaseAmount = totalPurchaseAmount;
   }

   @JsonProperty("totalPurchaseAmount")
   public BigDecimal getTotalPurchaseAmount() {
      return this.totalPurchaseAmount;
   }

   @JsonProperty("skuItems")
   public void setSkuItems(List<SkuReq> skuItems) {
      this.skuItems = skuItems;
   }

   @JsonProperty("skuItems")
   public List<SkuReq> getSkuItems() {
      return this.skuItems;
   }

   @JsonProperty("suiteItems")
   public void setSuiteItems(List<SuiteReq> suiteItems) {
      this.suiteItems = suiteItems;
   }

   @JsonProperty("suiteItems")
   public List<SuiteReq> getSuiteItems() {
      return this.suiteItems;
   }
}
