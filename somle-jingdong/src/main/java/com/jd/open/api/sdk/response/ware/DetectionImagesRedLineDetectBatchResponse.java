package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperDetectionService.response.imagesRedLineDetectBatch.ImageBatchDetectResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DetectionImagesRedLineDetectBatchResponse extends AbstractResponse {
   private ImageBatchDetectResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ImageBatchDetectResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ImageBatchDetectResult getReturnType() {
      return this.returnType;
   }
}
