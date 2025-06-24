package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetPackageListRequest extends BaseRequest {
   public Long startTime;
   public Long endTime;
   public Integer timeType;
   public Integer packageType;
   public Integer packageStatus;
   public Integer pageNo;
   public Integer pageSize;

   public Long getStartTime() {
      return this.startTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public Integer getTimeType() {
      return this.timeType;
   }

   public Integer getPackageType() {
      return this.packageType;
   }

   public Integer getPackageStatus() {
      return this.packageStatus;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public void setTimeType(Integer timeType) {
      this.timeType = timeType;
   }

   public void setPackageType(Integer packageType) {
      this.packageType = packageType;
   }

   public void setPackageStatus(Integer packageStatus) {
      this.packageStatus = packageStatus;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetPackageListRequest)) {
         return false;
      } else {
         GetPackageListRequest other = (GetPackageListRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$startTime = this.getStartTime();
            Object other$startTime = other.getStartTime();
            if (this$startTime == null) {
               if (other$startTime != null) {
                  return false;
               }
            } else if (!this$startTime.equals(other$startTime)) {
               return false;
            }

            Object this$endTime = this.getEndTime();
            Object other$endTime = other.getEndTime();
            if (this$endTime == null) {
               if (other$endTime != null) {
                  return false;
               }
            } else if (!this$endTime.equals(other$endTime)) {
               return false;
            }

            Object this$timeType = this.getTimeType();
            Object other$timeType = other.getTimeType();
            if (this$timeType == null) {
               if (other$timeType != null) {
                  return false;
               }
            } else if (!this$timeType.equals(other$timeType)) {
               return false;
            }

            Object this$packageType = this.getPackageType();
            Object other$packageType = other.getPackageType();
            if (this$packageType == null) {
               if (other$packageType != null) {
                  return false;
               }
            } else if (!this$packageType.equals(other$packageType)) {
               return false;
            }

            Object this$packageStatus = this.getPackageStatus();
            Object other$packageStatus = other.getPackageStatus();
            if (this$packageStatus == null) {
               if (other$packageStatus != null) {
                  return false;
               }
            } else if (!this$packageStatus.equals(other$packageStatus)) {
               return false;
            }

            Object this$pageNo = this.getPageNo();
            Object other$pageNo = other.getPageNo();
            if (this$pageNo == null) {
               if (other$pageNo != null) {
                  return false;
               }
            } else if (!this$pageNo.equals(other$pageNo)) {
               return false;
            }

            Object this$pageSize = this.getPageSize();
            Object other$pageSize = other.getPageSize();
            if (this$pageSize == null) {
               if (other$pageSize != null) {
                  return false;
               }
            } else if (!this$pageSize.equals(other$pageSize)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetPackageListRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $endTime = this.getEndTime();
      result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
      Object $timeType = this.getTimeType();
      result = result * 59 + ($timeType == null ? 43 : $timeType.hashCode());
      Object $packageType = this.getPackageType();
      result = result * 59 + ($packageType == null ? 43 : $packageType.hashCode());
      Object $packageStatus = this.getPackageStatus();
      result = result * 59 + ($packageStatus == null ? 43 : $packageStatus.hashCode());
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      return result;
   }

   public String toString() {
      return "GetPackageListRequest(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", timeType=" + this.getTimeType() + ", packageType=" + this.getPackageType() + ", packageStatus=" + this.getPackageStatus() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }
}
