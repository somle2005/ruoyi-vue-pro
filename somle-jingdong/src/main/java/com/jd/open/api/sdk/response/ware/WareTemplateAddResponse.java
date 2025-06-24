package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareTemplateAddResponse extends AbstractResponse {
   private Long id;

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }
}
