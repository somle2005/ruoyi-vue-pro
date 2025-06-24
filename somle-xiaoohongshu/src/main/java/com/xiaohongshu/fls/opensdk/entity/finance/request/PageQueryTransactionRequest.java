package com.xiaohongshu.fls.opensdk.entity.finance.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class PageQueryTransactionRequest extends BaseRequest {
   public Integer settleBizType;
   public Long startTime;
   public Long endTime;
   public Integer erqingType;
   public Integer commonSettleStatus;
   public Integer pageNum;
   public Integer pageSize;
   public Boolean shouldLoadGoodsInfo;

   public Integer getSettleBizType() {
      return this.settleBizType;
   }

   public Long getStartTime() {
      return this.startTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public Integer getErqingType() {
      return this.erqingType;
   }

   public Integer getCommonSettleStatus() {
      return this.commonSettleStatus;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public Boolean getShouldLoadGoodsInfo() {
      return this.shouldLoadGoodsInfo;
   }

   public void setSettleBizType(Integer settleBizType) {
      this.settleBizType = settleBizType;
   }

   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public void setErqingType(Integer erqingType) {
      this.erqingType = erqingType;
   }

   public void setCommonSettleStatus(Integer commonSettleStatus) {
      this.commonSettleStatus = commonSettleStatus;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public void setShouldLoadGoodsInfo(Boolean shouldLoadGoodsInfo) {
      this.shouldLoadGoodsInfo = shouldLoadGoodsInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PageQueryTransactionRequest)) {
         return false;
      } else {
         PageQueryTransactionRequest other = (PageQueryTransactionRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$settleBizType = this.getSettleBizType();
            Object other$settleBizType = other.getSettleBizType();
            if (this$settleBizType == null) {
               if (other$settleBizType != null) {
                  return false;
               }
            } else if (!this$settleBizType.equals(other$settleBizType)) {
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

            Object this$erqingType = this.getErqingType();
            Object other$erqingType = other.getErqingType();
            if (this$erqingType == null) {
               if (other$erqingType != null) {
                  return false;
               }
            } else if (!this$erqingType.equals(other$erqingType)) {
               return false;
            }

            Object this$commonSettleStatus = this.getCommonSettleStatus();
            Object other$commonSettleStatus = other.getCommonSettleStatus();
            if (this$commonSettleStatus == null) {
               if (other$commonSettleStatus != null) {
                  return false;
               }
            } else if (!this$commonSettleStatus.equals(other$commonSettleStatus)) {
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

            Object this$shouldLoadGoodsInfo = this.getShouldLoadGoodsInfo();
            Object other$shouldLoadGoodsInfo = other.getShouldLoadGoodsInfo();
            if (this$shouldLoadGoodsInfo == null) {
               if (other$shouldLoadGoodsInfo != null) {
                  return false;
               }
            } else if (!this$shouldLoadGoodsInfo.equals(other$shouldLoadGoodsInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PageQueryTransactionRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $settleBizType = this.getSettleBizType();
      result = result * 59 + ($settleBizType == null ? 43 : $settleBizType.hashCode());
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $endTime = this.getEndTime();
      result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
      Object $erqingType = this.getErqingType();
      result = result * 59 + ($erqingType == null ? 43 : $erqingType.hashCode());
      Object $commonSettleStatus = this.getCommonSettleStatus();
      result = result * 59 + ($commonSettleStatus == null ? 43 : $commonSettleStatus.hashCode());
      Object $pageNum = this.getPageNum();
      result = result * 59 + ($pageNum == null ? 43 : $pageNum.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $shouldLoadGoodsInfo = this.getShouldLoadGoodsInfo();
      result = result * 59 + ($shouldLoadGoodsInfo == null ? 43 : $shouldLoadGoodsInfo.hashCode());
      return result;
   }

   public String toString() {
      return "PageQueryTransactionRequest(settleBizType=" + this.getSettleBizType() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", erqingType=" + this.getErqingType() + ", commonSettleStatus=" + this.getCommonSettleStatus() + ", pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", shouldLoadGoodsInfo=" + this.getShouldLoadGoodsInfo() + ")";
   }
}
