package com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.request.queryAvailablePickDays;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AvailablePickDaysQuery implements Serializable {
   private Long skuId;
   private Integer categoryLastId;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("categoryLastId")
   public void setCategoryLastId(Integer categoryLastId) {
      this.categoryLastId = categoryLastId;
   }

   @JsonProperty("categoryLastId")
   public Integer getCategoryLastId() {
      return this.categoryLastId;
   }
}
