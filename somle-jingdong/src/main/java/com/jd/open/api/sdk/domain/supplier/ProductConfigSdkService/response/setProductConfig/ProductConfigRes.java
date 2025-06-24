package com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.response.setProductConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductConfigRes implements Serializable {
   private String configPromiseFailReason;
   private String czFlagFailReason;
   private String errMsg;
   private Boolean configStockResult;
   private Boolean czFlagResult;
   private String configStockFailReason;
   private Long skuId;
   private Boolean configPromiseResult;

   @JsonProperty("configPromiseFailReason")
   public void setConfigPromiseFailReason(String configPromiseFailReason) {
      this.configPromiseFailReason = configPromiseFailReason;
   }

   @JsonProperty("configPromiseFailReason")
   public String getConfigPromiseFailReason() {
      return this.configPromiseFailReason;
   }

   @JsonProperty("czFlagFailReason")
   public void setCzFlagFailReason(String czFlagFailReason) {
      this.czFlagFailReason = czFlagFailReason;
   }

   @JsonProperty("czFlagFailReason")
   public String getCzFlagFailReason() {
      return this.czFlagFailReason;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("configStockResult")
   public void setConfigStockResult(Boolean configStockResult) {
      this.configStockResult = configStockResult;
   }

   @JsonProperty("configStockResult")
   public Boolean getConfigStockResult() {
      return this.configStockResult;
   }

   @JsonProperty("czFlagResult")
   public void setCzFlagResult(Boolean czFlagResult) {
      this.czFlagResult = czFlagResult;
   }

   @JsonProperty("czFlagResult")
   public Boolean getCzFlagResult() {
      return this.czFlagResult;
   }

   @JsonProperty("configStockFailReason")
   public void setConfigStockFailReason(String configStockFailReason) {
      this.configStockFailReason = configStockFailReason;
   }

   @JsonProperty("configStockFailReason")
   public String getConfigStockFailReason() {
      return this.configStockFailReason;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("configPromiseResult")
   public void setConfigPromiseResult(Boolean configPromiseResult) {
      this.configPromiseResult = configPromiseResult;
   }

   @JsonProperty("configPromiseResult")
   public Boolean getConfigPromiseResult() {
      return this.configPromiseResult;
   }
}
