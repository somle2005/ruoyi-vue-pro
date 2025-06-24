package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSMaterialService.response.getMaterialBySkuIds.SkuMaterialInfo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class MediaGetMaterialBySkuIdsResponse extends AbstractResponse {
   private List<SkuMaterialInfo> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<SkuMaterialInfo> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<SkuMaterialInfo> getReturnType() {
      return this.returnType;
   }
}
