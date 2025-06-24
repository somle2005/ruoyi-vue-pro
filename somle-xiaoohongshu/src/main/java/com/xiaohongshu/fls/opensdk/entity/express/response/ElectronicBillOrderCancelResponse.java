package com.xiaohongshu.fls.opensdk.entity.express.response;

public class ElectronicBillOrderCancelResponse {
   private String subErrorCode;

   public String getSubErrorCode() {
      return this.subErrorCode;
   }

   public void setSubErrorCode(String subErrorCode) {
      this.subErrorCode = subErrorCode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillOrderCancelResponse)) {
         return false;
      } else {
         ElectronicBillOrderCancelResponse other = (ElectronicBillOrderCancelResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$subErrorCode = this.getSubErrorCode();
            Object other$subErrorCode = other.getSubErrorCode();
            if (this$subErrorCode == null) {
               if (other$subErrorCode != null) {
                  return false;
               }
            } else if (!this$subErrorCode.equals(other$subErrorCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillOrderCancelResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $subErrorCode = this.getSubErrorCode();
      result = result * 59 + ($subErrorCode == null ? 43 : $subErrorCode.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillOrderCancelResponse(subErrorCode=" + this.getSubErrorCode() + ")";
   }
}
