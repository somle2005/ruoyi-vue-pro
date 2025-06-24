package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ApiSmsModelConfigReadServiceCountSmsModelConfigByParamsResponse extends AbstractResponse {
   private Long totalSize;

   @JsonProperty("totalSize")
   public void setTotalSize(Long totalSize) {
      this.totalSize = totalSize;
   }

   @JsonProperty("totalSize")
   public Long getTotalSize() {
      return this.totalSize;
   }
}
