package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetCategoriesRequest extends BaseRequest {
   public String categoryId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCategoriesRequest)) {
         return false;
      } else {
         GetCategoriesRequest other = (GetCategoriesRequest)o;
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
      return other instanceof GetCategoriesRequest;
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
      return "GetCategoriesRequest(categoryId=" + this.getCategoryId() + ")";
   }
}
