package com.jd.open.api.sdk.domain.refundapply.RefundapplySaf.response.querybyid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryMap implements Serializable {
   private String id;
   private String buyerId;
   private String buyerName;
   private String checkTime;
   private String applyTime;
   private String applyRefundSum;
   private String status;
   private String checkUsername;
   private String orderId;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("buyer_id")
   public void setBuyerId(String buyerId) {
      this.buyerId = buyerId;
   }

   @JsonProperty("buyer_id")
   public String getBuyerId() {
      return this.buyerId;
   }

   @JsonProperty("buyer_name")
   public void setBuyerName(String buyerName) {
      this.buyerName = buyerName;
   }

   @JsonProperty("buyer_name")
   public String getBuyerName() {
      return this.buyerName;
   }

   @JsonProperty("check_time")
   public void setCheckTime(String checkTime) {
      this.checkTime = checkTime;
   }

   @JsonProperty("check_time")
   public String getCheckTime() {
      return this.checkTime;
   }

   @JsonProperty("apply_time")
   public void setApplyTime(String applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("apply_time")
   public String getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("apply_refund_sum")
   public void setApplyRefundSum(String applyRefundSum) {
      this.applyRefundSum = applyRefundSum;
   }

   @JsonProperty("apply_refund_sum")
   public String getApplyRefundSum() {
      return this.applyRefundSum;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("check_username")
   public void setCheckUsername(String checkUsername) {
      this.checkUsername = checkUsername;
   }

   @JsonProperty("check_username")
   public String getCheckUsername() {
      return this.checkUsername;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }
}
