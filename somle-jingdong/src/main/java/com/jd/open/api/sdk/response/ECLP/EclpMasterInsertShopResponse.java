package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpMasterInsertShopResponse extends AbstractResponse {
   private String insertshopResult;

   @JsonProperty("insertshop_result")
   public void setInsertshopResult(String insertshopResult) {
      this.insertshopResult = insertshopResult;
   }

   @JsonProperty("insertshop_result")
   public String getInsertshopResult() {
      return this.insertshopResult;
   }
}
