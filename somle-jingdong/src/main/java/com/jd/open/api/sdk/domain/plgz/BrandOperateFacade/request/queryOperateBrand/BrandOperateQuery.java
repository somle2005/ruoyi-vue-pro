package com.jd.open.api.sdk.domain.plgz.BrandOperateFacade.request.queryOperateBrand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BrandOperateQuery implements Serializable {
   private String brandName;
   private Long venderId;
   private int pageSize;
   private Long brandId;
   private int pageNum;
   private Long categoryId;

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("pageNum")
   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   @JsonProperty("pageNum")
   public int getPageNum() {
      return this.pageNum;
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
