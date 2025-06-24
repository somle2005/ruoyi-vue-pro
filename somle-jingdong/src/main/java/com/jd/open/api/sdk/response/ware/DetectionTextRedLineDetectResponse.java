package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperDetectionService.response.textRedLineDetect.TextDetectResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DetectionTextRedLineDetectResponse extends AbstractResponse {
   private TextDetectResult TextDetectResult;

   @JsonProperty("TextDetectResult")
   public void setTextDetectResult(TextDetectResult TextDetectResult) {
      this.TextDetectResult = TextDetectResult;
   }

   @JsonProperty("TextDetectResult")
   public TextDetectResult getTextDetectResult() {
      return this.TextDetectResult;
   }
}
