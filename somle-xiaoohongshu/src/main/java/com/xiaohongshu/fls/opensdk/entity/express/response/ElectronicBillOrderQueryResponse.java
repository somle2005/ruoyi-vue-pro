package com.xiaohongshu.fls.opensdk.entity.express.response;

public class ElectronicBillOrderQueryResponse {
   private String waybillCode;
   private String parentWaybillCode;
   private String printData;
   private String customerPrintData;
   private String extraInfo;

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getParentWaybillCode() {
      return this.parentWaybillCode;
   }

   public String getPrintData() {
      return this.printData;
   }

   public String getCustomerPrintData() {
      return this.customerPrintData;
   }

   public String getExtraInfo() {
      return this.extraInfo;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public void setParentWaybillCode(String parentWaybillCode) {
      this.parentWaybillCode = parentWaybillCode;
   }

   public void setPrintData(String printData) {
      this.printData = printData;
   }

   public void setCustomerPrintData(String customerPrintData) {
      this.customerPrintData = customerPrintData;
   }

   public void setExtraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillOrderQueryResponse)) {
         return false;
      } else {
         ElectronicBillOrderQueryResponse other = (ElectronicBillOrderQueryResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$waybillCode = this.getWaybillCode();
            Object other$waybillCode = other.getWaybillCode();
            if (this$waybillCode == null) {
               if (other$waybillCode != null) {
                  return false;
               }
            } else if (!this$waybillCode.equals(other$waybillCode)) {
               return false;
            }

            Object this$parentWaybillCode = this.getParentWaybillCode();
            Object other$parentWaybillCode = other.getParentWaybillCode();
            if (this$parentWaybillCode == null) {
               if (other$parentWaybillCode != null) {
                  return false;
               }
            } else if (!this$parentWaybillCode.equals(other$parentWaybillCode)) {
               return false;
            }

            Object this$printData = this.getPrintData();
            Object other$printData = other.getPrintData();
            if (this$printData == null) {
               if (other$printData != null) {
                  return false;
               }
            } else if (!this$printData.equals(other$printData)) {
               return false;
            }

            Object this$customerPrintData = this.getCustomerPrintData();
            Object other$customerPrintData = other.getCustomerPrintData();
            if (this$customerPrintData == null) {
               if (other$customerPrintData != null) {
                  return false;
               }
            } else if (!this$customerPrintData.equals(other$customerPrintData)) {
               return false;
            }

            Object this$extraInfo = this.getExtraInfo();
            Object other$extraInfo = other.getExtraInfo();
            if (this$extraInfo == null) {
               if (other$extraInfo != null) {
                  return false;
               }
            } else if (!this$extraInfo.equals(other$extraInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillOrderQueryResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $waybillCode = this.getWaybillCode();
      result = result * 59 + ($waybillCode == null ? 43 : $waybillCode.hashCode());
      Object $parentWaybillCode = this.getParentWaybillCode();
      result = result * 59 + ($parentWaybillCode == null ? 43 : $parentWaybillCode.hashCode());
      Object $printData = this.getPrintData();
      result = result * 59 + ($printData == null ? 43 : $printData.hashCode());
      Object $customerPrintData = this.getCustomerPrintData();
      result = result * 59 + ($customerPrintData == null ? 43 : $customerPrintData.hashCode());
      Object $extraInfo = this.getExtraInfo();
      result = result * 59 + ($extraInfo == null ? 43 : $extraInfo.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillOrderQueryResponse(waybillCode=" + this.getWaybillCode() + ", parentWaybillCode=" + this.getParentWaybillCode() + ", printData=" + this.getPrintData() + ", customerPrintData=" + this.getCustomerPrintData() + ", extraInfo=" + this.getExtraInfo() + ")";
   }
}
