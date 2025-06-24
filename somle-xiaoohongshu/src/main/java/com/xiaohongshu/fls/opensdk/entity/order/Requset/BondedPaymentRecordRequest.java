package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class BondedPaymentRecordRequest extends BaseRequest {
   private String orderId;
   private String customsType;

   public String getOrderId() {
      return this.orderId;
   }

   public String getCustomsType() {
      return this.customsType;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setCustomsType(String customsType) {
      this.customsType = customsType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BondedPaymentRecordRequest)) {
         return false;
      } else {
         BondedPaymentRecordRequest other = (BondedPaymentRecordRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$orderId = this.getOrderId();
            Object other$orderId = other.getOrderId();
            if (this$orderId == null) {
               if (other$orderId != null) {
                  return false;
               }
            } else if (!this$orderId.equals(other$orderId)) {
               return false;
            }

            Object this$customsType = this.getCustomsType();
            Object other$customsType = other.getCustomsType();
            if (this$customsType == null) {
               if (other$customsType != null) {
                  return false;
               }
            } else if (!this$customsType.equals(other$customsType)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BondedPaymentRecordRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $customsType = this.getCustomsType();
      result = result * 59 + ($customsType == null ? 43 : $customsType.hashCode());
      return result;
   }

   public String toString() {
      return "BondedPaymentRecordRequest(orderId=" + this.getOrderId() + ", customsType=" + this.getCustomsType() + ")";
   }
}
