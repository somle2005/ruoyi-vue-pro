package com.xiaohongshu.fls.opensdk.entity.packages.response;

import java.util.ArrayList;
import java.util.List;

public class GetPackageTrackResponse {
   public List<PackageTrackInfo> packageTrackInfos;

   public List<PackageTrackInfo> getPackageTrackInfos() {
      return this.packageTrackInfos;
   }

   public void setPackageTrackInfos(List<PackageTrackInfo> packageTrackInfos) {
      this.packageTrackInfos = packageTrackInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetPackageTrackResponse)) {
         return false;
      } else {
         GetPackageTrackResponse other = (GetPackageTrackResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$packageTrackInfos = this.getPackageTrackInfos();
            Object other$packageTrackInfos = other.getPackageTrackInfos();
            if (this$packageTrackInfos == null) {
               if (other$packageTrackInfos != null) {
                  return false;
               }
            } else if (!this$packageTrackInfos.equals(other$packageTrackInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetPackageTrackResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $packageTrackInfos = this.getPackageTrackInfos();
      result = result * 59 + ($packageTrackInfos == null ? 43 : $packageTrackInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetPackageTrackResponse(packageTrackInfos=" + this.getPackageTrackInfos() + ")";
   }

   public class PackageTrackInfo {
      public String packageId;
      public String deliveryPackageId;
      public String currentStatusDesc;
      public String expressCompanyCode;
      public String expressCompanyName;
      public String expressNo;
      public List<TrackingRecord> records = new ArrayList();

      public String getPackageId() {
         return this.packageId;
      }

      public String getDeliveryPackageId() {
         return this.deliveryPackageId;
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

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setDeliveryPackageId(String deliveryPackageId) {
         this.deliveryPackageId = deliveryPackageId;
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
         } else if (!(o instanceof PackageTrackInfo)) {
            return false;
         } else {
            PackageTrackInfo other = (PackageTrackInfo)o;
            if (!other.canEqual(this)) {
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

               Object this$deliveryPackageId = this.getDeliveryPackageId();
               Object other$deliveryPackageId = other.getDeliveryPackageId();
               if (this$deliveryPackageId == null) {
                  if (other$deliveryPackageId != null) {
                     return false;
                  }
               } else if (!this$deliveryPackageId.equals(other$deliveryPackageId)) {
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
         return other instanceof PackageTrackInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $deliveryPackageId = this.getDeliveryPackageId();
         result = result * 59 + ($deliveryPackageId == null ? 43 : $deliveryPackageId.hashCode());
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
         return "GetPackageTrackResponse.PackageTrackInfo(packageId=" + this.getPackageId() + ", deliveryPackageId=" + this.getDeliveryPackageId() + ", currentStatusDesc=" + this.getCurrentStatusDesc() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", expressNo=" + this.getExpressNo() + ", records=" + this.getRecords() + ")";
      }
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
         return "GetPackageTrackResponse.TrackingRecord(eventAt=" + this.getEventAt() + ", eventDesc=" + this.getEventDesc() + ", trackingPartnerSyncAt=" + this.getTrackingPartnerSyncAt() + ", nodeId=" + this.getNodeId() + ", subNodeId=" + this.getSubNodeId() + ", trackingStatus=" + this.getTrackingStatus() + ", trackingStatusDesc=" + this.getTrackingStatusDesc() + ", location=" + this.getLocation() + ")";
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
         return "GetPackageTrackResponse.ExpressLocation(provinceName=" + this.getProvinceName() + ", cityName=" + this.getCityName() + ")";
      }
   }
}
