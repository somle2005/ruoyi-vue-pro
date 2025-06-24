package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.List;

public class OrderSimpleDetail {
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
   public String originalOrderId;
   public String logistics;
   public List<String> orderTagList;

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

   public String getOriginalOrderId() {
      return this.originalOrderId;
   }

   public String getLogistics() {
      return this.logistics;
   }

   public List<String> getOrderTagList() {
      return this.orderTagList;
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

   public void setOriginalOrderId(String originalOrderId) {
      this.originalOrderId = originalOrderId;
   }

   public void setLogistics(String logistics) {
      this.logistics = logistics;
   }

   public void setOrderTagList(List<String> orderTagList) {
      this.orderTagList = orderTagList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof OrderSimpleDetail)) {
         return false;
      } else {
         OrderSimpleDetail other = (OrderSimpleDetail)o;
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

            Object this$originalOrderId = this.getOriginalOrderId();
            Object other$originalOrderId = other.getOriginalOrderId();
            if (this$originalOrderId == null) {
               if (other$originalOrderId != null) {
                  return false;
               }
            } else if (!this$originalOrderId.equals(other$originalOrderId)) {
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

            Object this$orderTagList = this.getOrderTagList();
            Object other$orderTagList = other.getOrderTagList();
            if (this$orderTagList == null) {
               if (other$orderTagList != null) {
                  return false;
               }
            } else if (!this$orderTagList.equals(other$orderTagList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof OrderSimpleDetail;
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
      Object $originalOrderId = this.getOriginalOrderId();
      result = result * 59 + ($originalOrderId == null ? 43 : $originalOrderId.hashCode());
      Object $logistics = this.getLogistics();
      result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
      Object $orderTagList = this.getOrderTagList();
      result = result * 59 + ($orderTagList == null ? 43 : $orderTagList.hashCode());
      return result;
   }

   public String toString() {
      return "OrderSimpleDetail(orderId=" + this.getOrderId() + ", orderType=" + this.getOrderType() + ", orderStatus=" + this.getOrderStatus() + ", orderAfterSalesStatus=" + this.getOrderAfterSalesStatus() + ", cancelStatus=" + this.getCancelStatus() + ", createdTime=" + this.getCreatedTime() + ", paidTime=" + this.getPaidTime() + ", updateTime=" + this.getUpdateTime() + ", deliveryTime=" + this.getDeliveryTime() + ", cancelTime=" + this.getCancelTime() + ", finishTime=" + this.getFinishTime() + ", promiseLastDeliveryTime=" + this.getPromiseLastDeliveryTime() + ", planInfoId=" + this.getPlanInfoId() + ", planInfoName=" + this.getPlanInfoName() + ", receiverCountryId=" + this.getReceiverCountryId() + ", receiverCountryName=" + this.getReceiverCountryName() + ", receiverProvinceId=" + this.getReceiverProvinceId() + ", receiverProvinceName=" + this.getReceiverProvinceName() + ", receiverCityId=" + this.getReceiverCityId() + ", receiverCityName=" + this.getReceiverCityName() + ", receiverDistrictId=" + this.getReceiverDistrictId() + ", receiverDistrictName=" + this.getReceiverDistrictName() + ", customerRemark=" + this.getCustomerRemark() + ", sellerRemark=" + this.getSellerRemark() + ", sellerRemarkFlag=" + this.getSellerRemarkFlag() + ", originalOrderId=" + this.getOriginalOrderId() + ", logistics=" + this.getLogistics() + ", orderTagList=" + this.getOrderTagList() + ")";
   }
}
