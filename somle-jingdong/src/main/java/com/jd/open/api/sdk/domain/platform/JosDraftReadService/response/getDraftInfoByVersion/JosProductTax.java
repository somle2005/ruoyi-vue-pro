package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class JosProductTax implements Serializable {
   private BigDecimal taxRate;
   private Integer zeroTaxRate;
   private String taxCheapContent;
   private String taxCode;
   private Integer isTaxCheap;

   @JsonProperty("taxRate")
   public void setTaxRate(BigDecimal taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public BigDecimal getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("zeroTaxRate")
   public void setZeroTaxRate(Integer zeroTaxRate) {
      this.zeroTaxRate = zeroTaxRate;
   }

   @JsonProperty("zeroTaxRate")
   public Integer getZeroTaxRate() {
      return this.zeroTaxRate;
   }

   @JsonProperty("taxCheapContent")
   public void setTaxCheapContent(String taxCheapContent) {
      this.taxCheapContent = taxCheapContent;
   }

   @JsonProperty("taxCheapContent")
   public String getTaxCheapContent() {
      return this.taxCheapContent;
   }

   @JsonProperty("taxCode")
   public void setTaxCode(String taxCode) {
      this.taxCode = taxCode;
   }

   @JsonProperty("taxCode")
   public String getTaxCode() {
      return this.taxCode;
   }

   @JsonProperty("isTaxCheap")
   public void setIsTaxCheap(Integer isTaxCheap) {
      this.isTaxCheap = isTaxCheap;
   }

   @JsonProperty("isTaxCheap")
   public Integer getIsTaxCheap() {
      return this.isTaxCheap;
   }
}
