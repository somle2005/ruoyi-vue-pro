package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosWareImageService.response.airesizeimg.JosResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSkuImagesAiresizeimgResponse extends AbstractResponse {
   private JosResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(JosResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public JosResponse getReturnType() {
      return this.returnType;
   }
}
