package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncSite;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PerformParam implements Serializable {
   private String venderCode;
   private String appId;
   private String createBy;
   private List<SiteInfo> data;

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("createBy")
   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   @JsonProperty("createBy")
   public String getCreateBy() {
      return this.createBy;
   }

   @JsonProperty("data")
   public void setData(List<SiteInfo> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<SiteInfo> getData() {
      return this.data;
   }
}
