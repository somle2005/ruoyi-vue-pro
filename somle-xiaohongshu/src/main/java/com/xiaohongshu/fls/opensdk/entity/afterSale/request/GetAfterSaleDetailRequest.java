package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetAfterSaleDetailRequest extends BaseRequest {
   public String afterSaleId;

   public String getAfterSaleId() {
      return this.afterSaleId;
   }

   public void setAfterSaleId(String afterSaleId) {
      this.afterSaleId = afterSaleId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAfterSaleDetailRequest)) {
         return false;
      } else {
         GetAfterSaleDetailRequest other = (GetAfterSaleDetailRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$afterSaleId = this.getAfterSaleId();
            Object other$afterSaleId = other.getAfterSaleId();
            if (this$afterSaleId == null) {
               if (other$afterSaleId != null) {
                  return false;
               }
            } else if (!this$afterSaleId.equals(other$afterSaleId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAfterSaleDetailRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $afterSaleId = this.getAfterSaleId();
      result = result * 59 + ($afterSaleId == null ? 43 : $afterSaleId.hashCode());
      return result;
   }

   public String toString() {
      return "GetAfterSaleDetailRequest(afterSaleId=" + this.getAfterSaleId() + ")";
   }
}
