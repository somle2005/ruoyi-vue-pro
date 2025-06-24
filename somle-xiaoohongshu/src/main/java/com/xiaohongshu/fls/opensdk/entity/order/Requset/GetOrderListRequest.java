package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import lombok.Builder;

@Builder
public class GetOrderListRequest extends BaseRequest {
   public Long startTime;
   public Long endTime;
   public Integer timeType;
   public Integer orderType;
   public Integer orderStatus;
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

   public Integer getOrderType() {
      return this.orderType;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
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

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
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
      } else if (!(o instanceof GetOrderListRequest)) {
         return false;
      } else {
         GetOrderListRequest other = (GetOrderListRequest)o;
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

            Object this$orderType = this.getOrderType();
            Object other$orderType = other.getOrderType();
            if (this$orderType == null) {
               if (other$orderType != null) {
                  return false;
               }
            } else if (!this$orderType.equals(other$orderType)) {
               return false;
            }

            Object this$orderStatus = this.getOrderStatus();
            Object other$orderStatus = other.getOrderStatus();
            if (this$orderStatus == null) {
               if (other$orderStatus != null) {
                  return false;
               }
            } else if (!this$orderStatus.equals(other$orderStatus)) {
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
      return other instanceof GetOrderListRequest;
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
      Object $orderType = this.getOrderType();
      result = result * 59 + ($orderType == null ? 43 : $orderType.hashCode());
      Object $orderStatus = this.getOrderStatus();
      result = result * 59 + ($orderStatus == null ? 43 : $orderStatus.hashCode());
      Object $pageNo = this.getPageNo();
      result = result * 59 + ($pageNo == null ? 43 : $pageNo.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderListRequest(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", timeType=" + this.getTimeType() + ", orderType=" + this.getOrderType() + ", orderStatus=" + this.getOrderStatus() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }
}
