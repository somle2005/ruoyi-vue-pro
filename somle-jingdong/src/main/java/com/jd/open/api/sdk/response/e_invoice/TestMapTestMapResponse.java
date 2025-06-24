package com.jd.open.api.sdk.response.e_invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.Map;

public class TestMapTestMapResponse extends AbstractResponse {
   private Map<String, Object> returnType;

   @JsonProperty("returnType")
   public void setReturnType(Map<String, Object> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Map<String, Object> getReturnType() {
      return this.returnType;
   }
}
