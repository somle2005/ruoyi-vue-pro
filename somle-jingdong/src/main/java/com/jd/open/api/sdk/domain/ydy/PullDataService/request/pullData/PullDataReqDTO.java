package com.jd.open.api.sdk.domain.ydy.PullDataService.request.pullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class PullDataReqDTO implements Serializable {
   private String objectId;
   private Map<String, String> parameters;
   private List<WayBillInfo> wayBillInfos;
   private String cpCode;

   @JsonProperty("objectId")
   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   @JsonProperty("objectId")
   public String getObjectId() {
      return this.objectId;
   }

   @JsonProperty("parameters")
   public void setParameters(Map<String, String> parameters) {
      this.parameters = parameters;
   }

   @JsonProperty("parameters")
   public Map<String, String> getParameters() {
      return this.parameters;
   }

   @JsonProperty("wayBillInfos")
   public void setWayBillInfos(List<WayBillInfo> wayBillInfos) {
      this.wayBillInfos = wayBillInfos;
   }

   @JsonProperty("wayBillInfos")
   public List<WayBillInfo> getWayBillInfos() {
      return this.wayBillInfos;
   }

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }
}
