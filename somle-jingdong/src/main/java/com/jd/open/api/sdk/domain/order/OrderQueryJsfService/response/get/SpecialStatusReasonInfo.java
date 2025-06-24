package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SpecialStatusReasonInfo implements Serializable {
   private String reason;
   private String suggestion;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("suggestion")
   public void setSuggestion(String suggestion) {
      this.suggestion = suggestion;
   }

   @JsonProperty("suggestion")
   public String getSuggestion() {
      return this.suggestion;
   }
}
