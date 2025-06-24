package com.jd.open.api.sdk.response.ydy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList.GetTemplateListRespDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PrintingTemplateGetTemplateListResponse extends AbstractResponse {
   private GetTemplateListRespDTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(GetTemplateListRespDTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public GetTemplateListRespDTO getReturnType() {
      return this.returnType;
   }
}
