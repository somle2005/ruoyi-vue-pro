package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.request.queryTimeoutReason;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AceOrderTimeoutParam implements Serializable {
   private Integer pageSize;

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }
}
