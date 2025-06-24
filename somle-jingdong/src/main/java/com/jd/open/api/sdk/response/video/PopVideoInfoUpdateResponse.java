package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopVideoInfoUpdateResponse extends AbstractResponse {
   private Integer updateResult;

   @JsonProperty("update_result")
   public void setUpdateResult(Integer updateResult) {
      this.updateResult = updateResult;
   }

   @JsonProperty("update_result")
   public Integer getUpdateResult() {
      return this.updateResult;
   }
}
