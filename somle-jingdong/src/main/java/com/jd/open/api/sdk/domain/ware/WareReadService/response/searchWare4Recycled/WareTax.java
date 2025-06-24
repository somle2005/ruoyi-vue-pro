package com.jd.open.api.sdk.domain.ware.WareReadService.response.searchWare4Recycled;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class WareTax implements Serializable {
   private String taxCode;
   private BigDecimal taxRate;
   private Integer isTaxCheap;
   private String taxCheapContent;
   private Integer zeroTaxRate;

   @JsonProperty("taxCode")
   public void setTaxCode(String taxCode) {
      this.taxCode = taxCode;
   }

   @JsonProperty("taxCode")
   public String getTaxCode() {
      return this.taxCode;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(BigDecimal taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public BigDecimal getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("isTaxCheap")
   public void setIsTaxCheap(Integer isTaxCheap) {
      this.isTaxCheap = isTaxCheap;
   }

   @JsonProperty("isTaxCheap")
   public Integer getIsTaxCheap() {
      return this.isTaxCheap;
   }

   @JsonProperty("taxCheapContent")
   public void setTaxCheapContent(String taxCheapContent) {
      this.taxCheapContent = taxCheapContent;
   }

   @JsonProperty("taxCheapContent")
   public String getTaxCheapContent() {
      return this.taxCheapContent;
   }

   @JsonProperty("zeroTaxRate")
   public void setZeroTaxRate(Integer zeroTaxRate) {
      this.zeroTaxRate = zeroTaxRate;
   }

   @JsonProperty("zeroTaxRate")
   public Integer getZeroTaxRate() {
      return this.zeroTaxRate;
   }
}
