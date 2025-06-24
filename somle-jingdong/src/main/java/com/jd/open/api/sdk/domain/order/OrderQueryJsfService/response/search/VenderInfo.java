package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderInfo implements Serializable {
   private String venderName;
   private Long shopId;
   private String shopName;

   @JsonProperty("venderName")
   public void setVenderName(String venderName) {
      this.venderName = venderName;
   }

   @JsonProperty("venderName")
   public String getVenderName() {
      return this.venderName;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }
}
