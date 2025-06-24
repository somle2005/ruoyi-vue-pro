package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ItemPicApplyDto implements Serializable {
   private String applyId;
   private Integer state;
   private String applyTime;
   private String wareId;
   private String name;
   private Integer brandId;
   private Integer categoryId;
   private String brandName;
   private Integer saleState;
   private String categoryName;
   private Integer isPublishSchedule;
   private Date publishTime;

   @JsonProperty("apply_id")
   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("apply_id")
   public String getApplyId() {
      return this.applyId;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("apply_time")
   public void setApplyTime(String applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("apply_time")
   public String getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("brand_id")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brand_id")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("category_id")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("category_id")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("brand_name")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brand_name")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("sale_state")
   public void setSaleState(Integer saleState) {
      this.saleState = saleState;
   }

   @JsonProperty("sale_state")
   public Integer getSaleState() {
      return this.saleState;
   }

   @JsonProperty("category_name")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("category_name")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("is_publishSchedule")
   public void setIsPublishSchedule(Integer isPublishSchedule) {
      this.isPublishSchedule = isPublishSchedule;
   }

   @JsonProperty("is_publishSchedule")
   public Integer getIsPublishSchedule() {
      return this.isPublishSchedule;
   }

   @JsonProperty("publish_time")
   public void setPublishTime(Date publishTime) {
      this.publishTime = publishTime;
   }

   @JsonProperty("publish_time")
   public Date getPublishTime() {
      return this.publishTime;
   }
}
