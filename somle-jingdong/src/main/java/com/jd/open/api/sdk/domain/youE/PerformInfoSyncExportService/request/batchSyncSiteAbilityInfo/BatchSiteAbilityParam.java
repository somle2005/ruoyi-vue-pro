package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.batchSyncSiteAbilityInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BatchSiteAbilityParam implements Serializable {
   private String unifiedCode;
   private String siteId;
   private String siteName;
   private List<BatchSiteAbility> siteAbilityInfoList;

   @JsonProperty("unifiedCode")
   public void setUnifiedCode(String unifiedCode) {
      this.unifiedCode = unifiedCode;
   }

   @JsonProperty("unifiedCode")
   public String getUnifiedCode() {
      return this.unifiedCode;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
      return this.siteId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("siteAbilityInfoList")
   public void setSiteAbilityInfoList(List<BatchSiteAbility> siteAbilityInfoList) {
      this.siteAbilityInfoList = siteAbilityInfoList;
   }

   @JsonProperty("siteAbilityInfoList")
   public List<BatchSiteAbility> getSiteAbilityInfoList() {
      return this.siteAbilityInfoList;
   }
}
