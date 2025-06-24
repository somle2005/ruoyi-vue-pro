package com.xiaohongshu.fls.opensdk.entity.express.response;

public class ElectronicBillOrderUpdateResponse {
   private ElectronicBillPrintData waybill;
   private String subErrorCode;

   public ElectronicBillPrintData getWaybill() {
      return this.waybill;
   }

   public String getSubErrorCode() {
      return this.subErrorCode;
   }

   public void setWaybill(ElectronicBillPrintData waybill) {
      this.waybill = waybill;
   }

   public void setSubErrorCode(String subErrorCode) {
      this.subErrorCode = subErrorCode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillOrderUpdateResponse)) {
         return false;
      } else {
         ElectronicBillOrderUpdateResponse other = (ElectronicBillOrderUpdateResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$waybill = this.getWaybill();
            Object other$waybill = other.getWaybill();
            if (this$waybill == null) {
               if (other$waybill != null) {
                  return false;
               }
            } else if (!this$waybill.equals(other$waybill)) {
               return false;
            }

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
      return other instanceof ElectronicBillOrderUpdateResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $waybill = this.getWaybill();
      result = result * 59 + ($waybill == null ? 43 : $waybill.hashCode());
      Object $subErrorCode = this.getSubErrorCode();
      result = result * 59 + ($subErrorCode == null ? 43 : $subErrorCode.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillOrderUpdateResponse(waybill=" + this.getWaybill() + ", subErrorCode=" + this.getSubErrorCode() + ")";
   }

   public static class ElectronicBillPrintData {
      private String objectId;
      private String waybillCode;
      private String printData;
      private String customerPrintData;
      private String parentWaybillCode;
      private String extraInfo;
      private String cpCode;

      public String getObjectId() {
         return this.objectId;
      }

      public String getWaybillCode() {
         return this.waybillCode;
      }

      public String getPrintData() {
         return this.printData;
      }

      public String getCustomerPrintData() {
         return this.customerPrintData;
      }

      public String getParentWaybillCode() {
         return this.parentWaybillCode;
      }

      public String getExtraInfo() {
         return this.extraInfo;
      }

      public String getCpCode() {
         return this.cpCode;
      }

      public void setObjectId(String objectId) {
         this.objectId = objectId;
      }

      public void setWaybillCode(String waybillCode) {
         this.waybillCode = waybillCode;
      }

      public void setPrintData(String printData) {
         this.printData = printData;
      }

      public void setCustomerPrintData(String customerPrintData) {
         this.customerPrintData = customerPrintData;
      }

      public void setParentWaybillCode(String parentWaybillCode) {
         this.parentWaybillCode = parentWaybillCode;
      }

      public void setExtraInfo(String extraInfo) {
         this.extraInfo = extraInfo;
      }

      public void setCpCode(String cpCode) {
         this.cpCode = cpCode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ElectronicBillPrintData)) {
            return false;
         } else {
            ElectronicBillPrintData other = (ElectronicBillPrintData)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$objectId = this.getObjectId();
               Object other$objectId = other.getObjectId();
               if (this$objectId == null) {
                  if (other$objectId != null) {
                     return false;
                  }
               } else if (!this$objectId.equals(other$objectId)) {
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

               Object this$parentWaybillCode = this.getParentWaybillCode();
               Object other$parentWaybillCode = other.getParentWaybillCode();
               if (this$parentWaybillCode == null) {
                  if (other$parentWaybillCode != null) {
                     return false;
                  }
               } else if (!this$parentWaybillCode.equals(other$parentWaybillCode)) {
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

               Object this$cpCode = this.getCpCode();
               Object other$cpCode = other.getCpCode();
               if (this$cpCode == null) {
                  if (other$cpCode != null) {
                     return false;
                  }
               } else if (!this$cpCode.equals(other$cpCode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ElectronicBillPrintData;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $objectId = this.getObjectId();
         result = result * 59 + ($objectId == null ? 43 : $objectId.hashCode());
         Object $waybillCode = this.getWaybillCode();
         result = result * 59 + ($waybillCode == null ? 43 : $waybillCode.hashCode());
         Object $printData = this.getPrintData();
         result = result * 59 + ($printData == null ? 43 : $printData.hashCode());
         Object $customerPrintData = this.getCustomerPrintData();
         result = result * 59 + ($customerPrintData == null ? 43 : $customerPrintData.hashCode());
         Object $parentWaybillCode = this.getParentWaybillCode();
         result = result * 59 + ($parentWaybillCode == null ? 43 : $parentWaybillCode.hashCode());
         Object $extraInfo = this.getExtraInfo();
         result = result * 59 + ($extraInfo == null ? 43 : $extraInfo.hashCode());
         Object $cpCode = this.getCpCode();
         result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillOrderUpdateResponse.ElectronicBillPrintData(objectId=" + this.getObjectId() + ", waybillCode=" + this.getWaybillCode() + ", printData=" + this.getPrintData() + ", customerPrintData=" + this.getCustomerPrintData() + ", parentWaybillCode=" + this.getParentWaybillCode() + ", extraInfo=" + this.getExtraInfo() + ", cpCode=" + this.getCpCode() + ")";
      }
   }
}
