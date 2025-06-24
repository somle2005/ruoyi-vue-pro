package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.GrayScaleService.response.getgrayvalue.JosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareCommonGrayGetgrayvalueResponse extends AbstractResponse {
   private JosResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(JosResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public JosResult getReturnType() {
      return this.returnType;
   }
}
