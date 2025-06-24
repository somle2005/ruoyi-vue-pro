package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetCarriageTemplateListRequest extends BaseRequest {
   public Integer pageIndex;
   public Integer pageSize;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCarriageTemplateListRequest)) {
         return false;
      } else {
         GetCarriageTemplateListRequest other = (GetCarriageTemplateListRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$pageIndex = this.getPageIndex();
            Object other$pageIndex = other.getPageIndex();
            if (this$pageIndex == null) {
               if (other$pageIndex != null) {
                  return false;
               }
            } else if (!this$pageIndex.equals(other$pageIndex)) {
               return false;
            }

            Object this$pageSize = this.getPageSize();
            Object other$pageSize = other.getPageSize();
            if (this$pageSize == null) {
               if (other$pageSize != null) {
                  return false;
               }
            } else if (!this$pageSize.equals(other$pageSize)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCarriageTemplateListRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $pageIndex = this.getPageIndex();
      result = result * 59 + ($pageIndex == null ? 43 : $pageIndex.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      return result;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public String toString() {
      return "GetCarriageTemplateListRequest(pageIndex=" + this.getPageIndex() + ", pageSize=" + this.getPageSize() + ")";
   }
}
