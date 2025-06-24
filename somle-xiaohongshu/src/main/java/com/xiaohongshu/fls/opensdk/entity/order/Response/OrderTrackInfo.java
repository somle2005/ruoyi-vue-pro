package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.ArrayList;
import java.util.List;

public class OrderTrackInfo {
   public String orderId;
   public String deliveryOrderId;
   public String currentStatusDesc;
   public String expressCompanyCode;
   public String expressCompanyName;
   public String expressNo;
   public List<TrackingRecord> records = new ArrayList();

   public String getOrderId() {
      return this.orderId;
   }

   public String getDeliveryOrderId() {
      return this.deliveryOrderId;
   }

   public String getCurrentStatusDesc() {
      return this.currentStatusDesc;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressCompanyName() {
      return this.expressCompanyName;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public List<TrackingRecord> getRecords() {
      return this.records;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setDeliveryOrderId(String deliveryOrderId) {
      this.deliveryOrderId = deliveryOrderId;
   }

   public void setCurrentStatusDesc(String currentStatusDesc) {
      this.currentStatusDesc = currentStatusDesc;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressCompanyName(String expressCompanyName) {
      this.expressCompanyName = expressCompanyName;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setRecords(List<TrackingRecord> records) {
      this.records = records;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof OrderTrackInfo)) {
         return false;
      } else {
         OrderTrackInfo other = (OrderTrackInfo)o;
         if (!other.canEqual(this)) {
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

            Object this$deliveryOrderId = this.getDeliveryOrderId();
            Object other$deliveryOrderId = other.getDeliveryOrderId();
            if (this$deliveryOrderId == null) {
               if (other$deliveryOrderId != null) {
                  return false;
               }
            } else if (!this$deliveryOrderId.equals(other$deliveryOrderId)) {
               return false;
            }

            Object this$currentStatusDesc = this.getCurrentStatusDesc();
            Object other$currentStatusDesc = other.getCurrentStatusDesc();
            if (this$currentStatusDesc == null) {
               if (other$currentStatusDesc != null) {
                  return false;
               }
            } else if (!this$currentStatusDesc.equals(other$currentStatusDesc)) {
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

            Object this$expressNo = this.getExpressNo();
            Object other$expressNo = other.getExpressNo();
            if (this$expressNo == null) {
               if (other$expressNo != null) {
                  return false;
               }
            } else if (!this$expressNo.equals(other$expressNo)) {
               return false;
            }

            Object this$records = this.getRecords();
            Object other$records = other.getRecords();
            if (this$records == null) {
               if (other$records != null) {
                  return false;
               }
            } else if (!this$records.equals(other$records)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof OrderTrackInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $deliveryOrderId = this.getDeliveryOrderId();
      result = result * 59 + ($deliveryOrderId == null ? 43 : $deliveryOrderId.hashCode());
      Object $currentStatusDesc = this.getCurrentStatusDesc();
      result = result * 59 + ($currentStatusDesc == null ? 43 : $currentStatusDesc.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressCompanyName = this.getExpressCompanyName();
      result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $records = this.getRecords();
      result = result * 59 + ($records == null ? 43 : $records.hashCode());
      return result;
   }

   public String toString() {
      return "OrderTrackInfo(orderId=" + this.getOrderId() + ", deliveryOrderId=" + this.getDeliveryOrderId() + ", currentStatusDesc=" + this.getCurrentStatusDesc() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", expressNo=" + this.getExpressNo() + ", records=" + this.getRecords() + ")";
   }

   public static class TrackingRecord {
      public String eventAt;
      public String eventDesc;
      public String trackingPartnerSyncAt;
      public int nodeId;
      public int subNodeId;
      public int trackingStatus;
      public String trackingStatusDesc;
      public ExpressLocation location = new ExpressLocation();

      public String getEventAt() {
         return this.eventAt;
      }

      public String getEventDesc() {
         return this.eventDesc;
      }

      public String getTrackingPartnerSyncAt() {
         return this.trackingPartnerSyncAt;
      }

      public int getNodeId() {
         return this.nodeId;
      }

      public int getSubNodeId() {
         return this.subNodeId;
      }

      public int getTrackingStatus() {
         return this.trackingStatus;
      }

      public String getTrackingStatusDesc() {
         return this.trackingStatusDesc;
      }

      public ExpressLocation getLocation() {
         return this.location;
      }

      public void setEventAt(String eventAt) {
         this.eventAt = eventAt;
      }

      public void setEventDesc(String eventDesc) {
         this.eventDesc = eventDesc;
      }

      public void setTrackingPartnerSyncAt(String trackingPartnerSyncAt) {
         this.trackingPartnerSyncAt = trackingPartnerSyncAt;
      }

      public void setNodeId(int nodeId) {
         this.nodeId = nodeId;
      }

      public void setSubNodeId(int subNodeId) {
         this.subNodeId = subNodeId;
      }

      public void setTrackingStatus(int trackingStatus) {
         this.trackingStatus = trackingStatus;
      }

      public void setTrackingStatusDesc(String trackingStatusDesc) {
         this.trackingStatusDesc = trackingStatusDesc;
      }

      public void setLocation(ExpressLocation location) {
         this.location = location;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof TrackingRecord)) {
            return false;
         } else {
            TrackingRecord other = (TrackingRecord)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getNodeId() != other.getNodeId()) {
               return false;
            } else if (this.getSubNodeId() != other.getSubNodeId()) {
               return false;
            } else if (this.getTrackingStatus() != other.getTrackingStatus()) {
               return false;
            } else {
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

               Object this$trackingPartnerSyncAt = this.getTrackingPartnerSyncAt();
               Object other$trackingPartnerSyncAt = other.getTrackingPartnerSyncAt();
               if (this$trackingPartnerSyncAt == null) {
                  if (other$trackingPartnerSyncAt != null) {
                     return false;
                  }
               } else if (!this$trackingPartnerSyncAt.equals(other$trackingPartnerSyncAt)) {
                  return false;
               }

               Object this$trackingStatusDesc = this.getTrackingStatusDesc();
               Object other$trackingStatusDesc = other.getTrackingStatusDesc();
               if (this$trackingStatusDesc == null) {
                  if (other$trackingStatusDesc != null) {
                     return false;
                  }
               } else if (!this$trackingStatusDesc.equals(other$trackingStatusDesc)) {
                  return false;
               }

               Object this$location = this.getLocation();
               Object other$location = other.getLocation();
               if (this$location == null) {
                  if (other$location != null) {
                     return false;
                  }
               } else if (!this$location.equals(other$location)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof TrackingRecord;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getNodeId();
         result = result * 59 + this.getSubNodeId();
         result = result * 59 + this.getTrackingStatus();
         Object $eventAt = this.getEventAt();
         result = result * 59 + ($eventAt == null ? 43 : $eventAt.hashCode());
         Object $eventDesc = this.getEventDesc();
         result = result * 59 + ($eventDesc == null ? 43 : $eventDesc.hashCode());
         Object $trackingPartnerSyncAt = this.getTrackingPartnerSyncAt();
         result = result * 59 + ($trackingPartnerSyncAt == null ? 43 : $trackingPartnerSyncAt.hashCode());
         Object $trackingStatusDesc = this.getTrackingStatusDesc();
         result = result * 59 + ($trackingStatusDesc == null ? 43 : $trackingStatusDesc.hashCode());
         Object $location = this.getLocation();
         result = result * 59 + ($location == null ? 43 : $location.hashCode());
         return result;
      }

      public String toString() {
         return "OrderTrackInfo.TrackingRecord(eventAt=" + this.getEventAt() + ", eventDesc=" + this.getEventDesc() + ", trackingPartnerSyncAt=" + this.getTrackingPartnerSyncAt() + ", nodeId=" + this.getNodeId() + ", subNodeId=" + this.getSubNodeId() + ", trackingStatus=" + this.getTrackingStatus() + ", trackingStatusDesc=" + this.getTrackingStatusDesc() + ", location=" + this.getLocation() + ")";
      }
   }

   public static class ExpressLocation {
      public String provinceName;
      public String cityName;

      public String getProvinceName() {
         return this.provinceName;
      }

      public String getCityName() {
         return this.cityName;
      }

      public void setProvinceName(String provinceName) {
         this.provinceName = provinceName;
      }

      public void setCityName(String cityName) {
         this.cityName = cityName;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ExpressLocation)) {
            return false;
         } else {
            ExpressLocation other = (ExpressLocation)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$provinceName = this.getProvinceName();
               Object other$provinceName = other.getProvinceName();
               if (this$provinceName == null) {
                  if (other$provinceName != null) {
                     return false;
                  }
               } else if (!this$provinceName.equals(other$provinceName)) {
                  return false;
               }

               Object this$cityName = this.getCityName();
               Object other$cityName = other.getCityName();
               if (this$cityName == null) {
                  if (other$cityName != null) {
                     return false;
                  }
               } else if (!this$cityName.equals(other$cityName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ExpressLocation;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $provinceName = this.getProvinceName();
         result = result * 59 + ($provinceName == null ? 43 : $provinceName.hashCode());
         Object $cityName = this.getCityName();
         result = result * 59 + ($cityName == null ? 43 : $cityName.hashCode());
         return result;
      }

      public String toString() {
         return "OrderTrackInfo.ExpressLocation(provinceName=" + this.getProvinceName() + ", cityName=" + this.getCityName() + ")";
      }
   }
}
