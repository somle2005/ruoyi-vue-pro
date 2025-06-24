package com.jd.open.api.sdk.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CategoryWriteSaveVenderAttrValueResponse extends AbstractResponse {
   private Long valueId;

   @JsonProperty("valueId")
   public void setValueId(Long valueId) {
      this.valueId = valueId;
   }

   @JsonProperty("valueId")
   public Long getValueId() {
      return this.valueId;
   }
}
