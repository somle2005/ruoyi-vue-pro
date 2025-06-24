package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetItemInfoRequest extends BaseRequest {
   public int pageSize;
   public int pageNo;
   public String itemId;

   public int getPageSize() {
      return this.pageSize;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public String getItemId() {
      return this.itemId;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetItemInfoRequest)) {
         return false;
      } else {
         GetItemInfoRequest other = (GetItemInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else {
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
      return other instanceof GetItemInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getPageSize();
      result = result * 59 + this.getPageNo();
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      return result;
   }

   public String toString() {
      return "GetItemInfoRequest(pageSize=" + this.getPageSize() + ", pageNo=" + this.getPageNo() + ", itemId=" + this.getItemId() + ")";
   }
}
