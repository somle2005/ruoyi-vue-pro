package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AigcCopilotTestHelloResponse extends AbstractResponse {
   private String p2;

   @JsonProperty("p2")
   public void setP2(String p2) {
      this.p2 = p2;
   }

   @JsonProperty("p2")
   public String getP2() {
      return this.p2;
   }
}
