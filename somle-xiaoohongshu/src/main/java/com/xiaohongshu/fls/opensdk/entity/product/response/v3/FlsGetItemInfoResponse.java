package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class FlsGetItemInfoResponse {
   public long total;
   public List<FlsSkuDetail> skuInfos;
   public ItemDetail itemInfo;

   public long getTotal() {
      return this.total;
   }

   public List<FlsSkuDetail> getSkuInfos() {
      return this.skuInfos;
   }

   public ItemDetail getItemInfo() {
      return this.itemInfo;
   }

   public void setTotal(long total) {
      this.total = total;
   }

   public void setSkuInfos(List<FlsSkuDetail> skuInfos) {
      this.skuInfos = skuInfos;
   }

   public void setItemInfo(ItemDetail itemInfo) {
      this.itemInfo = itemInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsGetItemInfoResponse)) {
         return false;
      } else {
         FlsGetItemInfoResponse other = (FlsGetItemInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else {
            Object this$skuInfos = this.getSkuInfos();
            Object other$skuInfos = other.getSkuInfos();
            if (this$skuInfos == null) {
               if (other$skuInfos != null) {
                  return false;
               }
            } else if (!this$skuInfos.equals(other$skuInfos)) {
               return false;
            }

            Object this$itemInfo = this.getItemInfo();
            Object other$itemInfo = other.getItemInfo();
            if (this$itemInfo == null) {
               if (other$itemInfo != null) {
                  return false;
               }
            } else if (!this$itemInfo.equals(other$itemInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof FlsGetItemInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $total = this.getTotal();
      result = result * 59 + (int)($total >>> 32 ^ $total);
      Object $skuInfos = this.getSkuInfos();
      result = result * 59 + ($skuInfos == null ? 43 : $skuInfos.hashCode());
      Object $itemInfo = this.getItemInfo();
      result = result * 59 + ($itemInfo == null ? 43 : $itemInfo.hashCode());
      return result;
   }

   public String toString() {
      return "FlsGetItemInfoResponse(total=" + this.getTotal() + ", skuInfos=" + this.getSkuInfos() + ", itemInfo=" + this.getItemInfo() + ")";
   }
}
