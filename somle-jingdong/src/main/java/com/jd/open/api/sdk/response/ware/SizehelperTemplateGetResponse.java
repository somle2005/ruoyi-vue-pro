package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.SizeHelperTemplateService.response.get.QueryTemplateResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SizehelperTemplateGetResponse extends AbstractResponse {
   private QueryTemplateResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(QueryTemplateResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public QueryTemplateResponse getReturnType() {
      return this.returnType;
   }
}
