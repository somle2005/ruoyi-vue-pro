package com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.response.set;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductLowestBuyConfigRes implements Serializable {
   private String errMsg;
   private Long skuId;

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
