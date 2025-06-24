package com.jd.open.api.sdk.response.Marketing;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionCreateResponse extends AbstractResponse {
   private Long createResult;

   @JsonProperty("create_result")
   public void setCreateResult(Long createResult) {
      this.createResult = createResult;
   }

   @JsonProperty("create_result")
   public Long getCreateResult() {
      return this.createResult;
   }
}
