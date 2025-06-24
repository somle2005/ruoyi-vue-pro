package com.jd.open.api.sdk.domain.hudong.CouponBaseReadOuterService.response.initBaseRuleInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CouponAuth implements Serializable {
   private String mallUrl;

   @JsonProperty("mallUrl")
   public void setMallUrl(String mallUrl) {
      this.mallUrl = mallUrl;
   }

   @JsonProperty("mallUrl")
   public String getMallUrl() {
      return this.mallUrl;
   }
}
