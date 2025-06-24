package com.xiaohongshu.fls.opensdk.entity.instantshopping.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.instantshopping.AddressLocation;

public class UpdateRiderLocationRequest extends BaseRequest {
   private String xhsOrderId;
   private String expressNo;
   private String expressCompanyCode;
   private String courierName;
   private String courierPhone;
   private String courierPhoneType;
   private String deliveryDistance;
   private String reportTime;
   private AddressLocation currentLocation;

   public String getXhsOrderId() {
      return this.xhsOrderId;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getCourierName() {
      return this.courierName;
   }

   public String getCourierPhone() {
      return this.courierPhone;
   }

   public String getCourierPhoneType() {
      return this.courierPhoneType;
   }

   public String getDeliveryDistance() {
      return this.deliveryDistance;
   }

   public String getReportTime() {
      return this.reportTime;
   }

   public AddressLocation getCurrentLocation() {
      return this.currentLocation;
   }

   public void setXhsOrderId(String xhsOrderId) {
      this.xhsOrderId = xhsOrderId;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setCourierName(String courierName) {
      this.courierName = courierName;
   }

   public void setCourierPhone(String courierPhone) {
      this.courierPhone = courierPhone;
   }

   public void setCourierPhoneType(String courierPhoneType) {
      this.courierPhoneType = courierPhoneType;
   }

   public void setDeliveryDistance(String deliveryDistance) {
      this.deliveryDistance = deliveryDistance;
   }

   public void setReportTime(String reportTime) {
      this.reportTime = reportTime;
   }

   public void setCurrentLocation(AddressLocation currentLocation) {
      this.currentLocation = currentLocation;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateRiderLocationRequest)) {
         return false;
      } else {
         UpdateRiderLocationRequest other = (UpdateRiderLocationRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$xhsOrderId = this.getXhsOrderId();
            Object other$xhsOrderId = other.getXhsOrderId();
            if (this$xhsOrderId == null) {
               if (other$xhsOrderId != null) {
                  return false;
               }
            } else if (!this$xhsOrderId.equals(other$xhsOrderId)) {
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

            Object this$courierName = this.getCourierName();
            Object other$courierName = other.getCourierName();
            if (this$courierName == null) {
               if (other$courierName != null) {
                  return false;
               }
            } else if (!this$courierName.equals(other$courierName)) {
               return false;
            }

            Object this$courierPhone = this.getCourierPhone();
            Object other$courierPhone = other.getCourierPhone();
            if (this$courierPhone == null) {
               if (other$courierPhone != null) {
                  return false;
               }
            } else if (!this$courierPhone.equals(other$courierPhone)) {
               return false;
            }

            Object this$courierPhoneType = this.getCourierPhoneType();
            Object other$courierPhoneType = other.getCourierPhoneType();
            if (this$courierPhoneType == null) {
               if (other$courierPhoneType != null) {
                  return false;
               }
            } else if (!this$courierPhoneType.equals(other$courierPhoneType)) {
               return false;
            }

            Object this$deliveryDistance = this.getDeliveryDistance();
            Object other$deliveryDistance = other.getDeliveryDistance();
            if (this$deliveryDistance == null) {
               if (other$deliveryDistance != null) {
                  return false;
               }
            } else if (!this$deliveryDistance.equals(other$deliveryDistance)) {
               return false;
            }

            Object this$reportTime = this.getReportTime();
            Object other$reportTime = other.getReportTime();
            if (this$reportTime == null) {
               if (other$reportTime != null) {
                  return false;
               }
            } else if (!this$reportTime.equals(other$reportTime)) {
               return false;
            }

            Object this$currentLocation = this.getCurrentLocation();
            Object other$currentLocation = other.getCurrentLocation();
            if (this$currentLocation == null) {
               if (other$currentLocation != null) {
                  return false;
               }
            } else if (!this$currentLocation.equals(other$currentLocation)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateRiderLocationRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $xhsOrderId = this.getXhsOrderId();
      result = result * 59 + ($xhsOrderId == null ? 43 : $xhsOrderId.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $courierName = this.getCourierName();
      result = result * 59 + ($courierName == null ? 43 : $courierName.hashCode());
      Object $courierPhone = this.getCourierPhone();
      result = result * 59 + ($courierPhone == null ? 43 : $courierPhone.hashCode());
      Object $courierPhoneType = this.getCourierPhoneType();
      result = result * 59 + ($courierPhoneType == null ? 43 : $courierPhoneType.hashCode());
      Object $deliveryDistance = this.getDeliveryDistance();
      result = result * 59 + ($deliveryDistance == null ? 43 : $deliveryDistance.hashCode());
      Object $reportTime = this.getReportTime();
      result = result * 59 + ($reportTime == null ? 43 : $reportTime.hashCode());
      Object $currentLocation = this.getCurrentLocation();
      result = result * 59 + ($currentLocation == null ? 43 : $currentLocation.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateRiderLocationRequest(xhsOrderId=" + this.getXhsOrderId() + ", expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", courierName=" + this.getCourierName() + ", courierPhone=" + this.getCourierPhone() + ", courierPhoneType=" + this.getCourierPhoneType() + ", deliveryDistance=" + this.getDeliveryDistance() + ", reportTime=" + this.getReportTime() + ", currentLocation=" + this.getCurrentLocation() + ")";
   }
}
