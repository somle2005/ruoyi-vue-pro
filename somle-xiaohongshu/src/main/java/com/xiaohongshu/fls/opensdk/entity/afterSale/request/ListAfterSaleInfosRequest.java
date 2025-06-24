package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class ListAfterSaleInfosRequest extends BaseRequest {
   public String orderId;
   public Integer pageNo;
   public Integer pageSize;
   public Long startTime;
   public Long endTime;
   public Integer timeType;
   public List<Integer> returnTypes;
   public List<Integer> statuses;

   public String getOrderId() {
      return this.orderId;
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

   public List<Integer> getReturnTypes() {
      return this.returnTypes;
   }

   public List<Integer> getStatuses() {
      return this.statuses;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
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

   public void setReturnTypes(List<Integer> returnTypes) {
      this.returnTypes = returnTypes;
   }

   public void setStatuses(List<Integer> statuses) {
      this.statuses = statuses;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ListAfterSaleInfosRequest)) {
         return false;
      } else {
         ListAfterSaleInfosRequest other = (ListAfterSaleInfosRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
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

            Object this$orderId = this.getOrderId();
            Object other$orderId = other.getOrderId();
            if (this$orderId == null) {
               if (other$orderId != null) {
                  return false;
               }
            } else if (!this$orderId.equals(other$orderId)) {
               return false;
            }

            Object this$returnTypes = this.getReturnTypes();
            Object other$returnTypes = other.getReturnTypes();
            if (this$returnTypes == null) {
               if (other$returnTypes != null) {
                  return false;
               }
            } else if (!this$returnTypes.equals(other$returnTypes)) {
               return false;
            }

            Object this$statuses = this.getStatuses();
            Object other$statuses = other.getStatuses();
            if (this$statuses == null) {
               if (other$statuses != null) {
                  return false;
               }
            } else if (!this$statuses.equals(other$statuses)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ListAfterSaleInfosRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
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
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $returnTypes = this.getReturnTypes();
      result = result * 59 + ($returnTypes == null ? 43 : $returnTypes.hashCode());
      Object $statuses = this.getStatuses();
      result = result * 59 + ($statuses == null ? 43 : $statuses.hashCode());
      return result;
   }

   public String toString() {
      return "ListAfterSaleInfosRequest(orderId=" + this.getOrderId() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", timeType=" + this.getTimeType() + ", returnTypes=" + this.getReturnTypes() + ", statuses=" + this.getStatuses() + ")";
   }
}
