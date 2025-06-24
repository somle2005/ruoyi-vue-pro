package com.xiaohongshu.fls.opensdk.entity.finance.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class DownloadStatementRequest extends BaseRequest {
   public String month;

   public String getMonth() {
      return this.month;
   }

   public void setMonth(String month) {
      this.month = month;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DownloadStatementRequest)) {
         return false;
      } else {
         DownloadStatementRequest other = (DownloadStatementRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$month = this.getMonth();
            Object other$month = other.getMonth();
            if (this$month == null) {
               if (other$month != null) {
                  return false;
               }
            } else if (!this$month.equals(other$month)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DownloadStatementRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $month = this.getMonth();
      result = result * 59 + ($month == null ? 43 : $month.hashCode());
      return result;
   }

   public String toString() {
      return "DownloadStatementRequest(month=" + this.getMonth() + ")";
   }
}
