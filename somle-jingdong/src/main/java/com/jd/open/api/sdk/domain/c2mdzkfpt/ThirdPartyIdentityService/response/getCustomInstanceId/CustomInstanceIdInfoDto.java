package com.jd.open.api.sdk.domain.c2mdzkfpt.ThirdPartyIdentityService.response.getCustomInstanceId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomInstanceIdInfoDto implements Serializable {
   private String customInstanceId;
   private String rawUserKey;
   private String userId;
   private String skuId;

   @JsonProperty("customInstanceId")
   public void setCustomInstanceId(String customInstanceId) {
      this.customInstanceId = customInstanceId;
   }

   @JsonProperty("customInstanceId")
   public String getCustomInstanceId() {
      return this.customInstanceId;
   }

   @JsonProperty("rawUserKey")
   public void setRawUserKey(String rawUserKey) {
      this.rawUserKey = rawUserKey;
   }

   @JsonProperty("rawUserKey")
   public String getRawUserKey() {
      return this.rawUserKey;
   }

   @JsonProperty("userId")
   public void setUserId(String userId) {
      this.userId = userId;
   }

   @JsonProperty("userId")
   public String getUserId() {
      return this.userId;
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
