package com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncEngineerInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ExeEngineerInfoParam implements Serializable {
   private String appId;
   private List<EngineerInfo> engineerInfoInfoList;

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("engineerInfoInfoList")
   public void setEngineerInfoInfoList(List<EngineerInfo> engineerInfoInfoList) {
      this.engineerInfoInfoList = engineerInfoInfoList;
   }

   @JsonProperty("engineerInfoInfoList")
   public List<EngineerInfo> getEngineerInfoInfoList() {
      return this.engineerInfoInfoList;
   }
}
