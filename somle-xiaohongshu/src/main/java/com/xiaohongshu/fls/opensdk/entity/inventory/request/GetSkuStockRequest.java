package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetSkuStockRequest extends BaseRequest {
   public String skuId;

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSkuStockRequest)) {
         return false;
      } else {
         GetSkuStockRequest other = (GetSkuStockRequest)o;
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSkuStockRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      return result;
   }

   public String toString() {
      return "GetSkuStockRequest(skuId=" + this.getSkuId() + ")";
   }
}
