package com.jd.open.api.sdk.domain.wujiemiandan.StockQueryApi.response.queryByProviderCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillStockDTO implements Serializable {
   private String providerCode;
   private String providerName;
   private String branchCode;
   private String vendorCode;
   private String vendorName;
   private Integer amount;

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("branchCode")
   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   @JsonProperty("branchCode")
   public String getBranchCode() {
      return this.branchCode;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("amount")
   public void setAmount(Integer amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public Integer getAmount() {
      return this.amount;
   }
}
