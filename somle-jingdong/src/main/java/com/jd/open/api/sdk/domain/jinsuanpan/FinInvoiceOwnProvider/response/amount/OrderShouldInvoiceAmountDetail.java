package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.amount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderShouldInvoiceAmountDetail implements Serializable {
   private BigDecimal[] shouldInvoiceAmount;
   private BigDecimal[] num;
   private BigDecimal[] price;
   private String[] productId;
   private String[] productName;

   @JsonProperty("shouldInvoiceAmount")
   public void setShouldInvoiceAmount(BigDecimal[] shouldInvoiceAmount) {
      this.shouldInvoiceAmount = shouldInvoiceAmount;
   }

   @JsonProperty("shouldInvoiceAmount")
   public BigDecimal[] getShouldInvoiceAmount() {
      return this.shouldInvoiceAmount;
   }

   @JsonProperty("num")
   public void setNum(BigDecimal[] num) {
      this.num = num;
   }

   @JsonProperty("num")
   public BigDecimal[] getNum() {
      return this.num;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal[] getPrice() {
      return this.price;
   }

   @JsonProperty("productId")
   public void setProductId(String[] productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public String[] getProductId() {
      return this.productId;
   }

   @JsonProperty("productName")
   public void setProductName(String[] productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String[] getProductName() {
      return this.productName;
   }
}
