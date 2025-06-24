package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareWriteTransferMultiCategoryResponse extends AbstractResponse {
   private boolean returnType;

   @JsonProperty("returnType")
   public void setReturnType(boolean returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public boolean getReturnType() {
      return this.returnType;
   }
}
