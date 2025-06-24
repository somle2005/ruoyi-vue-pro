package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderAsynAddOrderResponse extends AbstractResponse {
   private Boolean isReceivable;

   @JsonProperty("isReceivable")
   public void setIsReceivable(Boolean isReceivable) {
      this.isReceivable = isReceivable;
   }

   @JsonProperty("isReceivable")
   public Boolean getIsReceivable() {
      return this.isReceivable;
   }
}
