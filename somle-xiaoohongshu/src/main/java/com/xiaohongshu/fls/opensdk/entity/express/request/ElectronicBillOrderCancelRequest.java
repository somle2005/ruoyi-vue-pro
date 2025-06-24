package com.xiaohongshu.fls.opensdk.entity.express.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ElectronicBillOrderCancelRequest extends BaseRequest {
   private Integer billVersion;
   private String cpCode;
   private String waybillCode;

   public Integer getBillVersion() {
      return this.billVersion;
   }

   public String getCpCode() {
      return this.cpCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setBillVersion(Integer billVersion) {
      this.billVersion = billVersion;
   }

   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillOrderCancelRequest)) {
         return false;
      } else {
         ElectronicBillOrderCancelRequest other = (ElectronicBillOrderCancelRequest)o;
         if (!other.canEqual(this)) {
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

            Object this$waybillCode = this.getWaybillCode();
            Object other$waybillCode = other.getWaybillCode();
            if (this$waybillCode == null) {
               if (other$waybillCode != null) {
                  return false;
               }
            } else if (!this$waybillCode.equals(other$waybillCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillOrderCancelRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $billVersion = this.getBillVersion();
      result = result * 59 + ($billVersion == null ? 43 : $billVersion.hashCode());
      Object $cpCode = this.getCpCode();
      result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
      Object $waybillCode = this.getWaybillCode();
      result = result * 59 + ($waybillCode == null ? 43 : $waybillCode.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillOrderCancelRequest(billVersion=" + this.getBillVersion() + ", cpCode=" + this.getCpCode() + ", waybillCode=" + this.getWaybillCode() + ")";
   }
}
