package com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.response.batchquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubsidyImgDto implements Serializable {
   private Long orderId;
   private String productImg;
   private String outerPackImg;
   private Integer reviewStatus;
   private String combineImg;
   private String deadLineTime;
   private Integer auditFailedTimes;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("productImg")
   public void setProductImg(String productImg) {
      this.productImg = productImg;
   }

   @JsonProperty("productImg")
   public String getProductImg() {
      return this.productImg;
   }

   @JsonProperty("outerPackImg")
   public void setOuterPackImg(String outerPackImg) {
      this.outerPackImg = outerPackImg;
   }

   @JsonProperty("outerPackImg")
   public String getOuterPackImg() {
      return this.outerPackImg;
   }

   @JsonProperty("reviewStatus")
   public void setReviewStatus(Integer reviewStatus) {
      this.reviewStatus = reviewStatus;
   }

   @JsonProperty("reviewStatus")
   public Integer getReviewStatus() {
      return this.reviewStatus;
   }

   @JsonProperty("combineImg")
   public void setCombineImg(String combineImg) {
      this.combineImg = combineImg;
   }

   @JsonProperty("combineImg")
   public String getCombineImg() {
      return this.combineImg;
   }

   @JsonProperty("deadLineTime")
   public void setDeadLineTime(String deadLineTime) {
      this.deadLineTime = deadLineTime;
   }

   @JsonProperty("deadLineTime")
   public String getDeadLineTime() {
      return this.deadLineTime;
   }

   @JsonProperty("auditFailedTimes")
   public void setAuditFailedTimes(Integer auditFailedTimes) {
      this.auditFailedTimes = auditFailedTimes;
   }

   @JsonProperty("auditFailedTimes")
   public Integer getAuditFailedTimes() {
      return this.auditFailedTimes;
   }
}
