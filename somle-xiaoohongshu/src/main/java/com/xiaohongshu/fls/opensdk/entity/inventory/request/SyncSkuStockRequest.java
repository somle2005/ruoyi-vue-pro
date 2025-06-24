package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class SyncSkuStockRequest extends BaseRequest {
   public String skuId;
   public Integer qty;

   public String getSkuId() {
      return this.skuId;
   }

   public Integer getQty() {
      return this.qty;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setQty(Integer qty) {
      this.qty = qty;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SyncSkuStockRequest)) {
         return false;
      } else {
         SyncSkuStockRequest other = (SyncSkuStockRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$qty = this.getQty();
            Object other$qty = other.getQty();
            if (this$qty == null) {
               if (other$qty != null) {
                  return false;
               }
            } else if (!this$qty.equals(other$qty)) {
               return false;
            }

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
      return other instanceof SyncSkuStockRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $qty = this.getQty();
      result = result * 59 + ($qty == null ? 43 : $qty.hashCode());
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      return result;
   }

   public String toString() {
      return "SyncSkuStockRequest(skuId=" + this.getSkuId() + ", qty=" + this.getQty() + ")";
   }
}
