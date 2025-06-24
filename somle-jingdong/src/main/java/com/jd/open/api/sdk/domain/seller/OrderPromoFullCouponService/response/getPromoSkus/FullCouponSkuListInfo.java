package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FullCouponSkuListInfo implements Serializable {
   private String skuName;
   private String jdPrice;
   private Long skuId;
   private Integer syncStatus;
   private String imgRui;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("syncStatus")
   public void setSyncStatus(Integer syncStatus) {
      this.syncStatus = syncStatus;
   }

   @JsonProperty("syncStatus")
   public Integer getSyncStatus() {
      return this.syncStatus;
   }

   @JsonProperty("imgRui")
   public void setImgRui(String imgRui) {
      this.imgRui = imgRui;
   }

   @JsonProperty("imgRui")
   public String getImgRui() {
      return this.imgRui;
   }
}
