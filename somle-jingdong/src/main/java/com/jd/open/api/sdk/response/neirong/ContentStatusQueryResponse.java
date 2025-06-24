package com.jd.open.api.sdk.response.neirong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.neirong.ContentStatusJsfService.response.query.ContentReleaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ContentStatusQueryResponse extends AbstractResponse {
   private ContentReleaseResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ContentReleaseResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ContentReleaseResult getReturnType() {
      return this.returnType;
   }
}
