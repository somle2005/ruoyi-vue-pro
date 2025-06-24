package com.jd.open.api.sdk.response.evaluation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopPopCommentJsfServiceSaveCommentVoteResponse extends AbstractResponse {
   private String resultCode;

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }
}
