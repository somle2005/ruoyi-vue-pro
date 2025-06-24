package com.xiaohongshu.fls.opensdk.entity.order.Response;

public class CreateTransferBatchResponse {
   public String batchNo;
   public String message;
   public Integer successTotal;
   public Integer total;

   public String getBatchNo() {
      return this.batchNo;
   }

   public String getMessage() {
      return this.message;
   }

   public Integer getSuccessTotal() {
      return this.successTotal;
   }

   public Integer getTotal() {
      return this.total;
   }

   public void setBatchNo(String batchNo) {
      this.batchNo = batchNo;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public void setSuccessTotal(Integer successTotal) {
      this.successTotal = successTotal;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateTransferBatchResponse)) {
         return false;
      } else {
         CreateTransferBatchResponse other = (CreateTransferBatchResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$successTotal = this.getSuccessTotal();
            Object other$successTotal = other.getSuccessTotal();
            if (this$successTotal == null) {
               if (other$successTotal != null) {
                  return false;
               }
            } else if (!this$successTotal.equals(other$successTotal)) {
               return false;
            }

            Object this$total = this.getTotal();
            Object other$total = other.getTotal();
            if (this$total == null) {
               if (other$total != null) {
                  return false;
               }
            } else if (!this$total.equals(other$total)) {
               return false;
            }

            Object this$batchNo = this.getBatchNo();
            Object other$batchNo = other.getBatchNo();
            if (this$batchNo == null) {
               if (other$batchNo != null) {
                  return false;
               }
            } else if (!this$batchNo.equals(other$batchNo)) {
               return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
               if (other$message != null) {
                  return false;
               }
            } else if (!this$message.equals(other$message)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateTransferBatchResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $successTotal = this.getSuccessTotal();
      result = result * 59 + ($successTotal == null ? 43 : $successTotal.hashCode());
      Object $total = this.getTotal();
      result = result * 59 + ($total == null ? 43 : $total.hashCode());
      Object $batchNo = this.getBatchNo();
      result = result * 59 + ($batchNo == null ? 43 : $batchNo.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      return result;
   }

   public String toString() {
      return "CreateTransferBatchResponse(batchNo=" + this.getBatchNo() + ", message=" + this.getMessage() + ", successTotal=" + this.getSuccessTotal() + ", total=" + this.getTotal() + ")";
   }
}
