package com.xiaohongshu.fls.opensdk.entity.product.response;

import com.xiaohongshu.fls.opensdk.entity.product.ItemInfo;
import com.xiaohongshu.fls.opensdk.entity.product.SpuInfo;

public class ItemResponse {
   public SpuInfo spuData = new SpuInfo();
   public ItemInfo itemData = new ItemInfo();

   public SpuInfo getSpuData() {
      return this.spuData;
   }

   public ItemInfo getItemData() {
      return this.itemData;
   }

   public void setSpuData(SpuInfo spuData) {
      this.spuData = spuData;
   }

   public void setItemData(ItemInfo itemData) {
      this.itemData = itemData;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ItemResponse)) {
         return false;
      } else {
         ItemResponse other = (ItemResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$spuData = this.getSpuData();
            Object other$spuData = other.getSpuData();
            if (this$spuData == null) {
               if (other$spuData != null) {
                  return false;
               }
            } else if (!this$spuData.equals(other$spuData)) {
               return false;
            }

            Object this$itemData = this.getItemData();
            Object other$itemData = other.getItemData();
            if (this$itemData == null) {
               if (other$itemData != null) {
                  return false;
               }
            } else if (!this$itemData.equals(other$itemData)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ItemResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $spuData = this.getSpuData();
      result = result * 59 + ($spuData == null ? 43 : $spuData.hashCode());
      Object $itemData = this.getItemData();
      result = result * 59 + ($itemData == null ? 43 : $itemData.hashCode());
      return result;
   }

   public String toString() {
      return "ItemResponse(spuData=" + this.getSpuData() + ", itemData=" + this.getItemData() + ")";
   }
}
