package com.xiaohongshu.fls.opensdk.entity.invoice.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.Arrays;

public class ConfirmInvoiceRequest extends BaseRequest {
   public String xhsInvoiceNo;
   public String refNo;
   public Integer invoiceType;
   public byte[] file;
   public String invoiceNo;
   public String operatorId;
   public String operatorName;

   public String getXhsInvoiceNo() {
      return this.xhsInvoiceNo;
   }

   public String getRefNo() {
      return this.refNo;
   }

   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   public byte[] getFile() {
      return this.file;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
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

   public void setRefNo(String refNo) {
      this.refNo = refNo;
   }

   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   public void setFile(byte[] file) {
      this.file = file;
   }

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
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
      } else if (!(o instanceof ConfirmInvoiceRequest)) {
         return false;
      } else {
         ConfirmInvoiceRequest other = (ConfirmInvoiceRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$invoiceType = this.getInvoiceType();
            Object other$invoiceType = other.getInvoiceType();
            if (this$invoiceType == null) {
               if (other$invoiceType != null) {
                  return false;
               }
            } else if (!this$invoiceType.equals(other$invoiceType)) {
               return false;
            }

            Object this$xhsInvoiceNo = this.getXhsInvoiceNo();
            Object other$xhsInvoiceNo = other.getXhsInvoiceNo();
            if (this$xhsInvoiceNo == null) {
               if (other$xhsInvoiceNo != null) {
                  return false;
               }
            } else if (!this$xhsInvoiceNo.equals(other$xhsInvoiceNo)) {
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

            if (!Arrays.equals(this.getFile(), other.getFile())) {
               return false;
            } else {
               Object this$invoiceNo = this.getInvoiceNo();
               Object other$invoiceNo = other.getInvoiceNo();
               if (this$invoiceNo == null) {
                  if (other$invoiceNo != null) {
                     return false;
                  }
               } else if (!this$invoiceNo.equals(other$invoiceNo)) {
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
   }

   protected boolean canEqual(Object other) {
      return other instanceof ConfirmInvoiceRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $invoiceType = this.getInvoiceType();
      result = result * 59 + ($invoiceType == null ? 43 : $invoiceType.hashCode());
      Object $xhsInvoiceNo = this.getXhsInvoiceNo();
      result = result * 59 + ($xhsInvoiceNo == null ? 43 : $xhsInvoiceNo.hashCode());
      Object $refNo = this.getRefNo();
      result = result * 59 + ($refNo == null ? 43 : $refNo.hashCode());
      result = result * 59 + Arrays.hashCode(this.getFile());
      Object $invoiceNo = this.getInvoiceNo();
      result = result * 59 + ($invoiceNo == null ? 43 : $invoiceNo.hashCode());
      Object $operatorId = this.getOperatorId();
      result = result * 59 + ($operatorId == null ? 43 : $operatorId.hashCode());
      Object $operatorName = this.getOperatorName();
      result = result * 59 + ($operatorName == null ? 43 : $operatorName.hashCode());
      return result;
   }

   public String toString() {
      return "ConfirmInvoiceRequest(xhsInvoiceNo=" + this.getXhsInvoiceNo() + ", refNo=" + this.getRefNo() + ", invoiceType=" + this.getInvoiceType() + ", file=" + Arrays.toString(this.getFile()) + ", invoiceNo=" + this.getInvoiceNo() + ", operatorId=" + this.getOperatorId() + ", operatorName=" + this.getOperatorName() + ")";
   }
}
