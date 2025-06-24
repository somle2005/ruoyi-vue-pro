package com.xiaohongshu.fls.opensdk.entity.instantshopping;

public class InstantShoppingTrackingDTO {
   private String xhsOrderId;
   private String expressCompanyCode;
   private String expressNo;
   private String leafNodeType;
   private String eventAt;
   private String eventDesc;
   private AddressLocation currentLocation;
   private String exceptionCode;
   private String exceptionReason;
   private String courierName;
   private String courierPhone;
   private String courierPhoneType;
   private String expectArrivalTime;
   private String deliveryDistance;

   public String getXhsOrderId() {
      return this.xhsOrderId;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getLeafNodeType() {
      return this.leafNodeType;
   }

   public String getEventAt() {
      return this.eventAt;
   }

   public String getEventDesc() {
      return this.eventDesc;
   }

   public AddressLocation getCurrentLocation() {
      return this.currentLocation;
   }

   public String getExceptionCode() {
      return this.exceptionCode;
   }

   public String getExceptionReason() {
      return this.exceptionReason;
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

   public String getExpectArrivalTime() {
      return this.expectArrivalTime;
   }

   public String getDeliveryDistance() {
      return this.deliveryDistance;
   }

   public void setXhsOrderId(String xhsOrderId) {
      this.xhsOrderId = xhsOrderId;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setLeafNodeType(String leafNodeType) {
      this.leafNodeType = leafNodeType;
   }

   public void setEventAt(String eventAt) {
      this.eventAt = eventAt;
   }

   public void setEventDesc(String eventDesc) {
      this.eventDesc = eventDesc;
   }

   public void setCurrentLocation(AddressLocation currentLocation) {
      this.currentLocation = currentLocation;
   }

   public void setExceptionCode(String exceptionCode) {
      this.exceptionCode = exceptionCode;
   }

   public void setExceptionReason(String exceptionReason) {
      this.exceptionReason = exceptionReason;
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

   public void setExpectArrivalTime(String expectArrivalTime) {
      this.expectArrivalTime = expectArrivalTime;
   }

   public void setDeliveryDistance(String deliveryDistance) {
      this.deliveryDistance = deliveryDistance;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof InstantShoppingTrackingDTO)) {
         return false;
      } else {
         InstantShoppingTrackingDTO other = (InstantShoppingTrackingDTO)o;
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

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
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

            Object this$leafNodeType = this.getLeafNodeType();
            Object other$leafNodeType = other.getLeafNodeType();
            if (this$leafNodeType == null) {
               if (other$leafNodeType != null) {
                  return false;
               }
            } else if (!this$leafNodeType.equals(other$leafNodeType)) {
               return false;
            }

            Object this$eventAt = this.getEventAt();
            Object other$eventAt = other.getEventAt();
            if (this$eventAt == null) {
               if (other$eventAt != null) {
                  return false;
               }
            } else if (!this$eventAt.equals(other$eventAt)) {
               return false;
            }

            Object this$eventDesc = this.getEventDesc();
            Object other$eventDesc = other.getEventDesc();
            if (this$eventDesc == null) {
               if (other$eventDesc != null) {
                  return false;
               }
            } else if (!this$eventDesc.equals(other$eventDesc)) {
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

            Object this$exceptionCode = this.getExceptionCode();
            Object other$exceptionCode = other.getExceptionCode();
            if (this$exceptionCode == null) {
               if (other$exceptionCode != null) {
                  return false;
               }
            } else if (!this$exceptionCode.equals(other$exceptionCode)) {
               return false;
            }

            Object this$exceptionReason = this.getExceptionReason();
            Object other$exceptionReason = other.getExceptionReason();
            if (this$exceptionReason == null) {
               if (other$exceptionReason != null) {
                  return false;
               }
            } else if (!this$exceptionReason.equals(other$exceptionReason)) {
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

            Object this$expectArrivalTime = this.getExpectArrivalTime();
            Object other$expectArrivalTime = other.getExpectArrivalTime();
            if (this$expectArrivalTime == null) {
               if (other$expectArrivalTime != null) {
                  return false;
               }
            } else if (!this$expectArrivalTime.equals(other$expectArrivalTime)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof InstantShoppingTrackingDTO;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $xhsOrderId = this.getXhsOrderId();
      result = result * 59 + ($xhsOrderId == null ? 43 : $xhsOrderId.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $leafNodeType = this.getLeafNodeType();
      result = result * 59 + ($leafNodeType == null ? 43 : $leafNodeType.hashCode());
      Object $eventAt = this.getEventAt();
      result = result * 59 + ($eventAt == null ? 43 : $eventAt.hashCode());
      Object $eventDesc = this.getEventDesc();
      result = result * 59 + ($eventDesc == null ? 43 : $eventDesc.hashCode());
      Object $currentLocation = this.getCurrentLocation();
      result = result * 59 + ($currentLocation == null ? 43 : $currentLocation.hashCode());
      Object $exceptionCode = this.getExceptionCode();
      result = result * 59 + ($exceptionCode == null ? 43 : $exceptionCode.hashCode());
      Object $exceptionReason = this.getExceptionReason();
      result = result * 59 + ($exceptionReason == null ? 43 : $exceptionReason.hashCode());
      Object $courierName = this.getCourierName();
      result = result * 59 + ($courierName == null ? 43 : $courierName.hashCode());
      Object $courierPhone = this.getCourierPhone();
      result = result * 59 + ($courierPhone == null ? 43 : $courierPhone.hashCode());
      Object $courierPhoneType = this.getCourierPhoneType();
      result = result * 59 + ($courierPhoneType == null ? 43 : $courierPhoneType.hashCode());
      Object $expectArrivalTime = this.getExpectArrivalTime();
      result = result * 59 + ($expectArrivalTime == null ? 43 : $expectArrivalTime.hashCode());
      Object $deliveryDistance = this.getDeliveryDistance();
      result = result * 59 + ($deliveryDistance == null ? 43 : $deliveryDistance.hashCode());
      return result;
   }

   public String toString() {
      return "InstantShoppingTrackingDTO(xhsOrderId=" + this.getXhsOrderId() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressNo=" + this.getExpressNo() + ", leafNodeType=" + this.getLeafNodeType() + ", eventAt=" + this.getEventAt() + ", eventDesc=" + this.getEventDesc() + ", currentLocation=" + this.getCurrentLocation() + ", exceptionCode=" + this.getExceptionCode() + ", exceptionReason=" + this.getExceptionReason() + ", courierName=" + this.getCourierName() + ", courierPhone=" + this.getCourierPhone() + ", courierPhoneType=" + this.getCourierPhoneType() + ", expectArrivalTime=" + this.getExpectArrivalTime() + ", deliveryDistance=" + this.getDeliveryDistance() + ")";
   }
}
