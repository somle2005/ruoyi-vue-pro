package com.xiaohongshu.fls.opensdk.entity.finance.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class QueryCpsSettleRequest extends BaseRequest {
   public String packageId;

   public String getPackageId() {
      return this.packageId;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof QueryCpsSettleRequest)) {
         return false;
      } else {
         QueryCpsSettleRequest other = (QueryCpsSettleRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$packageId = this.getPackageId();
            Object other$packageId = other.getPackageId();
            if (this$packageId == null) {
               if (other$packageId != null) {
                  return false;
               }
            } else if (!this$packageId.equals(other$packageId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof QueryCpsSettleRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      return result;
   }

   public String toString() {
      return "QueryCpsSettleRequest(packageId=" + this.getPackageId() + ")";
   }
}
