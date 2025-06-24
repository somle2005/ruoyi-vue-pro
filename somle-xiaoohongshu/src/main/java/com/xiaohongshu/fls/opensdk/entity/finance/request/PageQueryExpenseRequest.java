package com.xiaohongshu.fls.opensdk.entity.finance.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class PageQueryExpenseRequest extends BaseRequest {
   public Integer baseBizType;
   public Long startTime;
   public Long endTime;
   public Integer settleStatus;
   public Integer pageNum;
   public Integer pageSize;

   public Integer getBaseBizType() {
      return this.baseBizType;
   }

   public Long getStartTime() {
      return this.startTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public Integer getSettleStatus() {
      return this.settleStatus;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setBaseBizType(Integer baseBizType) {
      this.baseBizType = baseBizType;
   }

   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public void setSettleStatus(Integer settleStatus) {
      this.settleStatus = settleStatus;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PageQueryExpenseRequest)) {
         return false;
      } else {
         PageQueryExpenseRequest other = (PageQueryExpenseRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$baseBizType = this.getBaseBizType();
            Object other$baseBizType = other.getBaseBizType();
            if (this$baseBizType == null) {
               if (other$baseBizType != null) {
                  return false;
               }
            } else if (!this$baseBizType.equals(other$baseBizType)) {
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

            Object this$settleStatus = this.getSettleStatus();
            Object other$settleStatus = other.getSettleStatus();
            if (this$settleStatus == null) {
               if (other$settleStatus != null) {
                  return false;
               }
            } else if (!this$settleStatus.equals(other$settleStatus)) {
               return false;
            }

            Object this$pageNum = this.getPageNum();
            Object other$pageNum = other.getPageNum();
            if (this$pageNum == null) {
               if (other$pageNum != null) {
                  return false;
               }
            } else if (!this$pageNum.equals(other$pageNum)) {
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
      return other instanceof PageQueryExpenseRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $baseBizType = this.getBaseBizType();
      result = result * 59 + ($baseBizType == null ? 43 : $baseBizType.hashCode());
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $endTime = this.getEndTime();
      result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
      Object $settleStatus = this.getSettleStatus();
      result = result * 59 + ($settleStatus == null ? 43 : $settleStatus.hashCode());
      Object $pageNum = this.getPageNum();
      result = result * 59 + ($pageNum == null ? 43 : $pageNum.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      return result;
   }

   public String toString() {
      return "PageQueryExpenseRequest(baseBizType=" + this.getBaseBizType() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", settleStatus=" + this.getSettleStatus() + ", pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ")";
   }
}
