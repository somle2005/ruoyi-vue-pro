package com.jd.open.api.sdk.domain.hudong.JosFansActivityWriteService.request.createGiftActivityWithResult;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ClientSource implements Serializable {
   private String appKey;
   private String appName;

   @JsonProperty("appKey")
   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   @JsonProperty("appKey")
   public String getAppKey() {
      return this.appKey;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }
}
