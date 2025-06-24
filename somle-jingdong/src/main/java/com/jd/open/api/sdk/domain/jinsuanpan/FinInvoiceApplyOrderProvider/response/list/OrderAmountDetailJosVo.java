package com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceApplyOrderProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderAmountDetailJosVo implements Serializable {
   private Integer detailType;
   private BigDecimal shouldInvoiceAmount;
   private String productId;
   private BigDecimal price;
   private Integer num;
   private String productName;

   @JsonProperty("detailType")
   public void setDetailType(Integer detailType) {
      this.detailType = detailType;
   }

   @JsonProperty("detailType")
   public Integer getDetailType() {
      return this.detailType;
   }

   @JsonProperty("shouldInvoiceAmount")
   public void setShouldInvoiceAmount(BigDecimal shouldInvoiceAmount) {
      this.shouldInvoiceAmount = shouldInvoiceAmount;
   }

   @JsonProperty("shouldInvoiceAmount")
   public BigDecimal getShouldInvoiceAmount() {
      return this.shouldInvoiceAmount;
   }

   @JsonProperty("productId")
   public void setProductId(String productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public String getProductId() {
      return this.productId;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }
}
