package com.xiaohongshu.fls.opensdk.entity.packages.response;

import java.util.ArrayList;
import java.util.List;

public class GetPackageDetailResponse {
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
   public long presaleDeliveryStartTime;
   public long presaleDeliveryEndTime;
   public List<PackageItemDTO> itemList = new ArrayList();
   public String originalPackageId;
   public int totalNetWeightAmount;
   public int totalPayAmount;
   public int totalShippingFree;
   public boolean unpack;
   public String expressTrackingNo;
   public String expressCompanyCode;
   public String receiverName;
   public String receiverPhone;
   public String receiverAddress;
   public BoundExtendInfoDTO boundExtendInfo = new BoundExtendInfoDTO();
   public TransferExtendInfoDTO transferExtendInfo = new TransferExtendInfoDTO();
   public String openAddressId;
   public List<SimpleDeliveryPackage> simpleDeliveryPackageList = new ArrayList();
   public String logistics;
   public int totalDepositAmount;
   public int totalMerchantDiscount;
   public int totalRedDiscount;
   public int merchantActualReceiveAmount;
   public int totalChangePriceAmount;
   public int paymentType;

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

   public long getPresaleDeliveryStartTime() {
      return this.presaleDeliveryStartTime;
   }

   public long getPresaleDeliveryEndTime() {
      return this.presaleDeliveryEndTime;
   }

   public List<PackageItemDTO> getItemList() {
      return this.itemList;
   }

   public String getOriginalPackageId() {
      return this.originalPackageId;
   }

   public int getTotalNetWeightAmount() {
      return this.totalNetWeightAmount;
   }

   public int getTotalPayAmount() {
      return this.totalPayAmount;
   }

   public int getTotalShippingFree() {
      return this.totalShippingFree;
   }

   public boolean isUnpack() {
      return this.unpack;
   }

