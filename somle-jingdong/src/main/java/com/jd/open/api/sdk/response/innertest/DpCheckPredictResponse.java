package com.jd.open.api.sdk.response.innertest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DpCheckPredictResponse extends AbstractResponse {
   private String returnInfo;

   @JsonProperty("returnInfo")
   public void setReturnInfo(String returnInfo) {
      this.returnInfo = returnInfo;
   }

   @JsonProperty("returnInfo")
   public String getReturnInfo() {
      return this.returnInfo;
   }
}
