package com.jd.open.api.sdk.domain.ware.KeeperDetectionService.response.imagesRedLineDetectBatch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ImageBatchDetectResult implements Serializable {
   private Map<String, List> resultMap;
   private Map<String, ImagesDetectResult> imagesDetectResult;
   private Boolean safe;

   @JsonProperty("resultMap")
   public void setResultMap(Map<String, List> resultMap) {
      this.resultMap = resultMap;
   }

   @JsonProperty("resultMap")
   public Map<String, List> getResultMap() {
      return this.resultMap;
   }

   @JsonProperty("imagesDetectResult")
   public void setImagesDetectResult(Map<String, ImagesDetectResult> imagesDetectResult) {
      this.imagesDetectResult = imagesDetectResult;
   }

   @JsonProperty("imagesDetectResult")
   public Map<String, ImagesDetectResult> getImagesDetectResult() {
      return this.imagesDetectResult;
   }

   @JsonProperty("safe")
   public void setSafe(Boolean safe) {
      this.safe = safe;
   }

   @JsonProperty("safe")
   public Boolean getSafe() {
      return this.safe;
   }
}
