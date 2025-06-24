package com.jd.open.api.sdk.domain.hudong.PresaleQueryService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BusiPlatform implements Serializable {
   private Integer code;
   private String name;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }
}
