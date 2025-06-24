package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class DeleteItemV3Request extends BaseRequest {
   public List<String> itemIds;

   public List<String> getItemIds() {
      return this.itemIds;
   }

   public void setItemIds(List<String> itemIds) {
      this.itemIds = itemIds;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteItemV3Request)) {
         return false;
      } else {
         DeleteItemV3Request other = (DeleteItemV3Request)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$itemIds = this.getItemIds();
            Object other$itemIds = other.getItemIds();
            if (this$itemIds == null) {
               if (other$itemIds != null) {
                  return false;
               }
            } else if (!this$itemIds.equals(other$itemIds)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DeleteItemV3Request;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $itemIds = this.getItemIds();
      result = result * 59 + ($itemIds == null ? 43 : $itemIds.hashCode());
      return result;
   }

   public String toString() {
      return "DeleteItemV3Request(itemIds=" + this.getItemIds() + ")";
   }
}
