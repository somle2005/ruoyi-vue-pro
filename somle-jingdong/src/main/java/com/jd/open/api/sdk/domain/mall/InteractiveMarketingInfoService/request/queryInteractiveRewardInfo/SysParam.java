package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.request.queryInteractiveRewardInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SysParam implements Serializable {
   private String appKey;

   @JsonProperty("appKey")
   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   @JsonProperty("appKey")
   public String getAppKey() {
      return this.appKey;
   }
}
