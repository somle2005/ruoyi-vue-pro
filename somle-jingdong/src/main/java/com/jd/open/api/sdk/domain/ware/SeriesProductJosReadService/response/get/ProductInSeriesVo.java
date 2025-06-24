package com.jd.open.api.sdk.domain.ware.SeriesProductJosReadService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ProductInSeriesVo implements Serializable {
   private String categoryName3;
   private String categoryName1;
   private String categoryName2;
   private Long productId;
   private Date created;
   private Date modified;
   private Integer productStatus;
   private String productName;
   private Integer order;
   private String seriesProductName;

   @JsonProperty("categoryName3")
   public void setCategoryName3(String categoryName3) {
      this.categoryName3 = categoryName3;
   }

   @JsonProperty("categoryName3")
   public String getCategoryName3() {
      return this.categoryName3;
   }

   @JsonProperty("categoryName1")
   public void setCategoryName1(String categoryName1) {
      this.categoryName1 = categoryName1;
   }

   @JsonProperty("categoryName1")
   public String getCategoryName1() {
      return this.categoryName1;
   }

   @JsonProperty("categoryName2")
   public void setCategoryName2(String categoryName2) {
      this.categoryName2 = categoryName2;
   }

   @JsonProperty("categoryName2")
   public String getCategoryName2() {
      return this.categoryName2;
   }

   @JsonProperty("productId")
   public void setProductId(Long productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public Long getProductId() {
      return this.productId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("productStatus")
   public void setProductStatus(Integer productStatus) {
      this.productStatus = productStatus;
   }

   @JsonProperty("productStatus")
   public Integer getProductStatus() {
      return this.productStatus;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("order")
   public void setOrder(Integer order) {
      this.order = order;
   }

   @JsonProperty("order")
   public Integer getOrder() {
      return this.order;
   }

   @JsonProperty("seriesProductName")
   public void setSeriesProductName(String seriesProductName) {
      this.seriesProductName = seriesProductName;
   }

   @JsonProperty("seriesProductName")
   public String getSeriesProductName() {
      return this.seriesProductName;
   }
}
