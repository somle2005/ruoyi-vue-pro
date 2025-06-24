package com.jd.open.api.sdk.domain.ECLP.OrbLsCancelWaybillInterceptService.response.intercept;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CancelWaybillInterceptRes implements Serializable {
   private String stateMessage;
   private int stateCode;

   @JsonProperty("stateMessage")
   public void setStateMessage(String stateMessage) {
      this.stateMessage = stateMessage;
   }

   @JsonProperty("stateMessage")
   public String getStateMessage() {
      return this.stateMessage;
   }

   @JsonProperty("stateCode")
   public void setStateCode(int stateCode) {
      this.stateCode = stateCode;
   }

   @JsonProperty("stateCode")
   public int getStateCode() {
      return this.stateCode;
   }
}
