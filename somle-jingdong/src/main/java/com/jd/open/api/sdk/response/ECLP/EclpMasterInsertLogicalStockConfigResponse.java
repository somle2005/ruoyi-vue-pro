package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterInsertLogicalStockConfigResponse extends AbstractResponse {
   private boolean insertResult;

   @JsonProperty("insertResult")
   public void setInsertResult(boolean insertResult) {
      this.insertResult = insertResult;
   }

   @JsonProperty("insertResult")
   public boolean getInsertResult() {
      return this.insertResult;
   }
}
