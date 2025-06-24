package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ModifyOrderExpressRequest extends BaseRequest {
   public String orderId;
   public String expressNo;
   public String expressCompanyCode;
   public String expressCompanyName;
   public Integer deliveryOrderIndex;
   public String oldExpressNo;

   public String getOrderId() {
      return this.orderId;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressCompanyName() {
      return this.expressCompanyName;
   }

   public Integer getDeliveryOrderIndex() {
      return this.deliveryOrderIndex;
   }

   public String getOldExpressNo() {
      return this.oldExpressNo;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressCompanyName(String expressCompanyName) {
      this.expressCompanyName = expressCompanyName;
   }

   public void setDeliveryOrderIndex(Integer deliveryOrderIndex) {
      this.deliveryOrderIndex = deliveryOrderIndex;
   }

   public void setOldExpressNo(String oldExpressNo) {
      this.oldExpressNo = oldExpressNo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ModifyOrderExpressRequest)) {
         return false;
      } else {
         ModifyOrderExpressRequest other = (ModifyOrderExpressRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$deliveryOrderIndex = this.getDeliveryOrderIndex();
            Object other$deliveryOrderIndex = other.getDeliveryOrderIndex();
            if (this$deliveryOrderIndex == null) {
               if (other$deliveryOrderIndex != null) {
                  return false;
               }
            } else if (!this$deliveryOrderIndex.equals(other$deliveryOrderIndex)) {
               return false;
            }

            Object this$orderId = this.getOrderId();
            Object other$orderId = other.getOrderId();
            if (this$orderId == null) {
               if (other$orderId != null) {
                  return false;
               }
            } else if (!this$orderId.equals(other$orderId)) {
               return false;
            }

            Object this$expressNo = this.getExpressNo();
            Object other$expressNo = other.getExpressNo();
            if (this$expressNo == null) {
               if (other$expressNo != null) {
                  return false;
               }
            } else if (!this$expressNo.equals(other$expressNo)) {
               return false;
            }

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
               return false;
            }

            Object this$expressCompanyName = this.getExpressCompanyName();
            Object other$expressCompanyName = other.getExpressCompanyName();
            if (this$expressCompanyName == null) {
               if (other$expressCompanyName != null) {
                  return false;
               }
            } else if (!this$expressCompanyName.equals(other$expressCompanyName)) {
               return false;
            }

            Object this$oldExpressNo = this.getOldExpressNo();
            Object other$oldExpressNo = other.getOldExpressNo();
            if (this$oldExpressNo == null) {
               if (other$oldExpressNo != null) {
                  return false;
               }
            } else if (!this$oldExpressNo.equals(other$oldExpressNo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ModifyOrderExpressRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $deliveryOrderIndex = this.getDeliveryOrderIndex();
      result = result * 59 + ($deliveryOrderIndex == null ? 43 : $deliveryOrderIndex.hashCode());
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressCompanyName = this.getExpressCompanyName();
      result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
      Object $oldExpressNo = this.getOldExpressNo();
      result = result * 59 + ($oldExpressNo == null ? 43 : $oldExpressNo.hashCode());
      return result;
   }

   public String toString() {
      return "ModifyOrderExpressRequest(orderId=" + this.getOrderId() + ", expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", deliveryOrderIndex=" + this.getDeliveryOrderIndex() + ", oldExpressNo=" + this.getOldExpressNo() + ")";
   }
}
