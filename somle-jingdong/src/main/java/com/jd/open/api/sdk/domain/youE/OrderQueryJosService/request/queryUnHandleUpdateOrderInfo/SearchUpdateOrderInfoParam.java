package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.request.queryUnHandleUpdateOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SearchUpdateOrderInfoParam implements Serializable {
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
