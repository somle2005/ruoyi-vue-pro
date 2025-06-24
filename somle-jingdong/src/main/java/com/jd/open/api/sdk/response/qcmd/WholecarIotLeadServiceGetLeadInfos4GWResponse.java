package com.jd.open.api.sdk.response.qcmd;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WholecarIotLeadServiceGetLeadInfos4GWResponse extends AbstractResponse {
   private String result;

   @JsonProperty("result")
   public void setResult(String result) {
      this.result = result;
   }

   @JsonProperty("result")
   public String getResult() {
      return this.result;
   }
}
