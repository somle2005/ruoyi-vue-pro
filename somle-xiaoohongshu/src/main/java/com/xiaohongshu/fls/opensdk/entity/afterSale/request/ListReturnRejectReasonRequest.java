package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ListReturnRejectReasonRequest extends BaseRequest {
   public String returnsId;
   public Integer rejectReasonType;

   public String getReturnsId() {
      return this.returnsId;
   }

   public Integer getRejectReasonType() {
      return this.rejectReasonType;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setRejectReasonType(Integer rejectReasonType) {
      this.rejectReasonType = rejectReasonType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ListReturnRejectReasonRequest)) {
         return false;
      } else {
         ListReturnRejectReasonRequest other = (ListReturnRejectReasonRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$rejectReasonType = this.getRejectReasonType();
            Object other$rejectReasonType = other.getRejectReasonType();
            if (this$rejectReasonType == null) {
               if (other$rejectReasonType != null) {
                  return false;
               }
            } else if (!this$rejectReasonType.equals(other$rejectReasonType)) {
               return false;
            }

            Object this$returnsId = this.getReturnsId();
            Object other$returnsId = other.getReturnsId();
            if (this$returnsId == null) {
               if (other$returnsId != null) {
                  return false;
               }
            } else if (!this$returnsId.equals(other$returnsId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ListReturnRejectReasonRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $rejectReasonType = this.getRejectReasonType();
      result = result * 59 + ($rejectReasonType == null ? 43 : $rejectReasonType.hashCode());
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      return result;
   }

   public String toString() {
      return "ListReturnRejectReasonRequest(returnsId=" + this.getReturnsId() + ", rejectReasonType=" + this.getRejectReasonType() + ")";
   }
}
