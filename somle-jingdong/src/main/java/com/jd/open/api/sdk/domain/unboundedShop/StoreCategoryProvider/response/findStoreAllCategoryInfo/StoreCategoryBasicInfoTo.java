package com.jd.open.api.sdk.domain.unboundedShop.StoreCategoryProvider.response.findStoreAllCategoryInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StoreCategoryBasicInfoTo implements Serializable {
   private Integer categoryLevel;
   private Integer categoryStatus;
   private Long parentCategoryId;
   private String categoryName;
   private Long categoryId;
   private Integer status;

   @JsonProperty("categoryLevel")
   public void setCategoryLevel(Integer categoryLevel) {
      this.categoryLevel = categoryLevel;
   }

   @JsonProperty("categoryLevel")
   public Integer getCategoryLevel() {
      return this.categoryLevel;
   }

   @JsonProperty("categoryStatus")
   public void setCategoryStatus(Integer categoryStatus) {
      this.categoryStatus = categoryStatus;
   }

   @JsonProperty("categoryStatus")
   public Integer getCategoryStatus() {
      return this.categoryStatus;
   }

   @JsonProperty("parentCategoryId")
   public void setParentCategoryId(Long parentCategoryId) {
      this.parentCategoryId = parentCategoryId;
   }

   @JsonProperty("parentCategoryId")
   public Long getParentCategoryId() {
      return this.parentCategoryId;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
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
