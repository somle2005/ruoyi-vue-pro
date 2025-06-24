package com.jd.open.api.sdk.domain.ydy.PullDataService.response.pullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PullDataRespDTO implements Serializable {
   private String message;
   private List<PrePrintDataInfo> prePrintDatas;
   private String objectId;
   private String code;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("prePrintDatas")
   public void setPrePrintDatas(List<PrePrintDataInfo> prePrintDatas) {
      this.prePrintDatas = prePrintDatas;
   }

   @JsonProperty("prePrintDatas")
   public List<PrePrintDataInfo> getPrePrintDatas() {
      return this.prePrintDatas;
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
}
