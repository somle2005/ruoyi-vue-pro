package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class IncItemStockRequest extends BaseRequest {
   public String itemId;
   public Integer qty;

   public String getItemId() {
      return this.itemId;
   }

   public Integer getQty() {
      return this.qty;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setQty(Integer qty) {
      this.qty = qty;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof IncItemStockRequest)) {
         return false;
      } else {
         IncItemStockRequest other = (IncItemStockRequest)o;
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
      return other instanceof IncItemStockRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $qty = this.getQty();
      result = result * 59 + ($qty == null ? 43 : $qty.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      return result;
   }

   public String toString() {
      return "IncItemStockRequest(itemId=" + this.getItemId() + ", qty=" + this.getQty() + ")";
   }
}
