package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.uploadFileUrl.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UploadFileUrlResponse extends AbstractResponse {
   private ResultBean returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultBean returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultBean getReturnType() {
      return this.returnType;
   }
}
