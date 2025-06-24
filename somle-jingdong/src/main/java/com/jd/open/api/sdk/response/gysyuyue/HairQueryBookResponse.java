package com.jd.open.api.sdk.response.gysyuyue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gysyuyue.JosBigBookJsfService.response.queryBook.QueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HairQueryBookResponse extends AbstractResponse {
   private QueryResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(QueryResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public QueryResult getReturnType() {
      return this.returnType;
   }
}
