package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetKosDataRequest extends BaseRequest {
   public String sellerId;
   public String startDate;
   public String endDate;
   public int pageNo;
   public int pageSize;

   public String getSellerId() {
      return this.sellerId;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setSellerId(String sellerId) {
      this.sellerId = sellerId;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetKosDataRequest)) {
         return false;
      } else {
         GetKosDataRequest other = (GetKosDataRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else {
            Object this$sellerId = this.getSellerId();
            Object other$sellerId = other.getSellerId();
            if (this$sellerId == null) {
               if (other$sellerId != null) {
                  return false;
               }
            } else if (!this$sellerId.equals(other$sellerId)) {
               return false;
            }

            Object this$startDate = this.getStartDate();
            Object other$startDate = other.getStartDate();
            if (this$startDate == null) {
               if (other$startDate != null) {
                  return false;
               }
            } else if (!this$startDate.equals(other$startDate)) {
               return false;
            }

            Object this$endDate = this.getEndDate();
            Object other$endDate = other.getEndDate();
            if (this$endDate == null) {
               if (other$endDate != null) {
                  return false;
               }
            } else if (!this$endDate.equals(other$endDate)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetKosDataRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      Object $sellerId = this.getSellerId();
      result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
      Object $startDate = this.getStartDate();
      result = result * 59 + ($startDate == null ? 43 : $startDate.hashCode());
      Object $endDate = this.getEndDate();
      result = result * 59 + ($endDate == null ? 43 : $endDate.hashCode());
      return result;
   }

   public String toString() {
      return "GetKosDataRequest(sellerId=" + this.getSellerId() + ", startDate=" + this.getStartDate() + ", endDate=" + this.getEndDate() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }
}
