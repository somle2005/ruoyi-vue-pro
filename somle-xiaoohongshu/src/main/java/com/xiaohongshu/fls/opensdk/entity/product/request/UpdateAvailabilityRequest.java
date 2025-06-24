package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateAvailabilityRequest extends BaseRequest {
   private Boolean available;
   private String itemId;

   public Boolean getAvailable() {
      return this.available;
   }

   public String getItemId() {
      return this.itemId;
   }

   public void setAvailable(Boolean available) {
      this.available = available;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateAvailabilityRequest)) {
         return false;
      } else {
         UpdateAvailabilityRequest other = (UpdateAvailabilityRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$available = this.getAvailable();
            Object other$available = other.getAvailable();
            if (this$available == null) {
               if (other$available != null) {
                  return false;
               }
            } else if (!this$available.equals(other$available)) {
               return false;
            }

            Object this$itemId = this.getItemId();
            Object other$itemId = other.getItemId();
            if (this$itemId == null) {
               if (other$itemId != null) {
                  return false;
               }
            } else if (!this$itemId.equals(other$itemId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateAvailabilityRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $available = this.getAvailable();
      result = result * 59 + ($available == null ? 43 : $available.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateAvailabilityRequest(available=" + this.getAvailable() + ", itemId=" + this.getItemId() + ")";
   }
}
