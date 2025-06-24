package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class CategoryMatchResponse {
   public List<CategoryInfo> categoryInfo;

   public List<CategoryInfo> getCategoryInfo() {
      return this.categoryInfo;
   }

   public void setCategoryInfo(List<CategoryInfo> categoryInfo) {
      this.categoryInfo = categoryInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CategoryMatchResponse)) {
         return false;
      } else {
         CategoryMatchResponse other = (CategoryMatchResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$categoryInfo = this.getCategoryInfo();
            Object other$categoryInfo = other.getCategoryInfo();
            if (this$categoryInfo == null) {
               if (other$categoryInfo != null) {
                  return false;
               }
            } else if (!this$categoryInfo.equals(other$categoryInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CategoryMatchResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $categoryInfo = this.getCategoryInfo();
      result = result * 59 + ($categoryInfo == null ? 43 : $categoryInfo.hashCode());
      return result;
   }

   public String toString() {
      return "CategoryMatchResponse(categoryInfo=" + this.getCategoryInfo() + ")";
   }

   public static class CategoryInfo {
      public String id;
      public String name;
      public float score;
   }
}
