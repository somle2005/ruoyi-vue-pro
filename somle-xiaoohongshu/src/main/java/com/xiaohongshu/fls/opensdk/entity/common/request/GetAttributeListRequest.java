package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetAttributeListRequest extends BaseRequest {
   public String categoryId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAttributeListRequest)) {
         return false;
      } else {
         GetAttributeListRequest other = (GetAttributeListRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$categoryId = this.getCategoryId();
            Object other$categoryId = other.getCategoryId();
            if (this$categoryId == null) {
               if (other$categoryId != null) {
                  return false;
               }
            } else if (!this$categoryId.equals(other$categoryId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAttributeListRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $categoryId = this.getCategoryId();
      result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
      return result;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public String toString() {
      return "GetAttributeListRequest(categoryId=" + this.getCategoryId() + ")";
   }
}
