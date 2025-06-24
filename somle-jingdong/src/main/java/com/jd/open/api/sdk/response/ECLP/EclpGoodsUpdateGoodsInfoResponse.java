package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpGoodsUpdateGoodsInfoResponse extends AbstractResponse {
   private boolean updateResult;

   @JsonProperty("updateResult")
   public void setUpdateResult(boolean updateResult) {
      this.updateResult = updateResult;
   }

   @JsonProperty("updateResult")
   public boolean getUpdateResult() {
      return this.updateResult;
   }
}
