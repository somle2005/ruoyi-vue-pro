package com.jd.open.api.sdk.domain.afsservice.PriceProtectSoaService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PriceProtectRecordDetailDto implements Serializable {
   private String realApplyId;
   private BigDecimal priceOrderPrice;
   private BigDecimal priceApplyPromotionPrice;
   private BigDecimal priceApplyJdPrice;
   private BigDecimal priceOrderOriginalPrice;
   private BigDecimal priceSkuApplyTaxPrice;
   private BigDecimal priceOrderTaxPrice;
   private BigDecimal priceOrderPromotionPrice;

   @JsonProperty("realApplyId")
   public void setRealApplyId(String realApplyId) {
      this.realApplyId = realApplyId;
   }

   @JsonProperty("realApplyId")
   public String getRealApplyId() {
      return this.realApplyId;
   }

   @JsonProperty("priceOrderPrice")
   public void setPriceOrderPrice(BigDecimal priceOrderPrice) {
      this.priceOrderPrice = priceOrderPrice;
   }

   @JsonProperty("priceOrderPrice")
   public BigDecimal getPriceOrderPrice() {
      return this.priceOrderPrice;
   }

   @JsonProperty("priceApplyPromotionPrice")
   public void setPriceApplyPromotionPrice(BigDecimal priceApplyPromotionPrice) {
      this.priceApplyPromotionPrice = priceApplyPromotionPrice;
   }

   @JsonProperty("priceApplyPromotionPrice")
   public BigDecimal getPriceApplyPromotionPrice() {
      return this.priceApplyPromotionPrice;
   }

   @JsonProperty("priceApplyJdPrice")
   public void setPriceApplyJdPrice(BigDecimal priceApplyJdPrice) {
      this.priceApplyJdPrice = priceApplyJdPrice;
   }

   @JsonProperty("priceApplyJdPrice")
   public BigDecimal getPriceApplyJdPrice() {
      return this.priceApplyJdPrice;
   }

   @JsonProperty("priceOrderOriginalPrice")
   public void setPriceOrderOriginalPrice(BigDecimal priceOrderOriginalPrice) {
      this.priceOrderOriginalPrice = priceOrderOriginalPrice;
   }

   @JsonProperty("priceOrderOriginalPrice")
   public BigDecimal getPriceOrderOriginalPrice() {
      return this.priceOrderOriginalPrice;
   }

   @JsonProperty("priceSkuApplyTaxPrice")
   public void setPriceSkuApplyTaxPrice(BigDecimal priceSkuApplyTaxPrice) {
      this.priceSkuApplyTaxPrice = priceSkuApplyTaxPrice;
   }

   @JsonProperty("priceSkuApplyTaxPrice")
   public BigDecimal getPriceSkuApplyTaxPrice() {
      return this.priceSkuApplyTaxPrice;
   }

   @JsonProperty("priceOrderTaxPrice")
   public void setPriceOrderTaxPrice(BigDecimal priceOrderTaxPrice) {
      this.priceOrderTaxPrice = priceOrderTaxPrice;
   }

   @JsonProperty("priceOrderTaxPrice")
   public BigDecimal getPriceOrderTaxPrice() {
      return this.priceOrderTaxPrice;
   }

   @JsonProperty("priceOrderPromotionPrice")
   public void setPriceOrderPromotionPrice(BigDecimal priceOrderPromotionPrice) {
      this.priceOrderPromotionPrice = priceOrderPromotionPrice;
   }

   @JsonProperty("priceOrderPromotionPrice")
   public BigDecimal getPriceOrderPromotionPrice() {
      return this.priceOrderPromotionPrice;
   }
}
