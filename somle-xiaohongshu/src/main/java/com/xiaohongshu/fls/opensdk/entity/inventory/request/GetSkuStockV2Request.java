package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetSkuStockV2Request extends BaseRequest {
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
      } else if (!(o instanceof GetSkuStockV2Request)) {
         return false;
      } else {
         GetSkuStockV2Request other = (GetSkuStockV2Request)o;
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
      return other instanceof GetSkuStockV2Request;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      return result;
   }

   public String toString() {
      return "GetSkuStockV2Request(skuId=" + this.getSkuId() + ")";
   }
}
