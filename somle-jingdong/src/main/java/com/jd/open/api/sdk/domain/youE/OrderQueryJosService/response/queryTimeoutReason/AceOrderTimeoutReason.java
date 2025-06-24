package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.response.queryTimeoutReason;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AceOrderTimeoutReason implements Serializable {
   private Integer timeoutReasonType;
   private String timeoutReasonName;

   @JsonProperty("timeoutReasonType")
   public void setTimeoutReasonType(Integer timeoutReasonType) {
      this.timeoutReasonType = timeoutReasonType;
   }

   @JsonProperty("timeoutReasonType")
   public Integer getTimeoutReasonType() {
      return this.timeoutReasonType;
   }

   @JsonProperty("timeoutReasonName")
   public void setTimeoutReasonName(String timeoutReasonName) {
      this.timeoutReasonName = timeoutReasonName;
   }

   @JsonProperty("timeoutReasonName")
   public String getTimeoutReasonName() {
      return this.timeoutReasonName;
   }
}
