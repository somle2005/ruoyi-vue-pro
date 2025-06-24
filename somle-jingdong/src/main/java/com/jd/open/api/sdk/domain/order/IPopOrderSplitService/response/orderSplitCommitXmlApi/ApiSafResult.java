package com.jd.open.api.sdk.domain.order.IPopOrderSplitService.response.orderSplitCommitXmlApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiSafResult implements Serializable {
   private Boolean success;
   private String resultCode;
   private String resultDescribe;
   private OrderSplitInfo orderSplitInfo;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultDescribe")
   public void setResultDescribe(String resultDescribe) {
      this.resultDescribe = resultDescribe;
   }

   @JsonProperty("resultDescribe")
   public String getResultDescribe() {
      return this.resultDescribe;
   }

   @JsonProperty("orderSplitInfo")
   public void setOrderSplitInfo(OrderSplitInfo orderSplitInfo) {
      this.orderSplitInfo = orderSplitInfo;
   }

   @JsonProperty("orderSplitInfo")
   public OrderSplitInfo getOrderSplitInfo() {
      return this.orderSplitInfo;
   }
}
