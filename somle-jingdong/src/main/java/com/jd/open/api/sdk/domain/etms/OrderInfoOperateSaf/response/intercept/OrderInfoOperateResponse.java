package com.jd.open.api.sdk.domain.etms.OrderInfoOperateSaf.response.intercept;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderInfoOperateResponse implements Serializable {
   private Integer stateCode;
   private String stateMessage;

   @JsonProperty("stateCode")
   public void setStateCode(Integer stateCode) {
      this.stateCode = stateCode;
   }

   @JsonProperty("stateCode")
   public Integer getStateCode() {
      return this.stateCode;
   }

   @JsonProperty("stateMessage")
   public void setStateMessage(String stateMessage) {
      this.stateMessage = stateMessage;
   }

   @JsonProperty("stateMessage")
   public String getStateMessage() {
      return this.stateMessage;
   }
}
