package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ResendBondedPaymentRequest extends BaseRequest {
   private String packageId;
   private String customsType;

   public String getPackageId() {
      return this.packageId;
   }

   public String getCustomsType() {
      return this.customsType;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setCustomsType(String customsType) {
      this.customsType = customsType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ResendBondedPaymentRequest)) {
         return false;
      } else {
         ResendBondedPaymentRequest other = (ResendBondedPaymentRequest)o;
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

            Object this$customsType = this.getCustomsType();
            Object other$customsType = other.getCustomsType();
            if (this$customsType == null) {
               if (other$customsType != null) {
                  return false;
               }
            } else if (!this$customsType.equals(other$customsType)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ResendBondedPaymentRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      Object $customsType = this.getCustomsType();
      result = result * 59 + ($customsType == null ? 43 : $customsType.hashCode());
      return result;
   }

   public String toString() {
      return "ResendBondedPaymentRequest(packageId=" + this.getPackageId() + ", customsType=" + this.getCustomsType() + ")";
   }
}
