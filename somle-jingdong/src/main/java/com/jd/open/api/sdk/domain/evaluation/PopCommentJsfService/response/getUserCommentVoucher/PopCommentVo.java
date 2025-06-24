package com.jd.open.api.sdk.domain.evaluation.PopCommentJsfService.response.getUserCommentVoucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PopCommentVo implements Serializable {
   private int firstCategory;
   private Boolean isTop;
   private int replyCount;
   private int score;
   private int secondCategory;
   private String skuImage;
   private String skuName;
   private int status;
   private int thirdCategory;
   private int usefulCount;
   private Long orderId;

   @JsonProperty("firstCategory")
   public void setFirstCategory(int firstCategory) {
      this.firstCategory = firstCategory;
   }

   @JsonProperty("firstCategory")
   public int getFirstCategory() {
      return this.firstCategory;
   }

   @JsonProperty("isTop")
   public void setIsTop(Boolean isTop) {
      this.isTop = isTop;
   }

   @JsonProperty("isTop")
   public Boolean getIsTop() {
      return this.isTop;
   }

   @JsonProperty("replyCount")
   public void setReplyCount(int replyCount) {
      this.replyCount = replyCount;
   }

   @JsonProperty("replyCount")
   public int getReplyCount() {
      return this.replyCount;
   }

   @JsonProperty("score")
   public void setScore(int score) {
      this.score = score;
   }

   @JsonProperty("score")
   public int getScore() {
      return this.score;
   }

   @JsonProperty("secondCategory")
   public void setSecondCategory(int secondCategory) {
      this.secondCategory = secondCategory;
   }

   @JsonProperty("secondCategory")
   public int getSecondCategory() {
      return this.secondCategory;
   }

   @JsonProperty("skuImage")
   public void setSkuImage(String skuImage) {
      this.skuImage = skuImage;
   }

   @JsonProperty("skuImage")
   public String getSkuImage() {
      return this.skuImage;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("thirdCategory")
   public void setThirdCategory(int thirdCategory) {
      this.thirdCategory = thirdCategory;
   }

   @JsonProperty("thirdCategory")
   public int getThirdCategory() {
      return this.thirdCategory;
   }

   @JsonProperty("usefulCount")
   public void setUsefulCount(int usefulCount) {
      this.usefulCount = usefulCount;
   }

   @JsonProperty("usefulCount")
   public int getUsefulCount() {
      return this.usefulCount;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }
}
