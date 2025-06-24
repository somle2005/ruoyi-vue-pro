package com.xiaohongshu.fls.opensdk.entity.packages.response;

import java.util.ArrayList;
import java.util.List;

public class GetCancelApplyListResponse {
   public int total;
   public int pageNo;
   public int pageSize;
   public boolean hasNext;
   public List<CancelRecord> cancelRecordList = new ArrayList();
   public int maxPageNo;

   public int getTotal() {
      return this.total;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public boolean isHasNext() {
      return this.hasNext;
   }

   public List<CancelRecord> getCancelRecordList() {
      return this.cancelRecordList;
   }

   public int getMaxPageNo() {
      return this.maxPageNo;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setHasNext(boolean hasNext) {
      this.hasNext = hasNext;
   }

   public void setCancelRecordList(List<CancelRecord> cancelRecordList) {
      this.cancelRecordList = cancelRecordList;
   }

   public void setMaxPageNo(int maxPageNo) {
      this.maxPageNo = maxPageNo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCancelApplyListResponse)) {
         return false;
      } else {
         GetCancelApplyListResponse other = (GetCancelApplyListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.isHasNext() != other.isHasNext()) {
            return false;
         } else if (this.getMaxPageNo() != other.getMaxPageNo()) {
            return false;
         } else {
            Object this$cancelRecordList = this.getCancelRecordList();
            Object other$cancelRecordList = other.getCancelRecordList();
            if (this$cancelRecordList == null) {
               if (other$cancelRecordList != null) {
                  return false;
               }
            } else if (!this$cancelRecordList.equals(other$cancelRecordList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCancelApplyListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getTotal();
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      result = result * 59 + (this.isHasNext() ? 79 : 97);
      result = result * 59 + this.getMaxPageNo();
      Object $cancelRecordList = this.getCancelRecordList();
      result = result * 59 + ($cancelRecordList == null ? 43 : $cancelRecordList.hashCode());
      return result;
   }

   public String toString() {
      return "GetCancelApplyListResponse(total=" + this.getTotal() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", hasNext=" + this.isHasNext() + ", cancelRecordList=" + this.getCancelRecordList() + ", maxPageNo=" + this.getMaxPageNo() + ")";
   }

   public static class CancelRecord {
      public String packageId;
      public long createdTime;
      public int status;
      public String cancelReason;
      public long auditTime;
      public long lastAuditTime;
      public String logistics;
      public String auditResult;
      public String auditReason;
      public String cancelId;
      public long updateTime;
      public String operator;

      public String getPackageId() {
         return this.packageId;
      }

      public long getCreatedTime() {
         return this.createdTime;
      }

      public int getStatus() {
         return this.status;
      }

      public String getCancelReason() {
         return this.cancelReason;
      }

      public long getAuditTime() {
         return this.auditTime;
      }

      public long getLastAuditTime() {
         return this.lastAuditTime;
      }

      public String getLogistics() {
         return this.logistics;
      }

      public String getAuditResult() {
         return this.auditResult;
      }

      public String getAuditReason() {
         return this.auditReason;
      }

      public String getCancelId() {
         return this.cancelId;
      }

      public long getUpdateTime() {
         return this.updateTime;
      }

      public String getOperator() {
         return this.operator;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setCreatedTime(long createdTime) {
         this.createdTime = createdTime;
      }

      public void setStatus(int status) {
         this.status = status;
      }

      public void setCancelReason(String cancelReason) {
         this.cancelReason = cancelReason;
      }

      public void setAuditTime(long auditTime) {
         this.auditTime = auditTime;
      }

      public void setLastAuditTime(long lastAuditTime) {
         this.lastAuditTime = lastAuditTime;
      }

      public void setLogistics(String logistics) {
         this.logistics = logistics;
      }

      public void setAuditResult(String auditResult) {
         this.auditResult = auditResult;
      }

      public void setAuditReason(String auditReason) {
         this.auditReason = auditReason;
      }

      public void setCancelId(String cancelId) {
         this.cancelId = cancelId;
      }

      public void setUpdateTime(long updateTime) {
         this.updateTime = updateTime;
      }

      public void setOperator(String operator) {
         this.operator = operator;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof CancelRecord)) {
            return false;
         } else {
            CancelRecord other = (CancelRecord)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getCreatedTime() != other.getCreatedTime()) {
               return false;
            } else if (this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.getAuditTime() != other.getAuditTime()) {
               return false;
            } else if (this.getLastAuditTime() != other.getLastAuditTime()) {
               return false;
            } else if (this.getUpdateTime() != other.getUpdateTime()) {
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

               Object this$cancelReason = this.getCancelReason();
               Object other$cancelReason = other.getCancelReason();
               if (this$cancelReason == null) {
                  if (other$cancelReason != null) {
                     return false;
                  }
               } else if (!this$cancelReason.equals(other$cancelReason)) {
                  return false;
               }

               Object this$logistics = this.getLogistics();
               Object other$logistics = other.getLogistics();
               if (this$logistics == null) {
                  if (other$logistics != null) {
                     return false;
                  }
               } else if (!this$logistics.equals(other$logistics)) {
                  return false;
               }

               Object this$auditResult = this.getAuditResult();
               Object other$auditResult = other.getAuditResult();
               if (this$auditResult == null) {
                  if (other$auditResult != null) {
                     return false;
                  }
               } else if (!this$auditResult.equals(other$auditResult)) {
                  return false;
               }

               Object this$auditReason = this.getAuditReason();
               Object other$auditReason = other.getAuditReason();
               if (this$auditReason == null) {
                  if (other$auditReason != null) {
                     return false;
                  }
               } else if (!this$auditReason.equals(other$auditReason)) {
                  return false;
               }

               Object this$cancelId = this.getCancelId();
               Object other$cancelId = other.getCancelId();
               if (this$cancelId == null) {
                  if (other$cancelId != null) {
                     return false;
                  }
               } else if (!this$cancelId.equals(other$cancelId)) {
                  return false;
               }

               Object this$operator = this.getOperator();
               Object other$operator = other.getOperator();
               if (this$operator == null) {
                  if (other$operator != null) {
                     return false;
                  }
               } else if (!this$operator.equals(other$operator)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof CancelRecord;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $createdTime = this.getCreatedTime();
         result = result * 59 + (int)($createdTime >>> 32 ^ $createdTime);
         result = result * 59 + this.getStatus();
         long $auditTime = this.getAuditTime();
         result = result * 59 + (int)($auditTime >>> 32 ^ $auditTime);
         long $lastAuditTime = this.getLastAuditTime();
         result = result * 59 + (int)($lastAuditTime >>> 32 ^ $lastAuditTime);
         long $updateTime = this.getUpdateTime();
         result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $cancelReason = this.getCancelReason();
         result = result * 59 + ($cancelReason == null ? 43 : $cancelReason.hashCode());
         Object $logistics = this.getLogistics();
         result = result * 59 + ($logistics == null ? 43 : $logistics.hashCode());
         Object $auditResult = this.getAuditResult();
         result = result * 59 + ($auditResult == null ? 43 : $auditResult.hashCode());
         Object $auditReason = this.getAuditReason();
         result = result * 59 + ($auditReason == null ? 43 : $auditReason.hashCode());
         Object $cancelId = this.getCancelId();
         result = result * 59 + ($cancelId == null ? 43 : $cancelId.hashCode());
         Object $operator = this.getOperator();
         result = result * 59 + ($operator == null ? 43 : $operator.hashCode());
         return result;
      }

      public String toString() {
         return "GetCancelApplyListResponse.CancelRecord(packageId=" + this.getPackageId() + ", createdTime=" + this.getCreatedTime() + ", status=" + this.getStatus() + ", cancelReason=" + this.getCancelReason() + ", auditTime=" + this.getAuditTime() + ", lastAuditTime=" + this.getLastAuditTime() + ", logistics=" + this.getLogistics() + ", auditResult=" + this.getAuditResult() + ", auditReason=" + this.getAuditReason() + ", cancelId=" + this.getCancelId() + ", updateTime=" + this.getUpdateTime() + ", operator=" + this.getOperator() + ")";
      }
   }
}
