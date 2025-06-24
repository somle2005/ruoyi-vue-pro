package com.xiaohongshu.fls.opensdk.entity.express.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ElectronicBillTemplatesQueryRequest extends BaseRequest {
   private Integer billVersion;
   private String cpCode;
   private String brandCode;
   private String type;
   private Integer templateCustomerType;

   public Integer getBillVersion() {
      return this.billVersion;
   }

   public String getCpCode() {
      return this.cpCode;
   }

   public String getBrandCode() {
      return this.brandCode;
   }

   public String getType() {
      return this.type;
   }

   public Integer getTemplateCustomerType() {
      return this.templateCustomerType;
   }

   public void setBillVersion(Integer billVersion) {
      this.billVersion = billVersion;
   }

   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   public void setBrandCode(String brandCode) {
      this.brandCode = brandCode;
   }

   public void setType(String type) {
      this.type = type;
   }

   public void setTemplateCustomerType(Integer templateCustomerType) {
      this.templateCustomerType = templateCustomerType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillTemplatesQueryRequest)) {
         return false;
      } else {
         ElectronicBillTemplatesQueryRequest other = (ElectronicBillTemplatesQueryRequest)o;
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

            Object this$templateCustomerType = this.getTemplateCustomerType();
            Object other$templateCustomerType = other.getTemplateCustomerType();
            if (this$templateCustomerType == null) {
               if (other$templateCustomerType != null) {
                  return false;
               }
            } else if (!this$templateCustomerType.equals(other$templateCustomerType)) {
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

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillTemplatesQueryRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $billVersion = this.getBillVersion();
      result = result * 59 + ($billVersion == null ? 43 : $billVersion.hashCode());
      Object $templateCustomerType = this.getTemplateCustomerType();
      result = result * 59 + ($templateCustomerType == null ? 43 : $templateCustomerType.hashCode());
      Object $cpCode = this.getCpCode();
      result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
      Object $brandCode = this.getBrandCode();
      result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillTemplatesQueryRequest(billVersion=" + this.getBillVersion() + ", cpCode=" + this.getCpCode() + ", brandCode=" + this.getBrandCode() + ", type=" + this.getType() + ", templateCustomerType=" + this.getTemplateCustomerType() + ")";
   }
}
