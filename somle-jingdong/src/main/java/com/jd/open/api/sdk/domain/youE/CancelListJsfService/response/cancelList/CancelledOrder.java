package com.jd.open.api.sdk.domain.youE.CancelListJsfService.response.cancelList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CancelledOrder implements Serializable {
   private String userCancelInfo;
   private String orderNo;
   private String modelType;

   @JsonProperty("userCancelInfo")
   public void setUserCancelInfo(String userCancelInfo) {
      this.userCancelInfo = userCancelInfo;
   }

   @JsonProperty("userCancelInfo")
   public String getUserCancelInfo() {
      return this.userCancelInfo;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("modelType")
   public void setModelType(String modelType) {
      this.modelType = modelType;
   }

   @JsonProperty("modelType")
   public String getModelType() {
      return this.modelType;
   }
}
