package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSMaterialService.response.bindMaterial.RelativeMaterialResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class MediaMaterialBindMaterialResponse extends AbstractResponse {
   private List<RelativeMaterialResult> returnType;

   @JsonProperty("returnType")
   public void setReturnType(List<RelativeMaterialResult> returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public List<RelativeMaterialResult> getReturnType() {
      return this.returnType;
   }
}
