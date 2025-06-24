package com.xiaohongshu.fls.opensdk.entity.express.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ElectronicBillSubscribesQueryRequest extends BaseRequest {
   private Integer billVersion;
   private String cpCode;
   private boolean needUsage;
   private String brandCode;

   public Integer getBillVersion() {
      return this.billVersion;
   }

   public String getCpCode() {
      return this.cpCode;
   }

   public boolean isNeedUsage() {
      return this.needUsage;
   }

   public String getBrandCode() {
      return this.brandCode;
   }

   public void setBillVersion(Integer billVersion) {
      this.billVersion = billVersion;
   }

   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   public void setNeedUsage(boolean needUsage) {
      this.needUsage = needUsage;
   }

   public void setBrandCode(String brandCode) {
      this.brandCode = brandCode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillSubscribesQueryRequest)) {
         return false;
      } else {
         ElectronicBillSubscribesQueryRequest other = (ElectronicBillSubscribesQueryRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isNeedUsage() != other.isNeedUsage()) {
            return false;
         } else {
            Object this$billVersion = this.getBillVersion();
            Object other$billVersion = other.getBillVersion();
            if (this$billVersion == null) {
               if (other$billVersion != null) {
                  return false;
               }
            } else if (!this$billVersion.equals(other$billVersion)) {
               return false;
            }

            Object this$cpCode = this.getCpCode();
            Object other$cpCode = other.getCpCode();
            if (this$cpCode == null) {
               if (other$cpCode != null) {
                  return false;
               }
            } else if (!this$cpCode.equals(other$cpCode)) {
               return false;
            }

            Object this$brandCode = this.getBrandCode();
            Object other$brandCode = other.getBrandCode();
            if (this$brandCode == null) {
               if (other$brandCode != null) {
                  return false;
               }
            } else if (!this$brandCode.equals(other$brandCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillSubscribesQueryRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isNeedUsage() ? 79 : 97);
      Object $billVersion = this.getBillVersion();
      result = result * 59 + ($billVersion == null ? 43 : $billVersion.hashCode());
      Object $cpCode = this.getCpCode();
      result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
      Object $brandCode = this.getBrandCode();
      result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillSubscribesQueryRequest(billVersion=" + this.getBillVersion() + ", cpCode=" + this.getCpCode() + ", needUsage=" + this.isNeedUsage() + ", brandCode=" + this.getBrandCode() + ")";
   }
}
