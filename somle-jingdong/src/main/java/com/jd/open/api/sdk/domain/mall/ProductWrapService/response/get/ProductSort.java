package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductSort implements Serializable {
   private Integer productSortId;
   private Integer fatherId;
   private String name;
   private Integer isDelete;
   private Integer grade;
   private String conte;
   private Integer sort;
   private Integer isFitService;

   @JsonProperty("product_sort_id")
   public void setProductSortId(Integer productSortId) {
      this.productSortId = productSortId;
   }

   @JsonProperty("product_sort_id")
   public Integer getProductSortId() {
      return this.productSortId;
   }

   @JsonProperty("father_id")
   public void setFatherId(Integer fatherId) {
      this.fatherId = fatherId;
   }

   @JsonProperty("father_id")
   public Integer getFatherId() {
      return this.fatherId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("is_delete")
   public void setIsDelete(Integer isDelete) {
      this.isDelete = isDelete;
   }

   @JsonProperty("is_delete")
   public Integer getIsDelete() {
      return this.isDelete;
   }

   @JsonProperty("grade")
   public void setGrade(Integer grade) {
      this.grade = grade;
   }

   @JsonProperty("grade")
   public Integer getGrade() {
      return this.grade;
   }

   @JsonProperty("conte")
   public void setConte(String conte) {
      this.conte = conte;
   }

   @JsonProperty("conte")
   public String getConte() {
      return this.conte;
   }

   @JsonProperty("sort")
   public void setSort(Integer sort) {
      this.sort = sort;
   }

   @JsonProperty("sort")
   public Integer getSort() {
      return this.sort;
   }

   @JsonProperty("is_fit_service")
   public void setIsFitService(Integer isFitService) {
      this.isFitService = isFitService;
   }

   @JsonProperty("is_fit_service")
   public Integer getIsFitService() {
      return this.isFitService;
   }
}
