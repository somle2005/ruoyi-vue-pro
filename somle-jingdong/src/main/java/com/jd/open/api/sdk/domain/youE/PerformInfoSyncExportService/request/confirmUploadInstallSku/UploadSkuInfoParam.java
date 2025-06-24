package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.confirmUploadInstallSku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UploadSkuInfoParam implements Serializable {
   private Integer secondServiceType;
   private String skuId;

   @JsonProperty("secondServiceType")
   public void setSecondServiceType(Integer secondServiceType) {
      this.secondServiceType = secondServiceType;
   }

   @JsonProperty("secondServiceType")
   public Integer getSecondServiceType() {
      return this.secondServiceType;
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
