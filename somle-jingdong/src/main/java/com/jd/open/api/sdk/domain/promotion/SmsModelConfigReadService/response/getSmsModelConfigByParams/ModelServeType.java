package com.jd.open.api.sdk.domain.promotion.SmsModelConfigReadService.response.getSmsModelConfigByParams;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ModelServeType implements Serializable {
   private String name;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }
}
