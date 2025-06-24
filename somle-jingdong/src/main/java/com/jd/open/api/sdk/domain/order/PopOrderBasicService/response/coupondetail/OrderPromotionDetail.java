package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.coupondetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderPromotionDetail implements Serializable {
   private String saleTypeDesc;
   private String salePrice;
   private Long promotionId;
   private String promotionName;
   private String beginTime;
   private String endTime;

   @JsonProperty("saleTypeDesc")
   public void setSaleTypeDesc(String saleTypeDesc) {
      this.saleTypeDesc = saleTypeDesc;
   }

   @JsonProperty("saleTypeDesc")
   public String getSaleTypeDesc() {
      return this.saleTypeDesc;
   }

   @JsonProperty("salePrice")
   public void setSalePrice(String salePrice) {
      this.salePrice = salePrice;
   }

   @JsonProperty("salePrice")
   public String getSalePrice() {
      return this.salePrice;
   }

   @JsonProperty("promotionId")
   public void setPromotionId(Long promotionId) {
      this.promotionId = promotionId;
   }

   @JsonProperty("promotionId")
   public Long getPromotionId() {
      return this.promotionId;
   }

   @JsonProperty("promotionName")
   public void setPromotionName(String promotionName) {
      this.promotionName = promotionName;
   }

   @JsonProperty("promotionName")
   public String getPromotionName() {
      return this.promotionName;
   }

   @JsonProperty("beginTime")
   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   @JsonProperty("beginTime")
   public String getBeginTime() {
      return this.beginTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }
}
