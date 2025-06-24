package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoWares;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FullCouponSpuInfo implements Serializable {
   private Long wareId;
   private String wareName;
   private String wareImg;
   private Integer syncStatus;
   private String jdPrice;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareImg")
   public void setWareImg(String wareImg) {
      this.wareImg = wareImg;
   }

   @JsonProperty("wareImg")
   public String getWareImg() {
      return this.wareImg;
   }

   @JsonProperty("syncStatus")
   public void setSyncStatus(Integer syncStatus) {
      this.syncStatus = syncStatus;
   }

   @JsonProperty("syncStatus")
   public Integer getSyncStatus() {
      return this.syncStatus;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String getJdPrice() {
      return this.jdPrice;
   }
}
