package com.jd.open.api.sdk.domain.fangchan.RentSpuSaasPublishService.response.publishService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class HandleProductResult implements Serializable {
   private String code;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }
}
