package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetAfterSaleInfoRequest extends BaseRequest {
   public String returnsId;
   public Boolean needNegotiateRecord;

   public String getReturnsId() {
      return this.returnsId;
   }

   public Boolean getNeedNegotiateRecord() {
      return this.needNegotiateRecord;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setNeedNegotiateRecord(Boolean needNegotiateRecord) {
      this.needNegotiateRecord = needNegotiateRecord;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAfterSaleInfoRequest)) {
         return false;
      } else {
         GetAfterSaleInfoRequest other = (GetAfterSaleInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$needNegotiateRecord = this.getNeedNegotiateRecord();
            Object other$needNegotiateRecord = other.getNeedNegotiateRecord();
            if (this$needNegotiateRecord == null) {
               if (other$needNegotiateRecord != null) {
                  return false;
               }
            } else if (!this$needNegotiateRecord.equals(other$needNegotiateRecord)) {
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
      return other instanceof GetAfterSaleInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $needNegotiateRecord = this.getNeedNegotiateRecord();
      result = result * 59 + ($needNegotiateRecord == null ? 43 : $needNegotiateRecord.hashCode());
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      return result;
   }

   public String toString() {
      return "GetAfterSaleInfoRequest(returnsId=" + this.getReturnsId() + ", needNegotiateRecord=" + this.getNeedNegotiateRecord() + ")";
   }
}
