package com.jd.open.api.sdk.domain.jjfw.RequestOrderService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MainOrderInfo implements Serializable {
   private String mainOrderId;
   private String mainSkuId;

   @JsonProperty("mainOrderId")
   public void setMainOrderId(String mainOrderId) {
      this.mainOrderId = mainOrderId;
   }

   @JsonProperty("mainOrderId")
   public String getMainOrderId() {
      return this.mainOrderId;
   }

   @JsonProperty("mainSkuId")
   public void setMainSkuId(String mainSkuId) {
      this.mainSkuId = mainSkuId;
   }

   @JsonProperty("mainSkuId")
   public String getMainSkuId() {
      return this.mainSkuId;
   }
}
