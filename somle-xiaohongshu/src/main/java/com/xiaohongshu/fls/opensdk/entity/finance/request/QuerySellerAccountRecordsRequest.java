package com.xiaohongshu.fls.opensdk.entity.finance.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class QuerySellerAccountRecordsRequest extends BaseRequest {
   public Long startTime;
   public Long endTime;
   public String businessNo;
   public String refNo;
   public String debitType;
   public List<String> tradeTypes;
   public Integer pageNum;
   public Integer pageSize;
   public Integer fundType;

   public Long getStartTime() {
      return this.startTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public String getBusinessNo() {
      return this.businessNo;
   }

   public String getRefNo() {
      return this.refNo;
   }

   public String getDebitType() {
      return this.debitType;
   }

   public List<String> getTradeTypes() {
      return this.tradeTypes;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public Integer getFundType() {
      return this.fundType;
   }

   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public void setBusinessNo(String businessNo) {
      this.businessNo = businessNo;
   }

   public void setRefNo(String refNo) {
      this.refNo = refNo;
   }

   public void setDebitType(String debitType) {
      this.debitType = debitType;
   }

   public void setTradeTypes(List<String> tradeTypes) {
      this.tradeTypes = tradeTypes;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public void setFundType(Integer fundType) {
      this.fundType = fundType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof QuerySellerAccountRecordsRequest)) {
         return false;
      } else {
         QuerySellerAccountRecordsRequest other = (QuerySellerAccountRecordsRequest)o;
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

            Object this$fundType = this.getFundType();
            Object other$fundType = other.getFundType();
            if (this$fundType == null) {
               if (other$fundType != null) {
                  return false;
               }
            } else if (!this$fundType.equals(other$fundType)) {
               return false;
            }

            Object this$businessNo = this.getBusinessNo();
            Object other$businessNo = other.getBusinessNo();
            if (this$businessNo == null) {
               if (other$businessNo != null) {
                  return false;
               }
            } else if (!this$businessNo.equals(other$businessNo)) {
               return false;
            }

            Object this$refNo = this.getRefNo();
            Object other$refNo = other.getRefNo();
            if (this$refNo == null) {
               if (other$refNo != null) {
                  return false;
               }
            } else if (!this$refNo.equals(other$refNo)) {
               return false;
            }

            Object this$debitType = this.getDebitType();
            Object other$debitType = other.getDebitType();
            if (this$debitType == null) {
               if (other$debitType != null) {
                  return false;
               }
            } else if (!this$debitType.equals(other$debitType)) {
               return false;
            }

            Object this$tradeTypes = this.getTradeTypes();
            Object other$tradeTypes = other.getTradeTypes();
            if (this$tradeTypes == null) {
               if (other$tradeTypes != null) {
                  return false;
               }
            } else if (!this$tradeTypes.equals(other$tradeTypes)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof QuerySellerAccountRecordsRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $startTime = this.getStartTime();
      result = result * 59 + ($startTime == null ? 43 : $startTime.hashCode());
      Object $endTime = this.getEndTime();
      result = result * 59 + ($endTime == null ? 43 : $endTime.hashCode());
      Object $pageNum = this.getPageNum();
      result = result * 59 + ($pageNum == null ? 43 : $pageNum.hashCode());
      Object $pageSize = this.getPageSize();
      result = result * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
      Object $fundType = this.getFundType();
      result = result * 59 + ($fundType == null ? 43 : $fundType.hashCode());
      Object $businessNo = this.getBusinessNo();
      result = result * 59 + ($businessNo == null ? 43 : $businessNo.hashCode());
      Object $refNo = this.getRefNo();
      result = result * 59 + ($refNo == null ? 43 : $refNo.hashCode());
      Object $debitType = this.getDebitType();
      result = result * 59 + ($debitType == null ? 43 : $debitType.hashCode());
      Object $tradeTypes = this.getTradeTypes();
      result = result * 59 + ($tradeTypes == null ? 43 : $tradeTypes.hashCode());
      return result;
   }

   public String toString() {
      return "QuerySellerAccountRecordsRequest(startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", businessNo=" + this.getBusinessNo() + ", refNo=" + this.getRefNo() + ", debitType=" + this.getDebitType() + ", tradeTypes=" + this.getTradeTypes() + ", pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", fundType=" + this.getFundType() + ")";
   }
}
