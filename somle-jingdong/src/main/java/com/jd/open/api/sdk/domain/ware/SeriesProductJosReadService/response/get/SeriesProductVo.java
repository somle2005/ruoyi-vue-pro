package com.jd.open.api.sdk.domain.ware.SeriesProductJosReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SeriesProductVo implements Serializable {
   private String brandName;
   private String seriesName;
   private Date created;
   private Long seriesProductId;
   private List<ProductInSeriesVo> products;
   private Long brandId;
   private Date modified;
   private Integer operation;
   private Long categoryId;
   private Integer status;

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("seriesName")
   public void setSeriesName(String seriesName) {
      this.seriesName = seriesName;
   }

   @JsonProperty("seriesName")
   public String getSeriesName() {
      return this.seriesName;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("seriesProductId")
   public void setSeriesProductId(Long seriesProductId) {
      this.seriesProductId = seriesProductId;
   }

   @JsonProperty("seriesProductId")
   public Long getSeriesProductId() {
      return this.seriesProductId;
   }

   @JsonProperty("products")
   public void setProducts(List<ProductInSeriesVo> products) {
      this.products = products;
   }

   @JsonProperty("products")
   public List<ProductInSeriesVo> getProducts() {
      return this.products;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("operation")
   public void setOperation(Integer operation) {
      this.operation = operation;
   }

   @JsonProperty("operation")
   public Integer getOperation() {
      return this.operation;
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
