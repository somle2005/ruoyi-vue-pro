package com.jd.open.api.sdk.domain.ydy.PullDataService.response.sensitivePullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SensitivePullDataRespDTO implements Serializable {
   private String message;
   private String objectId;
   private String code;
   private List<EwPrintDataInfo> ewPrintDataInfos;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("objectId")
   public void setObjectId(String objectId) {
      this.objectId = objectId;
   }

   @JsonProperty("objectId")
   public String getObjectId() {
      return this.objectId;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
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
