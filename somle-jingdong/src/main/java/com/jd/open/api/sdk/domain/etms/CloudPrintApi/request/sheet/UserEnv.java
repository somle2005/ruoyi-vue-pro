package com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UserEnv implements Serializable {
   private String tradeCode;

   @JsonProperty("tradeCode")
   public void setTradeCode(String tradeCode) {
      this.tradeCode = tradeCode;
   }

   @JsonProperty("tradeCode")
   public String getTradeCode() {
      return this.tradeCode;
   }
}
