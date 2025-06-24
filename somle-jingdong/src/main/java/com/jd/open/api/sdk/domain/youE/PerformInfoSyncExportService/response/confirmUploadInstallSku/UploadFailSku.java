package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.response.confirmUploadInstallSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UploadFailSku implements Serializable {
   private Integer failCode;
   private String failReason;
   private String skuId;

   @JsonProperty("failCode")
   public void setFailCode(Integer failCode) {
      this.failCode = failCode;
   }

   @JsonProperty("failCode")
   public Integer getFailCode() {
      return this.failCode;
   }

   @JsonProperty("failReason")
   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   @JsonProperty("failReason")
   public String getFailReason() {
      return this.failReason;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
