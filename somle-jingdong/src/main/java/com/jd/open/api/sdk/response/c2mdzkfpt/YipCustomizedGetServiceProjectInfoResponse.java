package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.getServiceProjectInfo.ServiceProjectInfoResp;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipCustomizedGetServiceProjectInfoResponse extends AbstractResponse {
   private ServiceProjectInfoResp returnType;

   @JsonProperty("returnType")
   public void setReturnType(ServiceProjectInfoResp returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ServiceProjectInfoResp getReturnType() {
      return this.returnType;
   }
}
