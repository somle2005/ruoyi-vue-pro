package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductInfo implements Serializable {
   private String productCode;
   private String productName;
   private String billingMode;
   private String billingModeDesc;
   private String categoryCode;
   private String categoryDesc;

   @JsonProperty("productCode")
   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String getProductCode() {
      return this.productCode;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("billingMode")
   public void setBillingMode(String billingMode) {
      this.billingMode = billingMode;
   }

   @JsonProperty("billingMode")
   public String getBillingMode() {
      return this.billingMode;
   }

   @JsonProperty("billingModeDesc")
   public void setBillingModeDesc(String billingModeDesc) {
      this.billingModeDesc = billingModeDesc;
   }

   @JsonProperty("billingModeDesc")
   public String getBillingModeDesc() {
      return this.billingModeDesc;
   }

   @JsonProperty("categoryCode")
   public void setCategoryCode(String categoryCode) {
      this.categoryCode = categoryCode;
   }

   @JsonProperty("categoryCode")
   public String getCategoryCode() {
      return this.categoryCode;
   }

   @JsonProperty("categoryDesc")
   public void setCategoryDesc(String categoryDesc) {
      this.categoryDesc = categoryDesc;
   }

   @JsonProperty("categoryDesc")
   public String getCategoryDesc() {
      return this.categoryDesc;
   }
}
