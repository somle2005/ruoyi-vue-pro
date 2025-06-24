package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SparePartInfo implements Serializable {
   private String brandName;
   private String thirdCategoryName;
   private String productModel;
   private String sparePartType;
   private String sparePartCode;
   private String sparePartName;
   private Integer newApplyNum;
   private Integer newUseNum;
   private Integer newRetreatNum;
   private Integer usedRetreatNum;
   private Boolean usedRetreat;
   private String deliveryCode;

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("thirdCategoryName")
   public void setThirdCategoryName(String thirdCategoryName) {
      this.thirdCategoryName = thirdCategoryName;
   }

   @JsonProperty("thirdCategoryName")
   public String getThirdCategoryName() {
      return this.thirdCategoryName;
   }

   @JsonProperty("productModel")
   public void setProductModel(String productModel) {
      this.productModel = productModel;
   }

   @JsonProperty("productModel")
   public String getProductModel() {
      return this.productModel;
   }

   @JsonProperty("sparePartType")
   public void setSparePartType(String sparePartType) {
      this.sparePartType = sparePartType;
   }

   @JsonProperty("sparePartType")
   public String getSparePartType() {
      return this.sparePartType;
   }

   @JsonProperty("sparePartCode")
   public void setSparePartCode(String sparePartCode) {
      this.sparePartCode = sparePartCode;
   }

   @JsonProperty("sparePartCode")
   public String getSparePartCode() {
      return this.sparePartCode;
   }

   @JsonProperty("sparePartName")
   public void setSparePartName(String sparePartName) {
      this.sparePartName = sparePartName;
   }

   @JsonProperty("sparePartName")
   public String getSparePartName() {
      return this.sparePartName;
   }

   @JsonProperty("newApplyNum")
   public void setNewApplyNum(Integer newApplyNum) {
      this.newApplyNum = newApplyNum;
   }

   @JsonProperty("newApplyNum")
   public Integer getNewApplyNum() {
      return this.newApplyNum;
   }

   @JsonProperty("newUseNum")
   public void setNewUseNum(Integer newUseNum) {
      this.newUseNum = newUseNum;
   }

   @JsonProperty("newUseNum")
   public Integer getNewUseNum() {
      return this.newUseNum;
   }

   @JsonProperty("newRetreatNum")
   public void setNewRetreatNum(Integer newRetreatNum) {
      this.newRetreatNum = newRetreatNum;
   }

   @JsonProperty("newRetreatNum")
   public Integer getNewRetreatNum() {
      return this.newRetreatNum;
   }

   @JsonProperty("usedRetreatNum")
   public void setUsedRetreatNum(Integer usedRetreatNum) {
      this.usedRetreatNum = usedRetreatNum;
   }

   @JsonProperty("usedRetreatNum")
   public Integer getUsedRetreatNum() {
      return this.usedRetreatNum;
   }

   @JsonProperty("usedRetreat")
   public void setUsedRetreat(Boolean usedRetreat) {
      this.usedRetreat = usedRetreat;
   }

   @JsonProperty("usedRetreat")
   public Boolean getUsedRetreat() {
      return this.usedRetreat;
   }

   @JsonProperty("deliveryCode")
   public void setDeliveryCode(String deliveryCode) {
      this.deliveryCode = deliveryCode;
   }

   @JsonProperty("deliveryCode")
   public String getDeliveryCode() {
      return this.deliveryCode;
   }
}
