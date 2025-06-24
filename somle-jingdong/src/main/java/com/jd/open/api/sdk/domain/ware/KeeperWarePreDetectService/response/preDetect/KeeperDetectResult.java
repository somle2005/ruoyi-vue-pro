package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.response.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class KeeperDetectResult implements Serializable {
   private Integer detectResult;
   private String reason;
   private String detectedValue;
   private List<String> fields;

   @JsonProperty("detectResult")
   public void setDetectResult(Integer detectResult) {
      this.detectResult = detectResult;
   }

   @JsonProperty("detectResult")
   public Integer getDetectResult() {
      return this.detectResult;
   }

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("detectedValue")
   public void setDetectedValue(String detectedValue) {
      this.detectedValue = detectedValue;
   }

   @JsonProperty("detectedValue")
   public String getDetectedValue() {
      return this.detectedValue;
   }

   @JsonProperty("fields")
   public void setFields(List<String> fields) {
      this.fields = fields;
   }

   @JsonProperty("fields")
   public List<String> getFields() {
      return this.fields;
   }
}
