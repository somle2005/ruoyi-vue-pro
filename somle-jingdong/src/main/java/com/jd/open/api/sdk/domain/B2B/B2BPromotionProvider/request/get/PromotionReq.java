package com.jd.open.api.sdk.domain.B2B.B2BPromotionProvider.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class PromotionReq implements Serializable {
   private String sku;
   private PlatformInfo platformInfo;
   private UserInfo userInfo;
   private String num;
   private AreaInfo areaInfo;
   private Map<String, Object> extParam;

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("platformInfo")
   public void setPlatformInfo(PlatformInfo platformInfo) {
      this.platformInfo = platformInfo;
   }

   @JsonProperty("platformInfo")
   public PlatformInfo getPlatformInfo() {
      return this.platformInfo;
   }

   @JsonProperty("userInfo")
   public void setUserInfo(UserInfo userInfo) {
      this.userInfo = userInfo;
   }

   @JsonProperty("userInfo")
   public UserInfo getUserInfo() {
      return this.userInfo;
   }

   @JsonProperty("num")
   public void setNum(String num) {
      this.num = num;
   }

   @JsonProperty("num")
   public String getNum() {
      return this.num;
   }

   @JsonProperty("areaInfo")
   public void setAreaInfo(AreaInfo areaInfo) {
      this.areaInfo = areaInfo;
   }

   @JsonProperty("areaInfo")
   public AreaInfo getAreaInfo() {
      return this.areaInfo;
   }

   @JsonProperty("extParam")
   public void setExtParam(Map<String, Object> extParam) {
      this.extParam = extParam;
   }

   @JsonProperty("extParam")
   public Map<String, Object> getExtParam() {
      return this.extParam;
   }
}
