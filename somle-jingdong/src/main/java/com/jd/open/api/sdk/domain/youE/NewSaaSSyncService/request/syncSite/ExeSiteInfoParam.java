package com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncSite;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ExeSiteInfoParam implements Serializable {
   private List<SiteInfo> siteInfoList;
   private String appId;

   @JsonProperty("siteInfoList")
   public void setSiteInfoList(List<SiteInfo> siteInfoList) {
      this.siteInfoList = siteInfoList;
   }

   @JsonProperty("siteInfoList")
   public List<SiteInfo> getSiteInfoList() {
      return this.siteInfoList;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }
}
