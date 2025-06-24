package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosSubCategory implements Serializable {
   private Integer categoryId;
   private String categoryName;
   private Integer categoryLevel;
   private Integer parentId;

   @JsonProperty("category_id")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("category_id")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("category_name")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("category_name")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("category_level")
   public void setCategoryLevel(Integer categoryLevel) {
      this.categoryLevel = categoryLevel;
   }

   @JsonProperty("category_level")
   public Integer getCategoryLevel() {
      return this.categoryLevel;
   }

   @JsonProperty("parent_id")
   public void setParentId(Integer parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parent_id")
   public Integer getParentId() {
      return this.parentId;
   }
}
