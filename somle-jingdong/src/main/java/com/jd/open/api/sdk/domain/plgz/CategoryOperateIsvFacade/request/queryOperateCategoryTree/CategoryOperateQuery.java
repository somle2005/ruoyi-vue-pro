package com.jd.open.api.sdk.domain.plgz.CategoryOperateIsvFacade.request.queryOperateCategoryTree;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CategoryOperateQuery implements Serializable {
   private Long venderId;

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }
}
