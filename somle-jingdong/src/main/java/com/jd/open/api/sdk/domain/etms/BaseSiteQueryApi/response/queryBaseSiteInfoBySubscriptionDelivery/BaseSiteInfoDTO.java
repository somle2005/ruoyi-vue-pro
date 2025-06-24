package com.jd.open.api.sdk.domain.etms.BaseSiteQueryApi.response.queryBaseSiteInfoBySubscriptionDelivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseSiteInfoDTO implements Serializable {
   private String siteName;
   private Integer siteCode;

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("siteCode")
   public void setSiteCode(Integer siteCode) {
      this.siteCode = siteCode;
   }

   @JsonProperty("siteCode")
   public Integer getSiteCode() {
      return this.siteCode;
   }
}
