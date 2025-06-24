package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncEngineerServiceArea;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class EngineerServiceArea implements Serializable {
   private List<Integer[]> engineerServiceAreaIdList;
   private String engineerId;
   private String siteId;

   @JsonProperty("engineerServiceAreaIdList")
   public void setEngineerServiceAreaIdList(List<Integer[]> engineerServiceAreaIdList) {
      this.engineerServiceAreaIdList = engineerServiceAreaIdList;
   }

   @JsonProperty("engineerServiceAreaIdList")
   public List<Integer[]> getEngineerServiceAreaIdList() {
      return this.engineerServiceAreaIdList;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(String engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public String getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
      return this.siteId;
   }
}
