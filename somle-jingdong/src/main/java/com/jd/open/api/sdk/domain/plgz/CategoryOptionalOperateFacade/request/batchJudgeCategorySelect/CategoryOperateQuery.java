package com.jd.open.api.sdk.domain.plgz.CategoryOptionalOperateFacade.request.batchJudgeCategorySelect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CategoryOperateQuery implements Serializable {
   private Long venderId;
   private List<Long> categoryIdList;

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("categoryIdList")
   public void setCategoryIdList(List<Long> categoryIdList) {
      this.categoryIdList = categoryIdList;
   }

   @JsonProperty("categoryIdList")
   public List<Long> getCategoryIdList() {
      return this.categoryIdList;
   }
}
