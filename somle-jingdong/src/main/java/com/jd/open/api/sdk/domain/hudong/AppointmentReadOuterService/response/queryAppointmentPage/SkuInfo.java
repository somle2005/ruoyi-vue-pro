package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.queryAppointmentPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuInfo implements Serializable {
   private Long skuId;
   private String skuName;
   private String imgRui;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
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
