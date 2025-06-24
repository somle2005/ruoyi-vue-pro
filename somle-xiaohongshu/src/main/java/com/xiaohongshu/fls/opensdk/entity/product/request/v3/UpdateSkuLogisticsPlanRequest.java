package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateSkuLogisticsPlanRequest extends BaseRequest {
   public String skuId;
   public String logisticsPlanId;

   public String getSkuId() {
      return this.skuId;
   }

   public String getLogisticsPlanId() {
      return this.logisticsPlanId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setLogisticsPlanId(String logisticsPlanId) {
      this.logisticsPlanId = logisticsPlanId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateSkuLogisticsPlanRequest)) {
         return false;
      } else {
         UpdateSkuLogisticsPlanRequest other = (UpdateSkuLogisticsPlanRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$skuId = this.getSkuId();
            Object other$skuId = other.getSkuId();
            if (this$skuId == null) {
               if (other$skuId != null) {
                  return false;
               }
            } else if (!this$skuId.equals(other$skuId)) {
               return false;
            }

            Object this$logisticsPlanId = this.getLogisticsPlanId();
            Object other$logisticsPlanId = other.getLogisticsPlanId();
            if (this$logisticsPlanId == null) {
               if (other$logisticsPlanId != null) {
                  return false;
               }
            } else if (!this$logisticsPlanId.equals(other$logisticsPlanId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateSkuLogisticsPlanRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      Object $logisticsPlanId = this.getLogisticsPlanId();
      result = result * 59 + ($logisticsPlanId == null ? 43 : $logisticsPlanId.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateSkuLogisticsPlanRequest(skuId=" + this.getSkuId() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ")";
   }
}
