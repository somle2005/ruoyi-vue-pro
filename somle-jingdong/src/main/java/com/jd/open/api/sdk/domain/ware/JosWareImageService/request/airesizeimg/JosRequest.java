package com.jd.open.api.sdk.domain.ware.JosWareImageService.request.airesizeimg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosRequest implements Serializable {
   private Integer shopType;

   @JsonProperty("shopType")
   public void setShopType(Integer shopType) {
      this.shopType = shopType;
   }

   @JsonProperty("shopType")
   public Integer getShopType() {
      return this.shopType;
   }
}
