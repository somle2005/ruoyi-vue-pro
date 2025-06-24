package com.jd.open.api.sdk.domain.plgz.BrandQuaFacade.request.checkBrandCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandCategoryCheckParam implements Serializable {
   private Integer statusType;
   private Long erpBrandId;
   private Long categoryId;

   @JsonProperty("statusType")
   public void setStatusType(Integer statusType) {
      this.statusType = statusType;
   }

   @JsonProperty("statusType")
   public Integer getStatusType() {
      return this.statusType;
   }

   @JsonProperty("erpBrandId")
   public void setErpBrandId(Long erpBrandId) {
      this.erpBrandId = erpBrandId;
   }

   @JsonProperty("erpBrandId")
   public Long getErpBrandId() {
      return this.erpBrandId;
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