   public String getExpressTrackingNo() {
      return this.expressTrackingNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getReceiverName() {
      return this.receiverName;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   public BoundExtendInfoDTO getBoundExtendInfo() {
      return this.boundExtendInfo;
   }

   public TransferExtendInfoDTO getTransferExtendInfo() {
      return this.transferExtendInfo;
   }

   public String getOpenAddressId() {
      return this.openAddressId;
   }

   public List<SimpleDeliveryPackage> getSimpleDeliveryPackageList() {
      return this.simpleDeliveryPackageList;
   }

   public String getLogistics() {
      return this.logistics;
   }

   public int getTotalDepositAmount() {
      return this.totalDepositAmount;
   }

   public int getTotalMerchantDiscount() {
      return this.totalMerchantDiscount;
   }

   public int getTotalRedDiscount() {
      return this.totalRedDiscount;
   }

   public int getMerchantActualReceiveAmount() {
      return this.merchantActualReceiveAmount;
   }

   public int getTotalChangePriceAmount() {
      return this.totalChangePriceAmount;
   }

   public int getPaymentType() {
      return this.paymentType;
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

   public void setPresaleDeliveryStartTime(long presaleDeliveryStartTime) {
      this.presaleDeliveryStartTime = presaleDeliveryStartTime;
   }

   public void setPresaleDeliveryEndTime(long presaleDeliveryEndTime) {
      this.presaleDeliveryEndTime = presaleDeliveryEndTime;
   }

   public void setItemList(List<PackageItemDTO> itemList) {
      this.itemList = itemList;
   }

   public void setOriginalPackageId(String originalPackageId) {
      this.originalPackageId = originalPackageId;
   }

   public void setTotalNetWeightAmount(int totalNetWeightAmount) {
      this.totalNetWeightAmount = totalNetWeightAmount;
   }

   public void setTotalPayAmount(int totalPayAmount) {
      this.totalPayAmount = totalPayAmount;
   }

   public void setTotalShippingFree(int totalShippingFree) {
      this.totalShippingFree = totalShippingFree;
   }

   public void setUnpack(boolean unpack) {
      this.unpack = unpack;
   }

   public void setExpressTrackingNo(String expressTrackingNo) {
      this.expressTrackingNo = expressTrackingNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   public void setBoundExtendInfo(BoundExtendInfoDTO boundExtendInfo) {
      this.boundExtendInfo = boundExtendInfo;
   }

   public void setTransferExtendInfo(TransferExtendInfoDTO transferExtendInfo) {
      this.transferExtendInfo = transferExtendInfo;
   }

   public void setOpenAddressId(String openAddressId) {
      this.openAddressId = openAddressId;
   }

   public void setSimpleDeliveryPackageList(List<SimpleDeliveryPackage> simpleDeliveryPackageList) {
      this.simpleDeliveryPackageList = simpleDeliveryPackageList;
   }

   public void setLogistics(String logistics) {
      this.logistics = logistics;
   }

   public void setTotalDepositAmount(int totalDepositAmount) {
      this.totalDepositAmount = totalDepositAmount;
   }

   public void setTotalMerchantDiscount(int totalMerchantDiscount) {
      this.totalMerchantDiscount = totalMerchantDiscount;
   }

   public void setTotalRedDiscount(int totalRedDiscount) {
      this.totalRedDiscount = totalRedDiscount;
   }

   public void setMerchantActualReceiveAmount(int merchantActualReceiveAmount) {
      this.merchantActualReceiveAmount = merchantActualReceiveAmount;
   }

   public void setTotalChangePriceAmount(int totalChangePriceAmount) {
      this.totalChangePriceAmount = totalChangePriceAmount;
   }

   public void setPaymentType(int paymentType) {
      this.paymentType = paymentType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetPackageDetailResponse)) {
         return false;
      } else {
         GetPackageDetailResponse other = (GetPackageDetailResponse)o;
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
         } else if (this.getPresaleDeliveryStartTime() != other.getPresaleDeliveryStartTime()) {
            return false;
         } else if (this.getPresaleDeliveryEndTime() != other.getPresaleDeliveryEndTime()) {
            return false;
         } else if (this.getTotalNetWeightAmount() != other.getTotalNetWeightAmount()) {
            return false;
         } else if (this.getTotalPayAmount() != other.getTotalPayAmount()) {
            return false;
         } else if (this.getTotalShippingFree() != other.getTotalShippingFree()) {
            return false;
         } else if (this.isUnpack() != other.isUnpack()) {
            return false;
         } else if (this.getTotalDepositAmount() != other.getTotalDepositAmount()) {
            return false;
         } else if (this.getTotalMerchantDiscount() != other.getTotalMerchantDiscount()) {
            return false;
         } else if (this.getTotalRedDiscount() != other.getTotalRedDiscount()) {
            return false;
         } else if (this.getMerchantActualReceiveAmount() != other.getMerchantActualReceiveAmount()) {
            return false;
         } else if (this.getTotalChangePriceAmount() != other.getTotalChangePriceAmount()) {
            return false;
         } else if (this.getPaymentType() != other.getPaymentType()) {
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

            Object this$itemList = this.getItemList();
            Object other$itemList = other.getItemList();
            if (this$itemList == null) {
               if (other$itemList != null) {
                  return false;
               }
            } else if (!this$itemList.equals(other$itemList)) {
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

            Object this$expressTrackingNo = this.getExpressTrackingNo();
            Object other$expressTrackingNo = other.getExpressTrackingNo();
            if (this$expressTrackingNo == null) {
               if (other$expressTrackingNo != null) {
                  return false;
               }
            } else if (!this$expressTrackingNo.equals(other$expressTrackingNo)) {
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

            Object this$receiverName = this.getReceiverName();
            Object other$receiverName = other.getReceiverName();
            if (this$receiverName == null) {
               if (other$receiverName != null) {
                  return false;
               }
            } else if (!this$receiverName.equals(other$receiverName)) {
               return false;
            }

            Object this$receiverPhone = this.getReceiverPhone();
            Object other$receiverPhone = other.getReceiverPhone();
            if (this$receiverPhone == null) {
               if (other$receiverPhone != null) {
                  return false;
               }
            } else if (!this$receiverPhone.equals(other$receiverPhone)) {
               return false;
            }

            Object this$receiverAddress = this.getReceiverAddress();
            Object other$receiverAddress = other.getReceiverAddress();
            if (this$receiverAddress == null) {
               if (other$receiverAddress != null) {
                  return false;
               }
            } else if (!this$receiverAddress.equals(other$receiverAddress)) {
               return false;
            }

            Object this$boundExtendInfo = this.getBoundExtendInfo();
            Object other$boundExtendInfo = other.getBoundExtendInfo();
            if (this$boundExtendInfo == null) {
               if (other$boundExtendInfo != null) {
                  return false;
               }
            } else if (!this$boundExtendInfo.equals(other$boundExtendInfo)) {
               return false;
            }

            Object this$transferExtendInfo = this.getTransferExtendInfo();
            Object other$transferExtendInfo = other.getTransferExtendInfo();
            if (this$transferExtendInfo == null) {
               if (other$transferExtendInfo != null) {
                  return false;
               }
            } else if (!this$transferExtendInfo.equals(other$transferExtendInfo)) {
               return false;
            }

            Object this$openAddressId = this.getOpenAddressId();
            Object other$openAddressId = other.getOpenAddressId();
            if (this$openAddressId == null) {
               if (other$openAddressId != null) {
                  return false;
               }
            } else if (!this$openAddressId.equals(other$openAddressId)) {
               return false;
            }

            Object this$simpleDeliveryPackageList = this.getSimpleDeliveryPackageList();
            Object other$simpleDeliveryPackageList = other.getSimpleDeliveryPackageList();
            if (this$simpleDeliveryPackageList == null) {
               if (other$simpleDeliveryPackageList != null) {
                  return false;
               }
            } else if (!this$simpleDeliveryPackageList.equals(other$simpleDeliveryPackageList)) {
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
      return other instanceof GetPackageDetailResponse;
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
      long $presaleDeliveryStartTime = this.getPresaleDeliveryStartTime();
      result = result * 59 + (int)($presaleDeliveryStartTime >>> 32 ^ $presaleDeliveryStartTime);
      long $presaleDeliveryEndTime = this.getPresaleDeliveryEndTime();
      result = result * 59 + (int)($presaleDeliveryEndTime >>> 32 ^ $presaleDeliveryEndTime);
      result = result * 59 + this.getTotalNetWeightAmount();
      result = result * 59 + this.getTotalPayAmount();
      result = result * 59 + this.getTotalShippingFree();
      result = result * 59 + (this.isUnpack() ? 79 : 97);
      result = result * 59 + this.getTotalDepositAmount();
      result = result * 59 + this.getTotalMerchantDiscount();
      result = result * 59 + this.getTotalRedDiscount();
      result = result * 59 + this.getMerchantActualReceiveAmount();
      result = result * 59 + this.getTotalChangePriceAmount();
      result = result * 59 + this.getPaymentType();
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
      Object $itemList = this.getItemList();
      result = result * 59 + ($itemList == null ? 43 : $itemList.hashCode());
      Object $originalPackageId = this.getOriginalPackageId();
      result = result * 59 + ($originalPackageId == null ? 43 : $originalPackageId.hashCode());
      Object $expressTrackingNo = this.getExpressTrackingNo();
      result = result * 59 + ($expressTrackingNo == null ? 43 : $expressTrackingNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $receiverName = this.getReceiverName();
      result = result * 59 + ($receiverName == null ? 43 : $receiverName.hashCode());
      Object $receiverPhone = this.getReceiverPhone();
      result = result * 59 + ($receiverPhone == null ? 43 : $receiverPhone.hashCode());
      Object $receiverAddress = this.getReceiverAddress();
      result = result * 59 + ($receiverAddress == null ? 43 : $receiverAddress.hashCode());
      Object $boundExtendInfo = this.getBoundExtendInfo();
      result = result * 59 + ($boundExtendInfo == null ? 43 : $boundExtendInfo.hashCode());
      Object $transferExtendInfo = this.getTransferExtendInfo();
      result = result * 59 + ($transferExtendInfo == null ? 43 : $transferExtendInfo.hashCode());
      Object $openAddressId = this.getOpenAddressId();
      result = result * 59 + ($openAddressId == null ? 43 : $openAddressId.hashCode());
      Object $simpleDeliveryPackageList = this.getSimpleDeliveryPackageList();
      result = result * 59 + ($simpleDeliveryPackageList == null ? 43 : $simpleDeliveryPackageList.hashCode());
      Object $logistics = this.getLogistics();
      result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
      return result;
   }

   public String toString() {
      return "GetPackageDetailResponse(packageId=" + this.getPackageId() + ", orderId=" + this.getOrderId() + ", packageType=" + this.getPackageType() + ", packageStatus=" + this.getPackageStatus() + ", packageAfterSalesStatus=" + this.getPackageAfterSalesStatus() + ", cancelStatus=" + this.getCancelStatus() + ", createdTime=" + this.getCreatedTime() + ", paidTime=" + this.getPaidTime() + ", updateTime=" + this.getUpdateTime() + ", deliveryTime=" + this.getDeliveryTime() + ", cancelTime=" + this.getCancelTime() + ", finishTime=" + this.getFinishTime() + ", promiseLastDeliveryTime=" + this.getPromiseLastDeliveryTime() + ", planInfoId=" + this.getPlanInfoId() + ", planInfoName=" + this.getPlanInfoName() + ", receiverCountryId=" + this.getReceiverCountryId() + ", receiverCountryName=" + this.getReceiverCountryName() + ", receiverProvinceId=" + this.getReceiverProvinceId() + ", receiverProvinceName=" + this.getReceiverProvinceName() + ", receiverCityId=" + this.getReceiverCityId() + ", receiverCityName=" + this.getReceiverCityName() + ", receiverDistrictId=" + this.getReceiverDistrictId() + ", receiverDistrictName=" + this.getReceiverDistrictName() + ", customerRemark=" + this.getCustomerRemark() + ", sellerRemark=" + this.getSellerRemark() + ", sellerRemarkFlag=" + this.getSellerRemarkFlag() + ", presaleDeliveryStartTime=" + this.getPresaleDeliveryStartTime() + ", presaleDeliveryEndTime=" + this.getPresaleDeliveryEndTime() + ", itemList=" + this.getItemList() + ", originalPackageId=" + this.getOriginalPackageId() + ", totalNetWeightAmount=" + this.getTotalNetWeightAmount() + ", totalPayAmount=" + this.getTotalPayAmount() + ", totalShippingFree=" + this.getTotalShippingFree() + ", unpack=" + this.isUnpack() + ", expressTrackingNo=" + this.getExpressTrackingNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", receiverAddress=" + this.getReceiverAddress() + ", boundExtendInfo=" + this.getBoundExtendInfo() + ", transferExtendInfo=" + this.getTransferExtendInfo() + ", openAddressId=" + this.getOpenAddressId() + ", simpleDeliveryPackageList=" + this.getSimpleDeliveryPackageList() + ", logistics=" + this.getLogistics() + ", totalDepositAmount=" + this.getTotalDepositAmount() + ", totalMerchantDiscount=" + this.getTotalMerchantDiscount() + ", totalRedDiscount=" + this.getTotalRedDiscount() + ", merchantActualReceiveAmount=" + this.getMerchantActualReceiveAmount() + ", totalChangePriceAmount=" + this.getTotalChangePriceAmount() + ", paymentType=" + this.getPaymentType() + ")";
   }

   public static class BoundExtendInfoDTO {
      public String payNo;
      public String payChannel;
      public double productValue;
      public double payAmount;
      public double taxAmount;
      public double shippingFee;
      public double discountAmount;
      public List<String> zoneCodes = new ArrayList();

      public String getPayNo() {
         return this.payNo;
      }

      public String getPayChannel() {
         return this.payChannel;
      }

      public double getProductValue() {
         return this.productValue;
      }

      public double getPayAmount() {
         return this.payAmount;
      }

      public double getTaxAmount() {
         return this.taxAmount;
      }

      public double getShippingFee() {
         return this.shippingFee;
      }

      public double getDiscountAmount() {
         return this.discountAmount;
      }

      public List<String> getZoneCodes() {
         return this.zoneCodes;
      }

      public void setPayNo(String payNo) {
         this.payNo = payNo;
      }

      public void setPayChannel(String payChannel) {
         this.payChannel = payChannel;
      }

      public void setProductValue(double productValue) {
         this.productValue = productValue;
      }

      public void setPayAmount(double payAmount) {
         this.payAmount = payAmount;
      }

      public void setTaxAmount(double taxAmount) {
         this.taxAmount = taxAmount;
      }

      public void setShippingFee(double shippingFee) {
         this.shippingFee = shippingFee;
      }

      public void setDiscountAmount(double discountAmount) {
         this.discountAmount = discountAmount;
      }

      public void setZoneCodes(List<String> zoneCodes) {
         this.zoneCodes = zoneCodes;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof BoundExtendInfoDTO)) {
            return false;
         } else {
            BoundExtendInfoDTO other = (BoundExtendInfoDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getProductValue(), other.getProductValue()) != 0) {
               return false;
            } else if (Double.compare(this.getPayAmount(), other.getPayAmount()) != 0) {
               return false;
            } else if (Double.compare(this.getTaxAmount(), other.getTaxAmount()) != 0) {
               return false;
            } else if (Double.compare(this.getShippingFee(), other.getShippingFee()) != 0) {
               return false;
            } else if (Double.compare(this.getDiscountAmount(), other.getDiscountAmount()) != 0) {
               return false;
            } else {
               Object this$payNo = this.getPayNo();
               Object other$payNo = other.getPayNo();
               if (this$payNo == null) {
                  if (other$payNo != null) {
                     return false;
                  }
               } else if (!this$payNo.equals(other$payNo)) {
                  return false;
               }

               Object this$payChannel = this.getPayChannel();
               Object other$payChannel = other.getPayChannel();
               if (this$payChannel == null) {
                  if (other$payChannel != null) {
                     return false;
                  }
               } else if (!this$payChannel.equals(other$payChannel)) {
                  return false;
               }

               Object this$zoneCodes = this.getZoneCodes();
               Object other$zoneCodes = other.getZoneCodes();
               if (this$zoneCodes == null) {
                  if (other$zoneCodes != null) {
                     return false;
                  }
               } else if (!this$zoneCodes.equals(other$zoneCodes)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof BoundExtendInfoDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $productValue = Double.doubleToLongBits(this.getProductValue());
         result = result * 59 + (int)($productValue >>> 32 ^ $productValue);
         long $payAmount = Double.doubleToLongBits(this.getPayAmount());
         result = result * 59 + (int)($payAmount >>> 32 ^ $payAmount);
         long $taxAmount = Double.doubleToLongBits(this.getTaxAmount());
         result = result * 59 + (int)($taxAmount >>> 32 ^ $taxAmount);
         long $shippingFee = Double.doubleToLongBits(this.getShippingFee());
         result = result * 59 + (int)($shippingFee >>> 32 ^ $shippingFee);
         long $discountAmount = Double.doubleToLongBits(this.getDiscountAmount());
         result = result * 59 + (int)($discountAmount >>> 32 ^ $discountAmount);
         Object $payNo = this.getPayNo();
         result = result * 59 + ($payNo == null ? 43 : $payNo.hashCode());
         Object $payChannel = this.getPayChannel();
         result = result * 59 + ($payChannel == null ? 43 : $payChannel.hashCode());
         Object $zoneCodes = this.getZoneCodes();
         result = result * 59 + ($zoneCodes == null ? 43 : $zoneCodes.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackageDetailResponse.BoundExtendInfoDTO(payNo=" + this.getPayNo() + ", payChannel=" + this.getPayChannel() + ", productValue=" + this.getProductValue() + ", payAmount=" + this.getPayAmount() + ", taxAmount=" + this.getTaxAmount() + ", shippingFee=" + this.getShippingFee() + ", discountAmount=" + this.getDiscountAmount() + ", zoneCodes=" + this.getZoneCodes() + ")";
      }
   }

   public static class TransferExtendInfoDTO {
      public String internationalExpressNo;
      public double orderDeclaredAmount;
      public String paintMarker;
      public String collectionPlace;
      public String threeSegmentCode;

      public String getInternationalExpressNo() {
         return this.internationalExpressNo;
      }

      public double getOrderDeclaredAmount() {
         return this.orderDeclaredAmount;
      }

      public String getPaintMarker() {
         return this.paintMarker;
      }

      public String getCollectionPlace() {
         return this.collectionPlace;
      }

      public String getThreeSegmentCode() {
         return this.threeSegmentCode;
      }

      public void setInternationalExpressNo(String internationalExpressNo) {
         this.internationalExpressNo = internationalExpressNo;
      }

      public void setOrderDeclaredAmount(double orderDeclaredAmount) {
         this.orderDeclaredAmount = orderDeclaredAmount;
      }

      public void setPaintMarker(String paintMarker) {
         this.paintMarker = paintMarker;
      }

      public void setCollectionPlace(String collectionPlace) {
         this.collectionPlace = collectionPlace;
      }

      public void setThreeSegmentCode(String threeSegmentCode) {
         this.threeSegmentCode = threeSegmentCode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof TransferExtendInfoDTO)) {
            return false;
         } else {
            TransferExtendInfoDTO other = (TransferExtendInfoDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getOrderDeclaredAmount(), other.getOrderDeclaredAmount()) != 0) {
               return false;
            } else {
               Object this$internationalExpressNo = this.getInternationalExpressNo();
               Object other$internationalExpressNo = other.getInternationalExpressNo();
               if (this$internationalExpressNo == null) {
                  if (other$internationalExpressNo != null) {
                     return false;
                  }
               } else if (!this$internationalExpressNo.equals(other$internationalExpressNo)) {
                  return false;
               }

               Object this$paintMarker = this.getPaintMarker();
               Object other$paintMarker = other.getPaintMarker();
               if (this$paintMarker == null) {
                  if (other$paintMarker != null) {
                     return false;
                  }
               } else if (!this$paintMarker.equals(other$paintMarker)) {
                  return false;
               }

               Object this$collectionPlace = this.getCollectionPlace();
               Object other$collectionPlace = other.getCollectionPlace();
               if (this$collectionPlace == null) {
                  if (other$collectionPlace != null) {
                     return false;
                  }
               } else if (!this$collectionPlace.equals(other$collectionPlace)) {
                  return false;
               }

               Object this$threeSegmentCode = this.getThreeSegmentCode();
               Object other$threeSegmentCode = other.getThreeSegmentCode();
               if (this$threeSegmentCode == null) {
                  if (other$threeSegmentCode != null) {
                     return false;
                  }
               } else if (!this$threeSegmentCode.equals(other$threeSegmentCode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof TransferExtendInfoDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $orderDeclaredAmount = Double.doubleToLongBits(this.getOrderDeclaredAmount());
         result = result * 59 + (int)($orderDeclaredAmount >>> 32 ^ $orderDeclaredAmount);
         Object $internationalExpressNo = this.getInternationalExpressNo();
         result = result * 59 + ($internationalExpressNo == null ? 43 : $internationalExpressNo.hashCode());
         Object $paintMarker = this.getPaintMarker();
         result = result * 59 + ($paintMarker == null ? 43 : $paintMarker.hashCode());
         Object $collectionPlace = this.getCollectionPlace();
         result = result * 59 + ($collectionPlace == null ? 43 : $collectionPlace.hashCode());
         Object $threeSegmentCode = this.getThreeSegmentCode();
         result = result * 59 + ($threeSegmentCode == null ? 43 : $threeSegmentCode.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackageDetailResponse.TransferExtendInfoDTO(internationalExpressNo=" + this.getInternationalExpressNo() + ", orderDeclaredAmount=" + this.getOrderDeclaredAmount() + ", paintMarker=" + this.getPaintMarker() + ", collectionPlace=" + this.getCollectionPlace() + ", threeSegmentCode=" + this.getThreeSegmentCode() + ")";
      }
   }

   public static class PackageItemDTO {
      public String itemId;
      public String itemName;
      public String erpcode;
      public String itemSpec;
      public String itemImage;
      public int itemQuantity;
      public List<PackageSkuDTO> skuList = new ArrayList();
      public long totalPaidAmount;
      public long totalMerchantDiscount;
      public long totalRedDiscount;
      public long totalTaxAmount;
      public long totalNetWeight;
      public int itemTag;
      public boolean isChannel;
      public int deliveryMode;

      public String getItemId() {
         return this.itemId;
      }

      public String getItemName() {
         return this.itemName;
      }

      public String getErpcode() {
         return this.erpcode;
      }

      public String getItemSpec() {
         return this.itemSpec;
      }

      public String getItemImage() {
         return this.itemImage;
      }

      public int getItemQuantity() {
         return this.itemQuantity;
      }

      public List<PackageSkuDTO> getSkuList() {
         return this.skuList;
      }

      public long getTotalPaidAmount() {
         return this.totalPaidAmount;
      }

      public long getTotalMerchantDiscount() {
         return this.totalMerchantDiscount;
      }

      public long getTotalRedDiscount() {
         return this.totalRedDiscount;
      }

      public long getTotalTaxAmount() {
         return this.totalTaxAmount;
      }

      public long getTotalNetWeight() {
         return this.totalNetWeight;
      }

      public int getItemTag() {
         return this.itemTag;
      }

      public boolean isChannel() {
         return this.isChannel;
      }

      public int getDeliveryMode() {
         return this.deliveryMode;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setItemName(String itemName) {
         this.itemName = itemName;
      }

      public void setErpcode(String erpcode) {
         this.erpcode = erpcode;
      }

      public void setItemSpec(String itemSpec) {
         this.itemSpec = itemSpec;
      }

      public void setItemImage(String itemImage) {
         this.itemImage = itemImage;
      }

      public void setItemQuantity(int itemQuantity) {
         this.itemQuantity = itemQuantity;
      }

      public void setSkuList(List<PackageSkuDTO> skuList) {
         this.skuList = skuList;
      }

      public void setTotalPaidAmount(long totalPaidAmount) {
         this.totalPaidAmount = totalPaidAmount;
      }

      public void setTotalMerchantDiscount(long totalMerchantDiscount) {
         this.totalMerchantDiscount = totalMerchantDiscount;
      }

      public void setTotalRedDiscount(long totalRedDiscount) {
         this.totalRedDiscount = totalRedDiscount;
      }

      public void setTotalTaxAmount(long totalTaxAmount) {
         this.totalTaxAmount = totalTaxAmount;
      }

      public void setTotalNetWeight(long totalNetWeight) {
         this.totalNetWeight = totalNetWeight;
      }

      public void setItemTag(int itemTag) {
         this.itemTag = itemTag;
      }

      public void setChannel(boolean isChannel) {
         this.isChannel = isChannel;
      }

      public void setDeliveryMode(int deliveryMode) {
         this.deliveryMode = deliveryMode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PackageItemDTO)) {
            return false;
         } else {
            PackageItemDTO other = (PackageItemDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getItemQuantity() != other.getItemQuantity()) {
               return false;
            } else if (this.getTotalPaidAmount() != other.getTotalPaidAmount()) {
               return false;
            } else if (this.getTotalMerchantDiscount() != other.getTotalMerchantDiscount()) {
               return false;
            } else if (this.getTotalRedDiscount() != other.getTotalRedDiscount()) {
               return false;
            } else if (this.getTotalTaxAmount() != other.getTotalTaxAmount()) {
               return false;
            } else if (this.getTotalNetWeight() != other.getTotalNetWeight()) {
               return false;
            } else if (this.getItemTag() != other.getItemTag()) {
               return false;
            } else if (this.isChannel() != other.isChannel()) {
               return false;
            } else if (this.getDeliveryMode() != other.getDeliveryMode()) {
               return false;
            } else {
               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               Object this$itemName = this.getItemName();
               Object other$itemName = other.getItemName();
               if (this$itemName == null) {
                  if (other$itemName != null) {
                     return false;
                  }
               } else if (!this$itemName.equals(other$itemName)) {
                  return false;
               }

               Object this$erpcode = this.getErpcode();
               Object other$erpcode = other.getErpcode();
               if (this$erpcode == null) {
                  if (other$erpcode != null) {
                     return false;
                  }
               } else if (!this$erpcode.equals(other$erpcode)) {
                  return false;
               }

               Object this$itemSpec = this.getItemSpec();
               Object other$itemSpec = other.getItemSpec();
               if (this$itemSpec == null) {
                  if (other$itemSpec != null) {
                     return false;
                  }
               } else if (!this$itemSpec.equals(other$itemSpec)) {
                  return false;
               }

               Object this$itemImage = this.getItemImage();
               Object other$itemImage = other.getItemImage();
               if (this$itemImage == null) {
                  if (other$itemImage != null) {
                     return false;
                  }
               } else if (!this$itemImage.equals(other$itemImage)) {
                  return false;
               }

               Object this$skuList = this.getSkuList();
               Object other$skuList = other.getSkuList();
               if (this$skuList == null) {
                  if (other$skuList != null) {
                     return false;
                  }
               } else if (!this$skuList.equals(other$skuList)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PackageItemDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getItemQuantity();
         long $totalPaidAmount = this.getTotalPaidAmount();
         result = result * 59 + (int)($totalPaidAmount >>> 32 ^ $totalPaidAmount);
         long $totalMerchantDiscount = this.getTotalMerchantDiscount();
         result = result * 59 + (int)($totalMerchantDiscount >>> 32 ^ $totalMerchantDiscount);
         long $totalRedDiscount = this.getTotalRedDiscount();
         result = result * 59 + (int)($totalRedDiscount >>> 32 ^ $totalRedDiscount);
         long $totalTaxAmount = this.getTotalTaxAmount();
         result = result * 59 + (int)($totalTaxAmount >>> 32 ^ $totalTaxAmount);
         long $totalNetWeight = this.getTotalNetWeight();
         result = result * 59 + (int)($totalNetWeight >>> 32 ^ $totalNetWeight);
         result = result * 59 + this.getItemTag();
         result = result * 59 + (this.isChannel() ? 79 : 97);
         result = result * 59 + this.getDeliveryMode();
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         Object $itemName = this.getItemName();
         result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
         Object $erpcode = this.getErpcode();
         result = result * 59 + ($erpcode == null ? 43 : $erpcode.hashCode());
         Object $itemSpec = this.getItemSpec();
         result = result * 59 + ($itemSpec == null ? 43 : $itemSpec.hashCode());
         Object $itemImage = this.getItemImage();
         result = result * 59 + ($itemImage == null ? 43 : $itemImage.hashCode());
         Object $skuList = this.getSkuList();
         result = result * 59 + ($skuList == null ? 43 : $skuList.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackageDetailResponse.PackageItemDTO(itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", erpcode=" + this.getErpcode() + ", itemSpec=" + this.getItemSpec() + ", itemImage=" + this.getItemImage() + ", itemQuantity=" + this.getItemQuantity() + ", skuList=" + this.getSkuList() + ", totalPaidAmount=" + this.getTotalPaidAmount() + ", totalMerchantDiscount=" + this.getTotalMerchantDiscount() + ", totalRedDiscount=" + this.getTotalRedDiscount() + ", totalTaxAmount=" + this.getTotalTaxAmount() + ", totalNetWeight=" + this.getTotalNetWeight() + ", itemTag=" + this.getItemTag() + ", isChannel=" + this.isChannel() + ", deliveryMode=" + this.getDeliveryMode() + ")";
      }
   }

   public static class PackageSkuDTO {
      public String itemId;
      public String erpCode;
      public String barcode;
      public String skuCode;
      public int quantity;
      public String registerName;
      public String itemName;
      public long pricePerSku;
      public long taxPerSku;
      public long paidAmountPerSku;
      public long depositAmountPerSku;
      public long merchantDiscountPerSku;
      public long redDiscountPerSku;
      public long rawPricePerSku;

      public String getItemId() {
         return this.itemId;
      }

      public String getErpCode() {
         return this.erpCode;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public String getSkuCode() {
         return this.skuCode;
      }

      public int getQuantity() {
         return this.quantity;
      }

      public String getRegisterName() {
         return this.registerName;
      }

      public String getItemName() {
         return this.itemName;
      }

      public long getPricePerSku() {
         return this.pricePerSku;
      }

      public long getTaxPerSku() {
         return this.taxPerSku;
      }

      public long getPaidAmountPerSku() {
         return this.paidAmountPerSku;
      }

      public long getDepositAmountPerSku() {
         return this.depositAmountPerSku;
      }

      public long getMerchantDiscountPerSku() {
         return this.merchantDiscountPerSku;
      }

      public long getRedDiscountPerSku() {
         return this.redDiscountPerSku;
      }

      public long getRawPricePerSku() {
         return this.rawPricePerSku;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setErpCode(String erpCode) {
         this.erpCode = erpCode;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setSkuCode(String skuCode) {
         this.skuCode = skuCode;
      }

      public void setQuantity(int quantity) {
         this.quantity = quantity;
      }

      public void setRegisterName(String registerName) {
         this.registerName = registerName;
      }

      public void setItemName(String itemName) {
         this.itemName = itemName;
      }

      public void setPricePerSku(long pricePerSku) {
         this.pricePerSku = pricePerSku;
      }

      public void setTaxPerSku(long taxPerSku) {
         this.taxPerSku = taxPerSku;
      }

      public void setPaidAmountPerSku(long paidAmountPerSku) {
         this.paidAmountPerSku = paidAmountPerSku;
      }

      public void setDepositAmountPerSku(long depositAmountPerSku) {
         this.depositAmountPerSku = depositAmountPerSku;
      }

      public void setMerchantDiscountPerSku(long merchantDiscountPerSku) {
         this.merchantDiscountPerSku = merchantDiscountPerSku;
      }

      public void setRedDiscountPerSku(long redDiscountPerSku) {
         this.redDiscountPerSku = redDiscountPerSku;
      }

      public void setRawPricePerSku(long rawPricePerSku) {
         this.rawPricePerSku = rawPricePerSku;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PackageSkuDTO)) {
            return false;
         } else {
            PackageSkuDTO other = (PackageSkuDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getQuantity() != other.getQuantity()) {
               return false;
            } else if (this.getPricePerSku() != other.getPricePerSku()) {
               return false;
            } else if (this.getTaxPerSku() != other.getTaxPerSku()) {
               return false;
            } else if (this.getPaidAmountPerSku() != other.getPaidAmountPerSku()) {
               return false;
            } else if (this.getDepositAmountPerSku() != other.getDepositAmountPerSku()) {
               return false;
            } else if (this.getMerchantDiscountPerSku() != other.getMerchantDiscountPerSku()) {
               return false;
            } else if (this.getRedDiscountPerSku() != other.getRedDiscountPerSku()) {
               return false;
            } else if (this.getRawPricePerSku() != other.getRawPricePerSku()) {
               return false;
            } else {
               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               Object this$erpCode = this.getErpCode();
               Object other$erpCode = other.getErpCode();
               if (this$erpCode == null) {
                  if (other$erpCode != null) {
                     return false;
                  }
               } else if (!this$erpCode.equals(other$erpCode)) {
                  return false;
               }

               Object this$barcode = this.getBarcode();
               Object other$barcode = other.getBarcode();
               if (this$barcode == null) {
                  if (other$barcode != null) {
                     return false;
                  }
               } else if (!this$barcode.equals(other$barcode)) {
                  return false;
               }

               Object this$skuCode = this.getSkuCode();
               Object other$skuCode = other.getSkuCode();
               if (this$skuCode == null) {
                  if (other$skuCode != null) {
                     return false;
                  }
               } else if (!this$skuCode.equals(other$skuCode)) {
                  return false;
               }

               Object this$registerName = this.getRegisterName();
               Object other$registerName = other.getRegisterName();
               if (this$registerName == null) {
                  if (other$registerName != null) {
                     return false;
                  }
               } else if (!this$registerName.equals(other$registerName)) {
                  return false;
               }

               Object this$itemName = this.getItemName();
               Object other$itemName = other.getItemName();
               if (this$itemName == null) {
                  if (other$itemName != null) {
                     return false;
                  }
               } else if (!this$itemName.equals(other$itemName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PackageSkuDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getQuantity();
         long $pricePerSku = this.getPricePerSku();
         result = result * 59 + (int)($pricePerSku >>> 32 ^ $pricePerSku);
         long $taxPerSku = this.getTaxPerSku();
         result = result * 59 + (int)($taxPerSku >>> 32 ^ $taxPerSku);
         long $paidAmountPerSku = this.getPaidAmountPerSku();
         result = result * 59 + (int)($paidAmountPerSku >>> 32 ^ $paidAmountPerSku);
         long $depositAmountPerSku = this.getDepositAmountPerSku();
         result = result * 59 + (int)($depositAmountPerSku >>> 32 ^ $depositAmountPerSku);
         long $merchantDiscountPerSku = this.getMerchantDiscountPerSku();
         result = result * 59 + (int)($merchantDiscountPerSku >>> 32 ^ $merchantDiscountPerSku);
         long $redDiscountPerSku = this.getRedDiscountPerSku();
         result = result * 59 + (int)($redDiscountPerSku >>> 32 ^ $redDiscountPerSku);
         long $rawPricePerSku = this.getRawPricePerSku();
         result = result * 59 + (int)($rawPricePerSku >>> 32 ^ $rawPricePerSku);
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         Object $erpCode = this.getErpCode();
         result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
         Object $barcode = this.getBarcode();
         result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
         Object $skuCode = this.getSkuCode();
         result = result * 59 + ($skuCode == null ? 43 : $skuCode.hashCode());
         Object $registerName = this.getRegisterName();
         result = result * 59 + ($registerName == null ? 43 : $registerName.hashCode());
         Object $itemName = this.getItemName();
         result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackageDetailResponse.PackageSkuDTO(itemId=" + this.getItemId() + ", erpCode=" + this.getErpCode() + ", barcode=" + this.getBarcode() + ", skuCode=" + this.getSkuCode() + ", quantity=" + this.getQuantity() + ", registerName=" + this.getRegisterName() + ", itemName=" + this.getItemName() + ", pricePerSku=" + this.getPricePerSku() + ", taxPerSku=" + this.getTaxPerSku() + ", paidAmountPerSku=" + this.getPaidAmountPerSku() + ", depositAmountPerSku=" + this.getDepositAmountPerSku() + ", merchantDiscountPerSku=" + this.getMerchantDiscountPerSku() + ", redDiscountPerSku=" + this.getRedDiscountPerSku() + ", rawPricePerSku=" + this.getRawPricePerSku() + ")";
      }
   }

   public static class SimpleDeliveryPackage {
      public int deliveryPackageIndex;
      public int status;
      public String expressTrackingNo;
      public String expressCompanyCode;
      public List<String> itemIdList;

      public int getDeliveryPackageIndex() {
         return this.deliveryPackageIndex;
      }

      public int getStatus() {
         return this.status;
      }

      public String getExpressTrackingNo() {
         return this.expressTrackingNo;
      }

      public String getExpressCompanyCode() {
         return this.expressCompanyCode;
      }

      public List<String> getItemIdList() {
         return this.itemIdList;
      }

      public void setDeliveryPackageIndex(int deliveryPackageIndex) {
         this.deliveryPackageIndex = deliveryPackageIndex;
      }

      public void setStatus(int status) {
         this.status = status;
      }

      public void setExpressTrackingNo(String expressTrackingNo) {
         this.expressTrackingNo = expressTrackingNo;
      }

      public void setExpressCompanyCode(String expressCompanyCode) {
         this.expressCompanyCode = expressCompanyCode;
      }

      public void setItemIdList(List<String> itemIdList) {
         this.itemIdList = itemIdList;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SimpleDeliveryPackage)) {
            return false;
         } else {
            SimpleDeliveryPackage other = (SimpleDeliveryPackage)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getDeliveryPackageIndex() != other.getDeliveryPackageIndex()) {
               return false;
            } else if (this.getStatus() != other.getStatus()) {
               return false;
            } else {
               Object this$expressTrackingNo = this.getExpressTrackingNo();
               Object other$expressTrackingNo = other.getExpressTrackingNo();
               if (this$expressTrackingNo == null) {
                  if (other$expressTrackingNo != null) {
                     return false;
                  }
               } else if (!this$expressTrackingNo.equals(other$expressTrackingNo)) {
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

               Object this$itemIdList = this.getItemIdList();
               Object other$itemIdList = other.getItemIdList();
               if (this$itemIdList == null) {
                  if (other$itemIdList != null) {
                     return false;
                  }
               } else if (!this$itemIdList.equals(other$itemIdList)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SimpleDeliveryPackage;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getDeliveryPackageIndex();
         result = result * 59 + this.getStatus();
         Object $expressTrackingNo = this.getExpressTrackingNo();
         result = result * 59 + ($expressTrackingNo == null ? 43 : $expressTrackingNo.hashCode());
         Object $expressCompanyCode = this.getExpressCompanyCode();
         result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
         Object $itemIdList = this.getItemIdList();
         result = result * 59 + ($itemIdList == null ? 43 : $itemIdList.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackageDetailResponse.SimpleDeliveryPackage(deliveryPackageIndex=" + this.getDeliveryPackageIndex() + ", status=" + this.getStatus() + ", expressTrackingNo=" + this.getExpressTrackingNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", itemIdList=" + this.getItemIdList() + ")";
      }
   }
}
