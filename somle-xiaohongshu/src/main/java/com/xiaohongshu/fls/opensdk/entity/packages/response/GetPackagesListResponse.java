package com.xiaohongshu.fls.opensdk.entity.packages.response;

import java.util.ArrayList;
import java.util.List;

public class GetPackagesListResponse {
   public int total;
   public int pageNo;
   public int pageSize;
   public int maxPageNo;
   public List<PackageSimpleDetail> packageList = new ArrayList();

   public int getTotal() {
      return this.total;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public int getMaxPageNo() {
      return this.maxPageNo;
   }

   public List<PackageSimpleDetail> getPackageList() {
      return this.packageList;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setMaxPageNo(int maxPageNo) {
      this.maxPageNo = maxPageNo;
   }

   public void setPackageList(List<PackageSimpleDetail> packageList) {
      this.packageList = packageList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetPackagesListResponse)) {
         return false;
      } else {
         GetPackagesListResponse other = (GetPackagesListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getMaxPageNo() != other.getMaxPageNo()) {
            return false;
         } else {
            Object this$packageList = this.getPackageList();
            Object other$packageList = other.getPackageList();
            if (this$packageList == null) {
               if (other$packageList != null) {
                  return false;
               }
            } else if (!this$packageList.equals(other$packageList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetPackagesListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getTotal();
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      result = result * 59 + this.getMaxPageNo();
      Object $packageList = this.getPackageList();
      result = result * 59 + ($packageList == null ? 43 : $packageList.hashCode());
      return result;
   }

   public String toString() {
      return "GetPackagesListResponse(total=" + this.getTotal() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", maxPageNo=" + this.getMaxPageNo() + ", packageList=" + this.getPackageList() + ")";
   }

   public class PackageSimpleDetail {
      public String packageId;
      public String orderId;
      public int packageType;
      public int packageStatus;
      public int packageAfterSalesStatus;
      public int cancelStatus;
      public long createdTime;
      public long paidTime;
      public long updateTime;
      public long deliveryTime;
      public long cancelTime;
      public long finishTime;
      public long promiseLastDeliveryTime;
      public String planInfoId;
      public String planInfoName;
      public String receiverCountryId;
      public String receiverCountryName;
      public String receiverProvinceId;
      public String receiverProvinceName;
      public String receiverCityId;
      public String receiverCityName;
      public String receiverDistrictId;
      public String receiverDistrictName;
      public String customerRemark;
      public String sellerRemark;
      public int sellerRemarkFlag;
      public String originalPackageId;
      public String logistics;

      public String getPackageId() {
         return this.packageId;
      }

      public String getOrderId() {
         return this.orderId;
      }

      public int getPackageType() {
         return this.packageType;
      }

      public int getPackageStatus() {
         return this.packageStatus;
      }

      public int getPackageAfterSalesStatus() {
         return this.packageAfterSalesStatus;
      }

      public int getCancelStatus() {
         return this.cancelStatus;
      }

      public long getCreatedTime() {
         return this.createdTime;
      }

      public long getPaidTime() {
         return this.paidTime;
      }

      public long getUpdateTime() {
         return this.updateTime;
      }

      public long getDeliveryTime() {
         return this.deliveryTime;
      }

      public long getCancelTime() {
         return this.cancelTime;
      }

      public long getFinishTime() {
         return this.finishTime;
      }

      public long getPromiseLastDeliveryTime() {
         return this.promiseLastDeliveryTime;
      }

      public String getPlanInfoId() {
         return this.planInfoId;
      }

      public String getPlanInfoName() {
         return this.planInfoName;
      }

      public String getReceiverCountryId() {
         return this.receiverCountryId;
      }

      public String getReceiverCountryName() {
         return this.receiverCountryName;
      }

      public String getReceiverProvinceId() {
         return this.receiverProvinceId;
      }

      public String getReceiverProvinceName() {
         return this.receiverProvinceName;
      }

      public String getReceiverCityId() {
         return this.receiverCityId;
      }

      public String getReceiverCityName() {
         return this.receiverCityName;
      }

      public String getReceiverDistrictId() {
         return this.receiverDistrictId;
      }

      public String getReceiverDistrictName() {
         return this.receiverDistrictName;
      }

      public String getCustomerRemark() {
         return this.customerRemark;
      }

      public String getSellerRemark() {
         return this.sellerRemark;
      }

      public int getSellerRemarkFlag() {
         return this.sellerRemarkFlag;
      }

      public String getOriginalPackageId() {
         return this.originalPackageId;
      }

      public String getLogistics() {
         return this.logistics;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setPackageType(int packageType) {
         this.packageType = packageType;
      }

      public void setPackageStatus(int packageStatus) {
         this.packageStatus = packageStatus;
      }

      public void setPackageAfterSalesStatus(int packageAfterSalesStatus) {
         this.packageAfterSalesStatus = packageAfterSalesStatus;
      }

      public void setCancelStatus(int cancelStatus) {
         this.cancelStatus = cancelStatus;
      }

      public void setCreatedTime(long createdTime) {
         this.createdTime = createdTime;
      }

      public void setPaidTime(long paidTime) {
         this.paidTime = paidTime;
      }

      public void setUpdateTime(long updateTime) {
         this.updateTime = updateTime;
      }

      public void setDeliveryTime(long deliveryTime) {
         this.deliveryTime = deliveryTime;
      }

      public void setCancelTime(long cancelTime) {
         this.cancelTime = cancelTime;
      }

      public void setFinishTime(long finishTime) {
         this.finishTime = finishTime;
      }

      public void setPromiseLastDeliveryTime(long promiseLastDeliveryTime) {
         this.promiseLastDeliveryTime = promiseLastDeliveryTime;
      }

      public void setPlanInfoId(String planInfoId) {
         this.planInfoId = planInfoId;
      }

      public void setPlanInfoName(String planInfoName) {
         this.planInfoName = planInfoName;
      }

      public void setReceiverCountryId(String receiverCountryId) {
         this.receiverCountryId = receiverCountryId;
      }

      public void setReceiverCountryName(String receiverCountryName) {
         this.receiverCountryName = receiverCountryName;
      }

      public void setReceiverProvinceId(String receiverProvinceId) {
         this.receiverProvinceId = receiverProvinceId;
      }

      public void setReceiverProvinceName(String receiverProvinceName) {
         this.receiverProvinceName = receiverProvinceName;
      }

      public void setReceiverCityId(String receiverCityId) {
         this.receiverCityId = receiverCityId;
      }

      public void setReceiverCityName(String receiverCityName) {
         this.receiverCityName = receiverCityName;
      }

      public void setReceiverDistrictId(String receiverDistrictId) {
         this.receiverDistrictId = receiverDistrictId;
      }

      public void setReceiverDistrictName(String receiverDistrictName) {
         this.receiverDistrictName = receiverDistrictName;
      }

      public void setCustomerRemark(String customerRemark) {
         this.customerRemark = customerRemark;
      }

      public void setSellerRemark(String sellerRemark) {
         this.sellerRemark = sellerRemark;
      }

      public void setSellerRemarkFlag(int sellerRemarkFlag) {
         this.sellerRemarkFlag = sellerRemarkFlag;
      }

      public void setOriginalPackageId(String originalPackageId) {
         this.originalPackageId = originalPackageId;
      }

      public void setLogistics(String logistics) {
         this.logistics = logistics;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PackageSimpleDetail)) {
            return false;
         } else {
            PackageSimpleDetail other = (PackageSimpleDetail)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getPackageType() != other.getPackageType()) {
               return false;
            } else if (this.getPackageStatus() != other.getPackageStatus()) {
               return false;
            } else if (this.getPackageAfterSalesStatus() != other.getPackageAfterSalesStatus()) {
               return false;
            } else if (this.getCancelStatus() != other.getCancelStatus()) {
               return false;
            } else if (this.getCreatedTime() != other.getCreatedTime()) {
               return false;
            } else if (this.getPaidTime() != other.getPaidTime()) {
               return false;
            } else if (this.getUpdateTime() != other.getUpdateTime()) {
               return false;
            } else if (this.getDeliveryTime() != other.getDeliveryTime()) {
               return false;
            } else if (this.getCancelTime() != other.getCancelTime()) {
               return false;
            } else if (this.getFinishTime() != other.getFinishTime()) {
               return false;
            } else if (this.getPromiseLastDeliveryTime() != other.getPromiseLastDeliveryTime()) {
               return false;
            } else if (this.getSellerRemarkFlag() != other.getSellerRemarkFlag()) {
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

               Object this$orderId = this.getOrderId();
               Object other$orderId = other.getOrderId();
               if (this$orderId == null) {
                  if (other$orderId != null) {
                     return false;
                  }
               } else if (!this$orderId.equals(other$orderId)) {
                  return false;
               }

               Object this$planInfoId = this.getPlanInfoId();
               Object other$planInfoId = other.getPlanInfoId();
               if (this$planInfoId == null) {
                  if (other$planInfoId != null) {
                     return false;
                  }
               } else if (!this$planInfoId.equals(other$planInfoId)) {
                  return false;
               }

               Object this$planInfoName = this.getPlanInfoName();
               Object other$planInfoName = other.getPlanInfoName();
               if (this$planInfoName == null) {
                  if (other$planInfoName != null) {
                     return false;
                  }
               } else if (!this$planInfoName.equals(other$planInfoName)) {
                  return false;
               }

               Object this$receiverCountryId = this.getReceiverCountryId();
               Object other$receiverCountryId = other.getReceiverCountryId();
               if (this$receiverCountryId == null) {
                  if (other$receiverCountryId != null) {
                     return false;
                  }
               } else if (!this$receiverCountryId.equals(other$receiverCountryId)) {
                  return false;
               }

               Object this$receiverCountryName = this.getReceiverCountryName();
               Object other$receiverCountryName = other.getReceiverCountryName();
               if (this$receiverCountryName == null) {
                  if (other$receiverCountryName != null) {
                     return false;
                  }
               } else if (!this$receiverCountryName.equals(other$receiverCountryName)) {
                  return false;
               }

               Object this$receiverProvinceId = this.getReceiverProvinceId();
               Object other$receiverProvinceId = other.getReceiverProvinceId();
               if (this$receiverProvinceId == null) {
                  if (other$receiverProvinceId != null) {
                     return false;
                  }
               } else if (!this$receiverProvinceId.equals(other$receiverProvinceId)) {
                  return false;
               }

               Object this$receiverProvinceName = this.getReceiverProvinceName();
               Object other$receiverProvinceName = other.getReceiverProvinceName();
               if (this$receiverProvinceName == null) {
                  if (other$receiverProvinceName != null) {
                     return false;
                  }
               } else if (!this$receiverProvinceName.equals(other$receiverProvinceName)) {
                  return false;
               }

               Object this$receiverCityId = this.getReceiverCityId();
               Object other$receiverCityId = other.getReceiverCityId();
               if (this$receiverCityId == null) {
                  if (other$receiverCityId != null) {
                     return false;
                  }
               } else if (!this$receiverCityId.equals(other$receiverCityId)) {
                  return false;
               }

               Object this$receiverCityName = this.getReceiverCityName();
               Object other$receiverCityName = other.getReceiverCityName();
               if (this$receiverCityName == null) {
                  if (other$receiverCityName != null) {
                     return false;
                  }
               } else if (!this$receiverCityName.equals(other$receiverCityName)) {
                  return false;
               }

               Object this$receiverDistrictId = this.getReceiverDistrictId();
               Object other$receiverDistrictId = other.getReceiverDistrictId();
               if (this$receiverDistrictId == null) {
                  if (other$receiverDistrictId != null) {
                     return false;
                  }
               } else if (!this$receiverDistrictId.equals(other$receiverDistrictId)) {
                  return false;
               }

               Object this$receiverDistrictName = this.getReceiverDistrictName();
               Object other$receiverDistrictName = other.getReceiverDistrictName();
               if (this$receiverDistrictName == null) {
                  if (other$receiverDistrictName != null) {
                     return false;
                  }
               } else if (!this$receiverDistrictName.equals(other$receiverDistrictName)) {
                  return false;
               }

               Object this$customerRemark = this.getCustomerRemark();
               Object other$customerRemark = other.getCustomerRemark();
               if (this$customerRemark == null) {
                  if (other$customerRemark != null) {
                     return false;
                  }
               } else if (!this$customerRemark.equals(other$customerRemark)) {
                  return false;
               }

               Object this$sellerRemark = this.getSellerRemark();
               Object other$sellerRemark = other.getSellerRemark();
               if (this$sellerRemark == null) {
                  if (other$sellerRemark != null) {
                     return false;
                  }
               } else if (!this$sellerRemark.equals(other$sellerRemark)) {
                  return false;
               }

               Object this$originalPackageId = this.getOriginalPackageId();
               Object other$originalPackageId = other.getOriginalPackageId();
               if (this$originalPackageId == null) {
                  if (other$originalPackageId != null) {
                     return false;
                  }
               } else if (!this$originalPackageId.equals(other$originalPackageId)) {
                  return false;
               }

               Object this$logistics = this.getLogistics();
               Object other$logistics = other.getLogistics();
               if (this$logistics == null) {
                  if (other$logistics != null) {
                     return false;
                  }
               } else if (!this$logistics.equals(other$logistics)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PackageSimpleDetail;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getPackageType();
         result = result * 59 + this.getPackageStatus();
         result = result * 59 + this.getPackageAfterSalesStatus();
         result = result * 59 + this.getCancelStatus();
         long $createdTime = this.getCreatedTime();
         result = result * 59 + (int)($createdTime >>> 32 ^ $createdTime);
         long $paidTime = this.getPaidTime();
         result = result * 59 + (int)($paidTime >>> 32 ^ $paidTime);
         long $updateTime = this.getUpdateTime();
         result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
         long $deliveryTime = this.getDeliveryTime();
         result = result * 59 + (int)($deliveryTime >>> 32 ^ $deliveryTime);
         long $cancelTime = this.getCancelTime();
         result = result * 59 + (int)($cancelTime >>> 32 ^ $cancelTime);
         long $finishTime = this.getFinishTime();
         result = result * 59 + (int)($finishTime >>> 32 ^ $finishTime);
         long $promiseLastDeliveryTime = this.getPromiseLastDeliveryTime();
         result = result * 59 + (int)($promiseLastDeliveryTime >>> 32 ^ $promiseLastDeliveryTime);
         result = result * 59 + this.getSellerRemarkFlag();
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         Object $planInfoId = this.getPlanInfoId();
         result = result * 59 + ($planInfoId == null ? 43 : $planInfoId.hashCode());
         Object $planInfoName = this.getPlanInfoName();
         result = result * 59 + ($planInfoName == null ? 43 : $planInfoName.hashCode());
         Object $receiverCountryId = this.getReceiverCountryId();
         result = result * 59 + ($receiverCountryId == null ? 43 : $receiverCountryId.hashCode());
         Object $receiverCountryName = this.getReceiverCountryName();
         result = result * 59 + ($receiverCountryName == null ? 43 : $receiverCountryName.hashCode());
         Object $receiverProvinceId = this.getReceiverProvinceId();
         result = result * 59 + ($receiverProvinceId == null ? 43 : $receiverProvinceId.hashCode());
         Object $receiverProvinceName = this.getReceiverProvinceName();
         result = result * 59 + ($receiverProvinceName == null ? 43 : $receiverProvinceName.hashCode());
         Object $receiverCityId = this.getReceiverCityId();
         result = result * 59 + ($receiverCityId == null ? 43 : $receiverCityId.hashCode());
         Object $receiverCityName = this.getReceiverCityName();
         result = result * 59 + ($receiverCityName == null ? 43 : $receiverCityName.hashCode());
         Object $receiverDistrictId = this.getReceiverDistrictId();
         result = result * 59 + ($receiverDistrictId == null ? 43 : $receiverDistrictId.hashCode());
         Object $receiverDistrictName = this.getReceiverDistrictName();
         result = result * 59 + ($receiverDistrictName == null ? 43 : $receiverDistrictName.hashCode());
         Object $customerRemark = this.getCustomerRemark();
         result = result * 59 + ($customerRemark == null ? 43 : $customerRemark.hashCode());
         Object $sellerRemark = this.getSellerRemark();
         result = result * 59 + ($sellerRemark == null ? 43 : $sellerRemark.hashCode());
         Object $originalPackageId = this.getOriginalPackageId();
         result = result * 59 + ($originalPackageId == null ? 43 : $originalPackageId.hashCode());
         Object $logistics = this.getLogistics();
         result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackagesListResponse.PackageSimpleDetail(packageId=" + this.getPackageId() + ", orderId=" + this.getOrderId() + ", packageType=" + this.getPackageType() + ", packageStatus=" + this.getPackageStatus() + ", packageAfterSalesStatus=" + this.getPackageAfterSalesStatus() + ", cancelStatus=" + this.getCancelStatus() + ", createdTime=" + this.getCreatedTime() + ", paidTime=" + this.getPaidTime() + ", updateTime=" + this.getUpdateTime() + ", deliveryTime=" + this.getDeliveryTime() + ", cancelTime=" + this.getCancelTime() + ", finishTime=" + this.getFinishTime() + ", promiseLastDeliveryTime=" + this.getPromiseLastDeliveryTime() + ", planInfoId=" + this.getPlanInfoId() + ", planInfoName=" + this.getPlanInfoName() + ", receiverCountryId=" + this.getReceiverCountryId() + ", receiverCountryName=" + this.getReceiverCountryName() + ", receiverProvinceId=" + this.getReceiverProvinceId() + ", receiverProvinceName=" + this.getReceiverProvinceName() + ", receiverCityId=" + this.getReceiverCityId() + ", receiverCityName=" + this.getReceiverCityName() + ", receiverDistrictId=" + this.getReceiverDistrictId() + ", receiverDistrictName=" + this.getReceiverDistrictName() + ", customerRemark=" + this.getCustomerRemark() + ", sellerRemark=" + this.getSellerRemark() + ", sellerRemarkFlag=" + this.getSellerRemarkFlag() + ", originalPackageId=" + this.getOriginalPackageId() + ", logistics=" + this.getLogistics() + ")";
      }
   }
}
