package com.xiaohongshu.fls.opensdk.entity.order.Response;

import com.xiaohongshu.fls.opensdk.entity.order.SkuIdentifyCodeInfo;
import java.util.ArrayList;
import java.util.List;

public class GetOrderDetailResponse {
   public String orderId;
   public int orderType;
   public int orderStatus;
   public int orderAfterSalesStatus;
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
   public List<OrderSkuDTOV3> skuList = new ArrayList();
   public String originalOrderId;
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
   public List<SimpleDeliveryOrder> simpleDeliveryOrderList = new ArrayList();
   public String logistics;
   public int totalDepositAmount;
   public int totalMerchantDiscount;
   public int totalRedDiscount;
   public int merchantActualReceiveAmount;
   public int totalChangePriceAmount;
   public int paymentType;
   public String shopId;
   public String shopName;
   public String whcode;
   public String userId;
   public List<String> orderTagList;
   public int logisticsMode;
   public String customsCode;
   public String outPromotionAmount;
   public String outTradeNo;
   public String subsidySupplierId;
   public String subsidySupplierName;
   public OrderReceiverInfo orderReceiverInfo;

   public OrderReceiverInfo getOrderReceiverInfo() {
      return this.orderReceiverInfo;
   }

   public void setOrderReceiverInfo(OrderReceiverInfo orderReceiverInfo) {
      this.orderReceiverInfo = orderReceiverInfo;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public int getOrderType() {
      return this.orderType;
   }

   public int getOrderStatus() {
      return this.orderStatus;
   }

   public int getOrderAfterSalesStatus() {
      return this.orderAfterSalesStatus;
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

   public List<OrderSkuDTOV3> getSkuList() {
      return this.skuList;
   }

   public String getOriginalOrderId() {
      return this.originalOrderId;
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

   public List<SimpleDeliveryOrder> getSimpleDeliveryOrderList() {
      return this.simpleDeliveryOrderList;
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

   public String getShopId() {
      return this.shopId;
   }

   public String getShopName() {
      return this.shopName;
   }

   public String getWhcode() {
      return this.whcode;
   }

   public String getUserId() {
      return this.userId;
   }

   public List<String> getOrderTagList() {
      return this.orderTagList;
   }

   public int getLogisticsMode() {
      return this.logisticsMode;
   }

   public String getCustomsCode() {
      return this.customsCode;
   }

   public String getOutPromotionAmount() {
      return this.outPromotionAmount;
   }

   public String getOutTradeNo() {
      return this.outTradeNo;
   }

   public String getSubsidySupplierId() {
      return this.subsidySupplierId;
   }

   public String getSubsidySupplierName() {
      return this.subsidySupplierName;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setOrderType(int orderType) {
      this.orderType = orderType;
   }

   public void setOrderStatus(int orderStatus) {
      this.orderStatus = orderStatus;
   }

   public void setOrderAfterSalesStatus(int orderAfterSalesStatus) {
      this.orderAfterSalesStatus = orderAfterSalesStatus;
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

   public void setSkuList(List<OrderSkuDTOV3> skuList) {
      this.skuList = skuList;
   }

   public void setOriginalOrderId(String originalOrderId) {
      this.originalOrderId = originalOrderId;
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

   public void setSimpleDeliveryOrderList(List<SimpleDeliveryOrder> simpleDeliveryOrderList) {
      this.simpleDeliveryOrderList = simpleDeliveryOrderList;
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

   public void setShopId(String shopId) {
      this.shopId = shopId;
   }

   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   public void setWhcode(String whcode) {
      this.whcode = whcode;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public void setOrderTagList(List<String> orderTagList) {
      this.orderTagList = orderTagList;
   }

   public void setLogisticsMode(int logisticsMode) {
      this.logisticsMode = logisticsMode;
   }

   public void setCustomsCode(String customsCode) {
      this.customsCode = customsCode;
   }

   public void setOutPromotionAmount(String outPromotionAmount) {
      this.outPromotionAmount = outPromotionAmount;
   }

   public void setOutTradeNo(String outTradeNo) {
      this.outTradeNo = outTradeNo;
   }

   public void setSubsidySupplierId(String subsidySupplierId) {
      this.subsidySupplierId = subsidySupplierId;
   }

   public void setSubsidySupplierName(String subsidySupplierName) {
      this.subsidySupplierName = subsidySupplierName;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetOrderDetailResponse)) {
         return false;
      } else {
         GetOrderDetailResponse other = (GetOrderDetailResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getOrderType() != other.getOrderType()) {
            return false;
         } else if (this.getOrderStatus() != other.getOrderStatus()) {
            return false;
         } else if (this.getOrderAfterSalesStatus() != other.getOrderAfterSalesStatus()) {
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
         } else if (this.getLogisticsMode() != other.getLogisticsMode()) {
            return false;
         } else {
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

            Object this$skuList = this.getSkuList();
            Object other$skuList = other.getSkuList();
            if (this$skuList == null) {
               if (other$skuList != null) {
                  return false;
               }
            } else if (!this$skuList.equals(other$skuList)) {
               return false;
            }

            Object this$originalOrderId = this.getOriginalOrderId();
            Object other$originalOrderId = other.getOriginalOrderId();
            if (this$originalOrderId == null) {
               if (other$originalOrderId != null) {
                  return false;
               }
            } else if (!this$originalOrderId.equals(other$originalOrderId)) {
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

            Object this$simpleDeliveryOrderList = this.getSimpleDeliveryOrderList();
            Object other$simpleDeliveryOrderList = other.getSimpleDeliveryOrderList();
            if (this$simpleDeliveryOrderList == null) {
               if (other$simpleDeliveryOrderList != null) {
                  return false;
               }
            } else if (!this$simpleDeliveryOrderList.equals(other$simpleDeliveryOrderList)) {
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

            Object this$shopId = this.getShopId();
            Object other$shopId = other.getShopId();
            if (this$shopId == null) {
               if (other$shopId != null) {
                  return false;
               }
            } else if (!this$shopId.equals(other$shopId)) {
               return false;
            }

            Object this$shopName = this.getShopName();
            Object other$shopName = other.getShopName();
            if (this$shopName == null) {
               if (other$shopName != null) {
                  return false;
               }
            } else if (!this$shopName.equals(other$shopName)) {
               return false;
            }

            Object this$whcode = this.getWhcode();
            Object other$whcode = other.getWhcode();
            if (this$whcode == null) {
               if (other$whcode != null) {
                  return false;
               }
            } else if (!this$whcode.equals(other$whcode)) {
               return false;
            }

            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null) {
               if (other$userId != null) {
                  return false;
               }
            } else if (!this$userId.equals(other$userId)) {
               return false;
            }

            Object this$orderTagList = this.getOrderTagList();
            Object other$orderTagList = other.getOrderTagList();
            if (this$orderTagList == null) {
               if (other$orderTagList != null) {
                  return false;
               }
            } else if (!this$orderTagList.equals(other$orderTagList)) {
               return false;
            }

            Object this$customsCode = this.getCustomsCode();
            Object other$customsCode = other.getCustomsCode();
            if (this$customsCode == null) {
               if (other$customsCode != null) {
                  return false;
               }
            } else if (!this$customsCode.equals(other$customsCode)) {
               return false;
            }

            Object this$outPromotionAmount = this.getOutPromotionAmount();
            Object other$outPromotionAmount = other.getOutPromotionAmount();
            if (this$outPromotionAmount == null) {
               if (other$outPromotionAmount != null) {
                  return false;
               }
            } else if (!this$outPromotionAmount.equals(other$outPromotionAmount)) {
               return false;
            }

            Object this$outTradeNo = this.getOutTradeNo();
            Object other$outTradeNo = other.getOutTradeNo();
            if (this$outTradeNo == null) {
               if (other$outTradeNo != null) {
                  return false;
               }
            } else if (!this$outTradeNo.equals(other$outTradeNo)) {
               return false;
            }

            Object this$subsidySupplierId = this.getSubsidySupplierId();
            Object other$subsidySupplierId = other.getSubsidySupplierId();
            if (this$subsidySupplierId == null) {
               if (other$subsidySupplierId != null) {
                  return false;
               }
            } else if (!this$subsidySupplierId.equals(other$subsidySupplierId)) {
               return false;
            }

            Object this$subsidySupplierName = this.getSubsidySupplierName();
            Object other$subsidySupplierName = other.getSubsidySupplierName();
            if (this$subsidySupplierName == null) {
               if (other$subsidySupplierName != null) {
                  return false;
               }
            } else if (!this$subsidySupplierName.equals(other$subsidySupplierName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetOrderDetailResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getOrderType();
      result = result * 59 + this.getOrderStatus();
      result = result * 59 + this.getOrderAfterSalesStatus();
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
      result = result * 59 + this.getLogisticsMode();
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
      Object $skuList = this.getSkuList();
      result = result * 59 + ($skuList == null ? 43 : $skuList.hashCode());
      Object $originalOrderId = this.getOriginalOrderId();
      result = result * 59 + ($originalOrderId == null ? 43 : $originalOrderId.hashCode());
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
      Object $simpleDeliveryOrderList = this.getSimpleDeliveryOrderList();
      result = result * 59 + ($simpleDeliveryOrderList == null ? 43 : $simpleDeliveryOrderList.hashCode());
      Object $logistics = this.getLogistics();
      result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
      Object $shopId = this.getShopId();
      result = result * 59 + ($shopId == null ? 43 : $shopId.hashCode());
      Object $shopName = this.getShopName();
      result = result * 59 + ($shopName == null ? 43 : $shopName.hashCode());
      Object $whcode = this.getWhcode();
      result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $orderTagList = this.getOrderTagList();
      result = result * 59 + ($orderTagList == null ? 43 : $orderTagList.hashCode());
      Object $customsCode = this.getCustomsCode();
      result = result * 59 + ($customsCode == null ? 43 : $customsCode.hashCode());
      Object $outPromotionAmount = this.getOutPromotionAmount();
      result = result * 59 + ($outPromotionAmount == null ? 43 : $outPromotionAmount.hashCode());
      Object $outTradeNo = this.getOutTradeNo();
      result = result * 59 + ($outTradeNo == null ? 43 : $outTradeNo.hashCode());
      Object $subsidySupplierId = this.getSubsidySupplierId();
      result = result * 59 + ($subsidySupplierId == null ? 43 : $subsidySupplierId.hashCode());
      Object $subsidySupplierName = this.getSubsidySupplierName();
      result = result * 59 + ($subsidySupplierName == null ? 43 : $subsidySupplierName.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderDetailResponse(orderId=" + this.getOrderId() + ", orderType=" + this.getOrderType() + ", orderStatus=" + this.getOrderStatus() + ", orderAfterSalesStatus=" + this.getOrderAfterSalesStatus() + ", cancelStatus=" + this.getCancelStatus() + ", createdTime=" + this.getCreatedTime() + ", paidTime=" + this.getPaidTime() + ", updateTime=" + this.getUpdateTime() + ", deliveryTime=" + this.getDeliveryTime() + ", cancelTime=" + this.getCancelTime() + ", finishTime=" + this.getFinishTime() + ", promiseLastDeliveryTime=" + this.getPromiseLastDeliveryTime() + ", planInfoId=" + this.getPlanInfoId() + ", planInfoName=" + this.getPlanInfoName() + ", receiverCountryId=" + this.getReceiverCountryId() + ", receiverCountryName=" + this.getReceiverCountryName() + ", receiverProvinceId=" + this.getReceiverProvinceId() + ", receiverProvinceName=" + this.getReceiverProvinceName() + ", receiverCityId=" + this.getReceiverCityId() + ", receiverCityName=" + this.getReceiverCityName() + ", receiverDistrictId=" + this.getReceiverDistrictId() + ", receiverDistrictName=" + this.getReceiverDistrictName() + ", customerRemark=" + this.getCustomerRemark() + ", sellerRemark=" + this.getSellerRemark() + ", sellerRemarkFlag=" + this.getSellerRemarkFlag() + ", presaleDeliveryStartTime=" + this.getPresaleDeliveryStartTime() + ", presaleDeliveryEndTime=" + this.getPresaleDeliveryEndTime() + ", skuList=" + this.getSkuList() + ", originalOrderId=" + this.getOriginalOrderId() + ", totalNetWeightAmount=" + this.getTotalNetWeightAmount() + ", totalPayAmount=" + this.getTotalPayAmount() + ", totalShippingFree=" + this.getTotalShippingFree() + ", unpack=" + this.isUnpack() + ", expressTrackingNo=" + this.getExpressTrackingNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", receiverAddress=" + this.getReceiverAddress() + ", boundExtendInfo=" + this.getBoundExtendInfo() + ", transferExtendInfo=" + this.getTransferExtendInfo() + ", openAddressId=" + this.getOpenAddressId() + ", simpleDeliveryOrderList=" + this.getSimpleDeliveryOrderList() + ", logistics=" + this.getLogistics() + ", totalDepositAmount=" + this.getTotalDepositAmount() + ", totalMerchantDiscount=" + this.getTotalMerchantDiscount() + ", totalRedDiscount=" + this.getTotalRedDiscount() + ", merchantActualReceiveAmount=" + this.getMerchantActualReceiveAmount() + ", totalChangePriceAmount=" + this.getTotalChangePriceAmount() + ", paymentType=" + this.getPaymentType() + ", shopId=" + this.getShopId() + ", shopName=" + this.getShopName() + ", whcode=" + this.getWhcode() + ", userId=" + this.getUserId() + ", orderTagList=" + this.getOrderTagList() + ", logisticsMode=" + this.getLogisticsMode() + ", customsCode=" + this.getCustomsCode() + ", outPromotionAmount=" + this.getOutPromotionAmount() + ", outTradeNo=" + this.getOutTradeNo() + ", subsidySupplierId=" + this.getSubsidySupplierId() + ", subsidySupplierName=" + this.getSubsidySupplierName() + ")";
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
         return "GetOrderDetailResponse.BoundExtendInfoDTO(payNo=" + this.getPayNo() + ", payChannel=" + this.getPayChannel() + ", productValue=" + this.getProductValue() + ", payAmount=" + this.getPayAmount() + ", taxAmount=" + this.getTaxAmount() + ", shippingFee=" + this.getShippingFee() + ", discountAmount=" + this.getDiscountAmount() + ", zoneCodes=" + this.getZoneCodes() + ")";
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
         return "GetOrderDetailResponse.TransferExtendInfoDTO(internationalExpressNo=" + this.getInternationalExpressNo() + ", orderDeclaredAmount=" + this.getOrderDeclaredAmount() + ", paintMarker=" + this.getPaintMarker() + ", collectionPlace=" + this.getCollectionPlace() + ", threeSegmentCode=" + this.getThreeSegmentCode() + ")";
      }
   }

   public static class OrderSkuDTOV3 {
      public String skuId;
      public String skuName;
      public String erpcode;
      public String skuSpec;
      public String skuImage;
      public int skuQuantity;
      public List<OrderSkuDetailDTO> skuDetailList = new ArrayList();
      public long totalPaidAmount;
      public long totalMerchantDiscount;
      public long totalRedDiscount;
      public long totalTaxAmount;
      public long totalNetWeight;
      public int skuTag;
      public boolean isChannel;
      public int deliveryMode;
      public String kolId;
      public String kolName;
      public int skuAfterSaleStatus;
      public SkuIdentifyCodeInfo skuIdentifyCodeInfo;

      public String getSkuId() {
         return this.skuId;
      }

      public String getSkuName() {
         return this.skuName;
      }

      public String getErpcode() {
         return this.erpcode;
      }

      public String getSkuSpec() {
         return this.skuSpec;
      }

      public String getSkuImage() {
         return this.skuImage;
      }

      public int getSkuQuantity() {
         return this.skuQuantity;
      }

      public List<OrderSkuDetailDTO> getSkuDetailList() {
         return this.skuDetailList;
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

      public int getSkuTag() {
         return this.skuTag;
      }

      public boolean isChannel() {
         return this.isChannel;
      }

      public int getDeliveryMode() {
         return this.deliveryMode;
      }

      public String getKolId() {
         return this.kolId;
      }

      public String getKolName() {
         return this.kolName;
      }

      public int getSkuAfterSaleStatus() {
         return this.skuAfterSaleStatus;
      }

      public SkuIdentifyCodeInfo getSkuIdentifyCodeInfo() {
         return this.skuIdentifyCodeInfo;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setSkuName(String skuName) {
         this.skuName = skuName;
      }

      public void setErpcode(String erpcode) {
         this.erpcode = erpcode;
      }

      public void setSkuSpec(String skuSpec) {
         this.skuSpec = skuSpec;
      }

      public void setSkuImage(String skuImage) {
         this.skuImage = skuImage;
      }

      public void setSkuQuantity(int skuQuantity) {
         this.skuQuantity = skuQuantity;
      }

      public void setSkuDetailList(List<OrderSkuDetailDTO> skuDetailList) {
         this.skuDetailList = skuDetailList;
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

      public void setSkuTag(int skuTag) {
         this.skuTag = skuTag;
      }

      public void setChannel(boolean isChannel) {
         this.isChannel = isChannel;
      }

      public void setDeliveryMode(int deliveryMode) {
         this.deliveryMode = deliveryMode;
      }

      public void setKolId(String kolId) {
         this.kolId = kolId;
      }

      public void setKolName(String kolName) {
         this.kolName = kolName;
      }

      public void setSkuAfterSaleStatus(int skuAfterSaleStatus) {
         this.skuAfterSaleStatus = skuAfterSaleStatus;
      }

      public void setSkuIdentifyCodeInfo(SkuIdentifyCodeInfo skuIdentifyCodeInfo) {
         this.skuIdentifyCodeInfo = skuIdentifyCodeInfo;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OrderSkuDTOV3)) {
            return false;
         } else {
            OrderSkuDTOV3 other = (OrderSkuDTOV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getSkuQuantity() != other.getSkuQuantity()) {
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
            } else if (this.getSkuTag() != other.getSkuTag()) {
               return false;
            } else if (this.isChannel() != other.isChannel()) {
               return false;
            } else if (this.getDeliveryMode() != other.getDeliveryMode()) {
               return false;
            } else if (this.getSkuAfterSaleStatus() != other.getSkuAfterSaleStatus()) {
               return false;
            } else {
               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
                  return false;
               }

               Object this$skuName = this.getSkuName();
               Object other$skuName = other.getSkuName();
               if (this$skuName == null) {
                  if (other$skuName != null) {
                     return false;
                  }
               } else if (!this$skuName.equals(other$skuName)) {
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

               Object this$skuSpec = this.getSkuSpec();
               Object other$skuSpec = other.getSkuSpec();
               if (this$skuSpec == null) {
                  if (other$skuSpec != null) {
                     return false;
                  }
               } else if (!this$skuSpec.equals(other$skuSpec)) {
                  return false;
               }

               Object this$skuImage = this.getSkuImage();
               Object other$skuImage = other.getSkuImage();
               if (this$skuImage == null) {
                  if (other$skuImage != null) {
                     return false;
                  }
               } else if (!this$skuImage.equals(other$skuImage)) {
                  return false;
               }

               Object this$skuDetailList = this.getSkuDetailList();
               Object other$skuDetailList = other.getSkuDetailList();
               if (this$skuDetailList == null) {
                  if (other$skuDetailList != null) {
                     return false;
                  }
               } else if (!this$skuDetailList.equals(other$skuDetailList)) {
                  return false;
               }

               Object this$kolId = this.getKolId();
               Object other$kolId = other.getKolId();
               if (this$kolId == null) {
                  if (other$kolId != null) {
                     return false;
                  }
               } else if (!this$kolId.equals(other$kolId)) {
                  return false;
               }

               Object this$kolName = this.getKolName();
               Object other$kolName = other.getKolName();
               if (this$kolName == null) {
                  if (other$kolName != null) {
                     return false;
                  }
               } else if (!this$kolName.equals(other$kolName)) {
                  return false;
               }

               Object this$skuIdentifyCodeInfo = this.getSkuIdentifyCodeInfo();
               Object other$skuIdentifyCodeInfo = other.getSkuIdentifyCodeInfo();
               if (this$skuIdentifyCodeInfo == null) {
                  if (other$skuIdentifyCodeInfo != null) {
                     return false;
                  }
               } else if (!this$skuIdentifyCodeInfo.equals(other$skuIdentifyCodeInfo)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OrderSkuDTOV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getSkuQuantity();
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
         result = result * 59 + this.getSkuTag();
         result = result * 59 + (this.isChannel() ? 79 : 97);
         result = result * 59 + this.getDeliveryMode();
         result = result * 59 + this.getSkuAfterSaleStatus();
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $skuName = this.getSkuName();
         result = result * 59 + ($skuName == null ? 43 : $skuName.hashCode());
         Object $erpcode = this.getErpcode();
         result = result * 59 + ($erpcode == null ? 43 : $erpcode.hashCode());
         Object $skuSpec = this.getSkuSpec();
         result = result * 59 + ($skuSpec == null ? 43 : $skuSpec.hashCode());
         Object $skuImage = this.getSkuImage();
         result = result * 59 + ($skuImage == null ? 43 : $skuImage.hashCode());
         Object $skuDetailList = this.getSkuDetailList();
         result = result * 59 + ($skuDetailList == null ? 43 : $skuDetailList.hashCode());
         Object $kolId = this.getKolId();
         result = result * 59 + ($kolId == null ? 43 : $kolId.hashCode());
         Object $kolName = this.getKolName();
         result = result * 59 + ($kolName == null ? 43 : $kolName.hashCode());
         Object $skuIdentifyCodeInfo = this.getSkuIdentifyCodeInfo();
         result = result * 59 + ($skuIdentifyCodeInfo == null ? 43 : $skuIdentifyCodeInfo.hashCode());
         return result;
      }

      public String toString() {
         return "GetOrderDetailResponse.OrderSkuDTOV3(skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", erpcode=" + this.getErpcode() + ", skuSpec=" + this.getSkuSpec() + ", skuImage=" + this.getSkuImage() + ", skuQuantity=" + this.getSkuQuantity() + ", skuDetailList=" + this.getSkuDetailList() + ", totalPaidAmount=" + this.getTotalPaidAmount() + ", totalMerchantDiscount=" + this.getTotalMerchantDiscount() + ", totalRedDiscount=" + this.getTotalRedDiscount() + ", totalTaxAmount=" + this.getTotalTaxAmount() + ", totalNetWeight=" + this.getTotalNetWeight() + ", skuTag=" + this.getSkuTag() + ", isChannel=" + this.isChannel() + ", deliveryMode=" + this.getDeliveryMode() + ", kolId=" + this.getKolId() + ", kolName=" + this.getKolName() + ", skuAfterSaleStatus=" + this.getSkuAfterSaleStatus() + ", skuIdentifyCodeInfo=" + this.getSkuIdentifyCodeInfo() + ")";
      }
   }

   public static class OrderSkuDetailDTO {
      public String skuId;
      public String erpCode;
      public String barcode;
      public String scSkuCode;
      public int quantity;
      public String registerName;
      public String skuName;
      public long pricePerSku;
      public long taxPerSku;
      public long paidAmountPerSku;
      public long depositAmountPerSku;
      public long merchantDiscountPerSku;
      public long redDiscountPerSku;
      public long rawPricePerSku;

      public String getSkuId() {
         return this.skuId;
      }

      public String getErpCode() {
         return this.erpCode;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public String getScSkuCode() {
         return this.scSkuCode;
      }

      public int getQuantity() {
         return this.quantity;
      }

      public String getRegisterName() {
         return this.registerName;
      }

      public String getSkuName() {
         return this.skuName;
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

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setErpCode(String erpCode) {
         this.erpCode = erpCode;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setScSkuCode(String scSkuCode) {
         this.scSkuCode = scSkuCode;
      }

      public void setQuantity(int quantity) {
         this.quantity = quantity;
      }

      public void setRegisterName(String registerName) {
         this.registerName = registerName;
      }

      public void setSkuName(String skuName) {
         this.skuName = skuName;
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
         } else if (!(o instanceof OrderSkuDetailDTO)) {
            return false;
         } else {
            OrderSkuDetailDTO other = (OrderSkuDetailDTO)o;
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
               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
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

               Object this$scSkuCode = this.getScSkuCode();
               Object other$scSkuCode = other.getScSkuCode();
               if (this$scSkuCode == null) {
                  if (other$scSkuCode != null) {
                     return false;
                  }
               } else if (!this$scSkuCode.equals(other$scSkuCode)) {
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

               Object this$skuName = this.getSkuName();
               Object other$skuName = other.getSkuName();
               if (this$skuName == null) {
                  if (other$skuName != null) {
                     return false;
                  }
               } else if (!this$skuName.equals(other$skuName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OrderSkuDetailDTO;
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
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $erpCode = this.getErpCode();
         result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
         Object $barcode = this.getBarcode();
         result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
         Object $scSkuCode = this.getScSkuCode();
         result = result * 59 + ($scSkuCode == null ? 43 : $scSkuCode.hashCode());
         Object $registerName = this.getRegisterName();
         result = result * 59 + ($registerName == null ? 43 : $registerName.hashCode());
         Object $skuName = this.getSkuName();
         result = result * 59 + ($skuName == null ? 43 : $skuName.hashCode());
         return result;
      }

      public String toString() {
         return "GetOrderDetailResponse.OrderSkuDetailDTO(skuId=" + this.getSkuId() + ", erpCode=" + this.getErpCode() + ", barcode=" + this.getBarcode() + ", scSkuCode=" + this.getScSkuCode() + ", quantity=" + this.getQuantity() + ", registerName=" + this.getRegisterName() + ", skuName=" + this.getSkuName() + ", pricePerSku=" + this.getPricePerSku() + ", taxPerSku=" + this.getTaxPerSku() + ", paidAmountPerSku=" + this.getPaidAmountPerSku() + ", depositAmountPerSku=" + this.getDepositAmountPerSku() + ", merchantDiscountPerSku=" + this.getMerchantDiscountPerSku() + ", redDiscountPerSku=" + this.getRedDiscountPerSku() + ", rawPricePerSku=" + this.getRawPricePerSku() + ")";
      }
   }

   public static class SimpleDeliveryOrder {
      public int deliveryOrderIndex;
      public int status;
      public String expressTrackingNo;
      public String expressCompanyCode;
      public List<String> itemIdList;
      public List<String> skuIdList;

      public int getDeliveryOrderIndex() {
         return this.deliveryOrderIndex;
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

      public List<String> getSkuIdList() {
         return this.skuIdList;
      }

      public void setDeliveryOrderIndex(int deliveryOrderIndex) {
         this.deliveryOrderIndex = deliveryOrderIndex;
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

      public void setSkuIdList(List<String> skuIdList) {
         this.skuIdList = skuIdList;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SimpleDeliveryOrder)) {
            return false;
         } else {
            SimpleDeliveryOrder other = (SimpleDeliveryOrder)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getDeliveryOrderIndex() != other.getDeliveryOrderIndex()) {
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

               Object this$skuIdList = this.getSkuIdList();
               Object other$skuIdList = other.getSkuIdList();
               if (this$skuIdList == null) {
                  if (other$skuIdList != null) {
                     return false;
                  }
               } else if (!this$skuIdList.equals(other$skuIdList)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SimpleDeliveryOrder;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getDeliveryOrderIndex();
         result = result * 59 + this.getStatus();
         Object $expressTrackingNo = this.getExpressTrackingNo();
         result = result * 59 + ($expressTrackingNo == null ? 43 : $expressTrackingNo.hashCode());
         Object $expressCompanyCode = this.getExpressCompanyCode();
         result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
         Object $itemIdList = this.getItemIdList();
         result = result * 59 + ($itemIdList == null ? 43 : $itemIdList.hashCode());
         Object $skuIdList = this.getSkuIdList();
         result = result * 59 + ($skuIdList == null ? 43 : $skuIdList.hashCode());
         return result;
      }

      public String toString() {
         return "GetOrderDetailResponse.SimpleDeliveryOrder(deliveryOrderIndex=" + this.getDeliveryOrderIndex() + ", status=" + this.getStatus() + ", expressTrackingNo=" + this.getExpressTrackingNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", itemIdList=" + this.getItemIdList() + ", skuIdList=" + this.getSkuIdList() + ")";
      }
   }
}
