package com.jd.open.api.sdk.response.platform;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class IsvUploadLoginLogResponse extends AbstractResponse {
   private Integer c;

   @JsonProperty("c")
   public void setC(Integer c) {
      this.c = c;
   }

   @JsonProperty("c")
   public Integer getC() {
      return this.c;
   }
}
