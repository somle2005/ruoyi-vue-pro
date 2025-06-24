package com.xiaohongshu.fls.opensdk.entity.invoice.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ReverseInvoiceRequest extends BaseRequest {
   public String xhsInvoiceNo;
   public String operatorId;
   public String operatorName;

   public String getXhsInvoiceNo() {
      return this.xhsInvoiceNo;
   }

   public String getOperatorId() {
      return this.operatorId;
   }

   public String getOperatorName() {
      return this.operatorName;
   }

   public void setXhsInvoiceNo(String xhsInvoiceNo) {
      this.xhsInvoiceNo = xhsInvoiceNo;
   }

   public void setOperatorId(String operatorId) {
      this.operatorId = operatorId;
   }

   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReverseInvoiceRequest)) {
         return false;
      } else {
         ReverseInvoiceRequest other = (ReverseInvoiceRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$xhsInvoiceNo = this.getXhsInvoiceNo();
            Object other$xhsInvoiceNo = other.getXhsInvoiceNo();
            if (this$xhsInvoiceNo == null) {
               if (other$xhsInvoiceNo != null) {
                  return false;
               }
            } else if (!this$xhsInvoiceNo.equals(other$xhsInvoiceNo)) {
               return false;
            }

            Object this$operatorId = this.getOperatorId();
            Object other$operatorId = other.getOperatorId();
            if (this$operatorId == null) {
               if (other$operatorId != null) {
                  return false;
               }
            } else if (!this$operatorId.equals(other$operatorId)) {
               return false;
            }

            Object this$operatorName = this.getOperatorName();
            Object other$operatorName = other.getOperatorName();
            if (this$operatorName == null) {
               if (other$operatorName != null) {
                  return false;
               }
            } else if (!this$operatorName.equals(other$operatorName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ReverseInvoiceRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $xhsInvoiceNo = this.getXhsInvoiceNo();
      result = result * 59 + ($xhsInvoiceNo == null ? 43 : $xhsInvoiceNo.hashCode());
      Object $operatorId = this.getOperatorId();
      result = result * 59 + ($operatorId == null ? 43 : $operatorId.hashCode());
      Object $operatorName = this.getOperatorName();
      result = result * 59 + ($operatorName == null ? 43 : $operatorName.hashCode());
      return result;
   }

   public String toString() {
      return "ReverseInvoiceRequest(xhsInvoiceNo=" + this.getXhsInvoiceNo() + ", operatorId=" + this.getOperatorId() + ", operatorName=" + this.getOperatorName() + ")";
   }
}
