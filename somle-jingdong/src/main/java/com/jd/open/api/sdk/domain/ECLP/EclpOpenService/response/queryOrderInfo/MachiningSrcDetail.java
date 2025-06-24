package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class MachiningSrcDetail implements Serializable {
   private String ownerNo;
   private String skuNo;
   private String productLevel;
   private BigDecimal qty;

   @JsonProperty("ownerNo")
   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   @JsonProperty("ownerNo")
   public String getOwnerNo() {
      return this.ownerNo;
   }

   @JsonProperty("skuNo")
   public void setSkuNo(String skuNo) {
      this.skuNo = skuNo;
   }

   @JsonProperty("skuNo")
   public String getSkuNo() {
      return this.skuNo;
   }

   @JsonProperty("productLevel")
   public void setProductLevel(String productLevel) {
      this.productLevel = productLevel;
   }

   @JsonProperty("productLevel")
   public String getProductLevel() {
      return this.productLevel;
   }

   @JsonProperty("qty")
   public void setQty(BigDecimal qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public BigDecimal getQty() {
      return this.qty;
   }
}
