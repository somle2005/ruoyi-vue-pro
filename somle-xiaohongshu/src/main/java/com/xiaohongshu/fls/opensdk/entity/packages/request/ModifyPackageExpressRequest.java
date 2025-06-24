package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ModifyPackageExpressRequest extends BaseRequest {
   public String packageId;
   public String expressNo;
   public String expressCompanyCode;
   public String expressCompanyName;
   public Integer deliveryPackageIndex;

   public String getPackageId() {
      return this.packageId;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressCompanyName() {
      return this.expressCompanyName;
   }

   public Integer getDeliveryPackageIndex() {
      return this.deliveryPackageIndex;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressCompanyName(String expressCompanyName) {
      this.expressCompanyName = expressCompanyName;
   }

   public void setDeliveryPackageIndex(Integer deliveryPackageIndex) {
      this.deliveryPackageIndex = deliveryPackageIndex;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ModifyPackageExpressRequest)) {
         return false;
      } else {
         ModifyPackageExpressRequest other = (ModifyPackageExpressRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$deliveryPackageIndex = this.getDeliveryPackageIndex();
            Object other$deliveryPackageIndex = other.getDeliveryPackageIndex();
            if (this$deliveryPackageIndex == null) {
               if (other$deliveryPackageIndex != null) {
                  return false;
               }
            } else if (!this$deliveryPackageIndex.equals(other$deliveryPackageIndex)) {
               return false;
            }

            Object this$packageId = this.getPackageId();
            Object other$packageId = other.getPackageId();
            if (this$packageId == null) {
               if (other$packageId != null) {
                  return false;
               }
            } else if (!this$packageId.equals(other$packageId)) {
               return false;
            }

            Object this$expressNo = this.getExpressNo();
            Object other$expressNo = other.getExpressNo();
            if (this$expressNo == null) {
               if (other$expressNo != null) {
                  return false;
               }
            } else if (!this$expressNo.equals(other$expressNo)) {
               return false;
            }

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
               return false;
            }

            Object this$expressCompanyName = this.getExpressCompanyName();
            Object other$expressCompanyName = other.getExpressCompanyName();
            if (this$expressCompanyName == null) {
               if (other$expressCompanyName != null) {
                  return false;
               }
            } else if (!this$expressCompanyName.equals(other$expressCompanyName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ModifyPackageExpressRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $deliveryPackageIndex = this.getDeliveryPackageIndex();
      result = result * 59 + ($deliveryPackageIndex == null ? 43 : $deliveryPackageIndex.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressCompanyName = this.getExpressCompanyName();
      result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
      return result;
   }

   public String toString() {
      return "ModifyPackageExpressRequest(packageId=" + this.getPackageId() + ", expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", deliveryPackageIndex=" + this.getDeliveryPackageIndex() + ")";
   }
}
