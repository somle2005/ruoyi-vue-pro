package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class GetItemInfoResponse {
   public long total;
   public List<SkuDetail> skuInfos;
   public ItemDetail itemInfo;
   public int pageNO;
   public int pageSize;

   public long getTotal() {
      return this.total;
   }

   public List<SkuDetail> getSkuInfos() {
      return this.skuInfos;
   }

   public ItemDetail getItemInfo() {
      return this.itemInfo;
   }

   public int getPageNO() {
      return this.pageNO;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setTotal(long total) {
      this.total = total;
   }

   public void setSkuInfos(List<SkuDetail> skuInfos) {
      this.skuInfos = skuInfos;
   }

   public void setItemInfo(ItemDetail itemInfo) {
      this.itemInfo = itemInfo;
   }

   public void setPageNO(int pageNO) {
      this.pageNO = pageNO;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetItemInfoResponse)) {
         return false;
      } else {
         GetItemInfoResponse other = (GetItemInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else if (this.getPageNO() != other.getPageNO()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
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
      return other instanceof GetItemInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $total = this.getTotal();
      result = result * 59 + (int)($total >>> 32 ^ $total);
      result = result * 59 + this.getPageNO();
      result = result * 59 + this.getPageSize();
      Object $skuInfos = this.getSkuInfos();
      result = result * 59 + ($skuInfos == null ? 43 : $skuInfos.hashCode());
      Object $itemInfo = this.getItemInfo();
      result = result * 59 + ($itemInfo == null ? 43 : $itemInfo.hashCode());
      return result;
   }

   public String toString() {
      return "GetItemInfoResponse(total=" + this.getTotal() + ", skuInfos=" + this.getSkuInfos() + ", itemInfo=" + this.getItemInfo() + ", pageNO=" + this.getPageNO() + ", pageSize=" + this.getPageSize() + ")";
   }
}
