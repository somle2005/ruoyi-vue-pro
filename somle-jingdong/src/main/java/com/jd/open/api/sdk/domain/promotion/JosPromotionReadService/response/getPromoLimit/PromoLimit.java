package com.jd.open.api.sdk.domain.promotion.JosPromotionReadService.response.getPromoLimit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoLimit implements Serializable {
   private Long venderId;
   private Long categoryId;
   private Double discountLimit;
   private Integer status;

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("category_id")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("category_id")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("discount_limit")
   public void setDiscountLimit(Double discountLimit) {
      this.discountLimit = discountLimit;
   }

   @JsonProperty("discount_limit")
   public Double getDiscountLimit() {
      return this.discountLimit;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }
}
