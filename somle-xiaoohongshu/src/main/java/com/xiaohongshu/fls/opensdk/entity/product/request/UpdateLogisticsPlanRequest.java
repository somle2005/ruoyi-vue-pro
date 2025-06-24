package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateLogisticsPlanRequest extends BaseRequest {
   private String itemId;
   private String planId;

   public String getItemId() {
      return this.itemId;
   }

   public String getPlanId() {
      return this.planId;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setPlanId(String planId) {
      this.planId = planId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateLogisticsPlanRequest)) {
         return false;
      } else {
         UpdateLogisticsPlanRequest other = (UpdateLogisticsPlanRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$itemId = this.getItemId();
            Object other$itemId = other.getItemId();
            if (this$itemId == null) {
               if (other$itemId != null) {
                  return false;
               }
            } else if (!this$itemId.equals(other$itemId)) {
               return false;
            }

            Object this$planId = this.getPlanId();
            Object other$planId = other.getPlanId();
            if (this$planId == null) {
               if (other$planId != null) {
                  return false;
               }
            } else if (!this$planId.equals(other$planId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateLogisticsPlanRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $planId = this.getPlanId();
      result = result * 59 + ($planId == null ? 43 : $planId.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateLogisticsPlanRequest(itemId=" + this.getItemId() + ", planId=" + this.getPlanId() + ")";
   }
}
