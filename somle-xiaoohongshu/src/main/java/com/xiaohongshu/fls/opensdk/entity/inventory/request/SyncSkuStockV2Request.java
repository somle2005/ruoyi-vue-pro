package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.Map;

public class SyncSkuStockV2Request extends BaseRequest {
   public String skuId;
   public Map<String, Integer> qtyWithWhcode;

   public String getSkuId() {
      return this.skuId;
   }

   public Map<String, Integer> getQtyWithWhcode() {
      return this.qtyWithWhcode;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setQtyWithWhcode(Map<String, Integer> qtyWithWhcode) {
      this.qtyWithWhcode = qtyWithWhcode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SyncSkuStockV2Request)) {
         return false;
      } else {
         SyncSkuStockV2Request other = (SyncSkuStockV2Request)o;
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

            Object this$qtyWithWhcode = this.getQtyWithWhcode();
            Object other$qtyWithWhcode = other.getQtyWithWhcode();
            if (this$qtyWithWhcode == null) {
               if (other$qtyWithWhcode != null) {
                  return false;
               }
            } else if (!this$qtyWithWhcode.equals(other$qtyWithWhcode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SyncSkuStockV2Request;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      Object $qtyWithWhcode = this.getQtyWithWhcode();
      result = result * 59 + ($qtyWithWhcode == null ? 43 : $qtyWithWhcode.hashCode());
      return result;
   }

   public String toString() {
      return "SyncSkuStockV2Request(skuId=" + this.getSkuId() + ", qtyWithWhcode=" + this.getQtyWithWhcode() + ")";
   }
}
