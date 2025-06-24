package com.jd.open.api.sdk.domain.video.JOSMaterialService.request.skuBatchBindMaterial;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JOSClient implements Serializable {
   private Integer callEnd;

   @JsonProperty("callEnd")
   public void setCallEnd(Integer callEnd) {
      this.callEnd = callEnd;
   }

   @JsonProperty("callEnd")
   public Integer getCallEnd() {
      return this.callEnd;
   }
}
