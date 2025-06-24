package com.jd.open.api.sdk.domain.ydy.PullDataService.request.sensitivePullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class SensitivePullDataReqDTO implements Serializable {
   private String objectId;
   private Map<String, String> parameters;
   private String cpCode;
   private List<EwPrintDataInfo> ewPrintDataInfos;

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

   @JsonProperty("cpCode")
   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   @JsonProperty("cpCode")
   public String getCpCode() {
      return this.cpCode;
   }

   @JsonProperty("ewPrintDataInfos")
   public void setEwPrintDataInfos(List<EwPrintDataInfo> ewPrintDataInfos) {
      this.ewPrintDataInfos = ewPrintDataInfos;
   }

   @JsonProperty("ewPrintDataInfos")
   public List<EwPrintDataInfo> getEwPrintDataInfos() {
      return this.ewPrintDataInfos;
   }
}
