package com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.request.queryOperateCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CategoryOperateQuery implements Serializable {
   private Long venderId;
   private Long categoryId;

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}
