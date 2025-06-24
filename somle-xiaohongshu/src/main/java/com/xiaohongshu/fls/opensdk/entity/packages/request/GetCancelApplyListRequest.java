package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetCancelApplyListRequest extends BaseRequest {
   public Integer logistics;
   public Integer status;
   public Integer pageNo;
   public Integer pageSize;
   public Long startTime;
   public Long endTime;
   public Integer timeType;
   public Boolean useHasNext;
   public String packageId;

   public Integer getLogistics() {
      return this.logistics;
   }

   public Integer getStatus() {
      return this.status;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public Long getStartTime() {
      return this.startTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public Integer getTimeType() {
      return this.timeType;
   }

   public Boolean getUseHasNext() {
      return this.useHasNext;
   }

   public String getPackageId() {
      return this.packageId;
   }

   public void setLogistics(Integer logistics) {
      this.logistics = logistics;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
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

   public void setUseHasNext(Boolean useHasNext) {
      this.useHasNext = useHasNext;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCancelApplyListRequest)) {
         return false;
      } else {
         GetCancelApplyListRequest other = (GetCancelApplyListRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$logistics = this.getLogistics();
            Object other$logistics = other.getLogistics();
            if (this$logistics == null) {
               if (other$logistics != null) {
                  return false;
               }
            } else if (!this$logistics.equals(other$logistics)) {
               return false;
            }

            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
               if (other$status != null) {
                  return false;
               }
            } else if (!this$status.equals(other$status)) {
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

            Object this$useHasNext = this.getUseHasNext();
            Object other$useHasNext = other.getUseHasNext();
            if (this$useHasNext == null) {
               if (other$useHasNext != null) {
                  return false;
               }
            } else if (!this$useHasNext.equals(other$useHasNext)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCancelApplyListRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $logistics = this.getLogistics();
      result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $endTime = this.getEndTime();
      result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
      Object $timeType = this.getTimeType();
      result = result * 59 + ($timeType == null ? 43 : $timeType.hashCode());
      Object $useHasNext = this.getUseHasNext();
      result = result * 59 + ($useHasNext == null ? 43 : $useHasNext.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      return result;
   }

   public String toString() {
      return "GetCancelApplyListRequest(logistics=" + this.getLogistics() + ", status=" + this.getStatus() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", timeType=" + this.getTimeType() + ", useHasNext=" + this.getUseHasNext() + ", packageId=" + this.getPackageId() + ")";
   }
}
