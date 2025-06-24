package com.jd.open.api.sdk.domain.youE.OrderWaitingReviewedExportService.request.waitingReviewed;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaitingReviewedParam implements Serializable {
   private String orderNo;
   private String finishRemark;
   private FinishImgInfo finishImgInfo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("finishRemark")
   public void setFinishRemark(String finishRemark) {
      this.finishRemark = finishRemark;
   }

   @JsonProperty("finishRemark")
   public String getFinishRemark() {
      return this.finishRemark;
   }

   @JsonProperty("finishImgInfo")
   public void setFinishImgInfo(FinishImgInfo finishImgInfo) {
      this.finishImgInfo = finishImgInfo;
   }

   @JsonProperty("finishImgInfo")
   public FinishImgInfo getFinishImgInfo() {
      return this.finishImgInfo;
   }
}
