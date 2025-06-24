package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateSkuAvailableRequest extends BaseRequest {
   public String skuId;
   public boolean available;

   public String getSkuId() {
      return this.skuId;
   }

   public boolean isAvailable() {
      return this.available;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setAvailable(boolean available) {
      this.available = available;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateSkuAvailableRequest)) {
         return false;
      } else {
         UpdateSkuAvailableRequest other = (UpdateSkuAvailableRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isAvailable() != other.isAvailable()) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateSkuAvailableRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isAvailable() ? 79 : 97);
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateSkuAvailableRequest(skuId=" + this.getSkuId() + ", available=" + this.isAvailable() + ")";
   }
}
