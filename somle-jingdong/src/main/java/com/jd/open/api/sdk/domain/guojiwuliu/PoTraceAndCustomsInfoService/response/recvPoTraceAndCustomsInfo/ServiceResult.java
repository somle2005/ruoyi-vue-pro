package com.jd.open.api.sdk.domain.guojiwuliu.PoTraceAndCustomsInfoService.response.recvPoTraceAndCustomsInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceResult implements Serializable {
   private String resultValue;
   private Boolean success;
   private String resultKey;

   @JsonProperty("resultValue")
   public void setResultValue(String resultValue) {
      this.resultValue = resultValue;
   }

   @JsonProperty("resultValue")
   public String getResultValue() {
      return this.resultValue;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultKey")
   public void setResultKey(String resultKey) {
      this.resultKey = resultKey;
   }

   @JsonProperty("resultKey")
   public String getResultKey() {
      return this.resultKey;
   }
}
