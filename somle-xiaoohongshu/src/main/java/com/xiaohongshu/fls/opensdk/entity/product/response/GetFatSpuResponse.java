package com.xiaohongshu.fls.opensdk.entity.product.response;

import com.xiaohongshu.fls.opensdk.entity.product.ItemInfo;
import com.xiaohongshu.fls.opensdk.entity.product.SpuInfo;
import java.util.ArrayList;
import java.util.List;

public class GetFatSpuResponse {
   public SpuInfo spuInfo;
   public List<ItemInfo> itemInfo = new ArrayList();
   private int total;

   public SpuInfo getSpuInfo() {
      return this.spuInfo;
   }

   public List<ItemInfo> getItemInfo() {
      return this.itemInfo;
   }

   public int getTotal() {
      return this.total;
   }

   public void setSpuInfo(SpuInfo spuInfo) {
      this.spuInfo = spuInfo;
   }

   public void setItemInfo(List<ItemInfo> itemInfo) {
      this.itemInfo = itemInfo;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetFatSpuResponse)) {
         return false;
      } else {
         GetFatSpuResponse other = (GetFatSpuResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else {
            Object this$spuInfo = this.getSpuInfo();
            Object other$spuInfo = other.getSpuInfo();
            if (this$spuInfo == null) {
               if (other$spuInfo != null) {
                  return false;
               }
            } else if (!this$spuInfo.equals(other$spuInfo)) {
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
      return other instanceof GetFatSpuResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getTotal();
      Object $spuInfo = this.getSpuInfo();
      result = result * 59 + ($spuInfo == null ? 43 : $spuInfo.hashCode());
      Object $itemInfo = this.getItemInfo();
      result = result * 59 + ($itemInfo == null ? 43 : $itemInfo.hashCode());
      return result;
   }

   public String toString() {
      return "GetFatSpuResponse(spuInfo=" + this.getSpuInfo() + ", itemInfo=" + this.getItemInfo() + ", total=" + this.getTotal() + ")";
   }
}
