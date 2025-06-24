package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ReceiveAndShipRequest extends BaseRequest {
   public String returnsId;
   public String expressCompanyCode;
   public String expressNo;

   public String getReturnsId() {
      return this.returnsId;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReceiveAndShipRequest)) {
         return false;
      } else {
         ReceiveAndShipRequest other = (ReceiveAndShipRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$returnsId = this.getReturnsId();
            Object other$returnsId = other.getReturnsId();
            if (this$returnsId == null) {
               if (other$returnsId != null) {
                  return false;
               }
            } else if (!this$returnsId.equals(other$returnsId)) {
               return false;
            }

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
               return false;
            }

            Object this$expressNo = this.getExpressNo();
            Object other$expressNo = other.getExpressNo();
            if (this$expressNo == null) {
               if (other$expressNo != null) {
                  return false;
               }
            } else if (!this$expressNo.equals(other$expressNo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ReceiveAndShipRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      return result;
   }

   public String toString() {
      return "ReceiveAndShipRequest(returnsId=" + this.getReturnsId() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressNo=" + this.getExpressNo() + ")";
   }
}
