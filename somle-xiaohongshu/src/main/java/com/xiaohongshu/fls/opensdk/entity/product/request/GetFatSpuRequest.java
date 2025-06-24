package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetFatSpuRequest extends BaseRequest {
   public String spuId;
   public Integer pageNo;
   public Integer pageSize;

   public String getSpuId() {
      return this.spuId;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetFatSpuRequest)) {
         return false;
      } else {
         GetFatSpuRequest other = (GetFatSpuRequest)o;
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

            Object this$spuId = this.getSpuId();
            Object other$spuId = other.getSpuId();
            if (this$spuId == null) {
               if (other$spuId != null) {
                  return false;
               }
            } else if (!this$spuId.equals(other$spuId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetFatSpuRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      return result;
   }

   public String toString() {
      return "GetFatSpuRequest(spuId=" + this.getSpuId() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }
}
