package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetBrandRequest extends BaseRequest {
   private String categoryId;
   private String keyword;
   private Integer pageNo;
   private Integer pageSize;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetBrandRequest)) {
         return false;
      } else {
         GetBrandRequest other = (GetBrandRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$pageNo = this.getPageNo();
            Object other$pageNo = other.getPageNo();
            if (this$pageNo == null) {
               if (other$pageNo != null) {
                  return false;
               }
            } else if (!this$pageNo.equals(other$pageNo)) {
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

            Object this$categoryId = this.getCategoryId();
            Object other$categoryId = other.getCategoryId();
            if (this$categoryId == null) {
               if (other$categoryId != null) {
                  return false;
               }
            } else if (!this$categoryId.equals(other$categoryId)) {
               return false;
            }

            Object this$keyword = this.getKeyword();
            Object other$keyword = other.getKeyword();
            if (this$keyword == null) {
               if (other$keyword != null) {
                  return false;
               }
            } else if (!this$keyword.equals(other$keyword)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetBrandRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $categoryId = this.getCategoryId();
      result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
      Object $keyword = this.getKeyword();
      result = result * 59 + ($keyword == null ? 43 : $keyword.hashCode());
      return result;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public String getKeyword() {
      return this.keyword;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public void setKeyword(String keyword) {
      this.keyword = keyword;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public String toString() {
      return "GetBrandRequest(categoryId=" + this.getCategoryId() + ", keyword=" + this.getKeyword() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }
}
