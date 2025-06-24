package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class AuditCancelApplyRequest extends BaseRequest {
   public String packageId;
   public Integer auditType;
   public String refuseReason;
   public String operator;

   public String getPackageId() {
      return this.packageId;
   }

   public Integer getAuditType() {
      return this.auditType;
   }

   public String getRefuseReason() {
      return this.refuseReason;
   }

   public String getOperator() {
      return this.operator;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setAuditType(Integer auditType) {
      this.auditType = auditType;
   }

   public void setRefuseReason(String refuseReason) {
      this.refuseReason = refuseReason;
   }

   public void setOperator(String operator) {
      this.operator = operator;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AuditCancelApplyRequest)) {
         return false;
      } else {
         AuditCancelApplyRequest other = (AuditCancelApplyRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$auditType = this.getAuditType();
            Object other$auditType = other.getAuditType();
            if (this$auditType == null) {
               if (other$auditType != null) {
                  return false;
               }
            } else if (!this$auditType.equals(other$auditType)) {
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

            Object this$refuseReason = this.getRefuseReason();
            Object other$refuseReason = other.getRefuseReason();
            if (this$refuseReason == null) {
               if (other$refuseReason != null) {
                  return false;
               }
            } else if (!this$refuseReason.equals(other$refuseReason)) {
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
      return other instanceof AuditCancelApplyRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $auditType = this.getAuditType();
      result = result * 59 + ($auditType == null ? 43 : $auditType.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      Object $refuseReason = this.getRefuseReason();
      result = result * 59 + ($refuseReason == null ? 43 : $refuseReason.hashCode());
      Object $operator = this.getOperator();
      result = result * 59 + ($operator == null ? 43 : $operator.hashCode());
      return result;
   }

   public String toString() {
      return "AuditCancelApplyRequest(packageId=" + this.getPackageId() + ", auditType=" + this.getAuditType() + ", refuseReason=" + this.getRefuseReason() + ", operator=" + this.getOperator() + ")";
   }
}
