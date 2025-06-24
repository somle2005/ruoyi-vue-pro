package com.jd.open.api.sdk.domain.mall.SubsidyOutUploadJsfService.request.insert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubsidySkuSnInfoParam implements Serializable {
   private String imei2;
   private String imei1;
   private String upc;
   private String sn;
   private Long catId3;

   @JsonProperty("imei2")
   public void setImei2(String imei2) {
      this.imei2 = imei2;
   }

   @JsonProperty("imei2")
   public String getImei2() {
      return this.imei2;
   }

   @JsonProperty("imei1")
   public void setImei1(String imei1) {
      this.imei1 = imei1;
   }

   @JsonProperty("imei1")
   public String getImei1() {
      return this.imei1;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("sn")
   public void setSn(String sn) {
      this.sn = sn;
   }

   @JsonProperty("sn")
   public String getSn() {
      return this.sn;
   }

   @JsonProperty("catId3")
   public void setCatId3(Long catId3) {
      this.catId3 = catId3;
   }

   @JsonProperty("catId3")
   public Long getCatId3() {
      return this.catId3;
   }
}
