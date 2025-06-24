package com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GetCategoryFeatureByKeyRecursiveResponse implements Serializable {
   private String bu;
   private Integer categoryId;
   private String tenant;
   private List<CategoryFeatureRecursive> categoryFeatureRecursiveList;

   @JsonProperty("bu")
   public void setBu(String bu) {
      this.bu = bu;
   }

   @JsonProperty("bu")
   public String getBu() {
      return this.bu;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("tenant")
   public void setTenant(String tenant) {
      this.tenant = tenant;
   }

   @JsonProperty("tenant")
   public String getTenant() {
      return this.tenant;
   }

   @JsonProperty("categoryFeatureRecursiveList")
   public void setCategoryFeatureRecursiveList(List<CategoryFeatureRecursive> categoryFeatureRecursiveList) {
      this.categoryFeatureRecursiveList = categoryFeatureRecursiveList;
   }

   @JsonProperty("categoryFeatureRecursiveList")
   public List<CategoryFeatureRecursive> getCategoryFeatureRecursiveList() {
      return this.categoryFeatureRecursiveList;
   }
}
