package com.jd.open.api.sdk.domain.supplier.ReturnOrderForJosWebService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class RoDetailDto implements Serializable {
   private Long wareId;
   private String wareName;
   private String brandName;
   private BigDecimal returnsPrice;
   private Integer returnsNum;
   private Integer factNum;
   private BigDecimal totalPrice;
   private String isbn;
   private BigDecimal discount;
   private BigDecimal makePrice;
   private String bizCode;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("returnsPrice")
   public void setReturnsPrice(BigDecimal returnsPrice) {
      this.returnsPrice = returnsPrice;
   }

   @JsonProperty("returnsPrice")
   public BigDecimal getReturnsPrice() {
      return this.returnsPrice;
   }

   @JsonProperty("returnsNum")
   public void setReturnsNum(Integer returnsNum) {
      this.returnsNum = returnsNum;
   }

   @JsonProperty("returnsNum")
   public Integer getReturnsNum() {
      return this.returnsNum;
   }

   @JsonProperty("factNum")
   public void setFactNum(Integer factNum) {
      this.factNum = factNum;
   }

   @JsonProperty("factNum")
   public Integer getFactNum() {
      return this.factNum;
   }

   @JsonProperty("totalPrice")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("isbn")
   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   @JsonProperty("isbn")
   public String getIsbn() {
      return this.isbn;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("makePrice")
   public void setMakePrice(BigDecimal makePrice) {
      this.makePrice = makePrice;
   }

   @JsonProperty("makePrice")
   public BigDecimal getMakePrice() {
      return this.makePrice;
   }

   @JsonProperty("bizCode")
   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public String getBizCode() {
      return this.bizCode;
   }
}
