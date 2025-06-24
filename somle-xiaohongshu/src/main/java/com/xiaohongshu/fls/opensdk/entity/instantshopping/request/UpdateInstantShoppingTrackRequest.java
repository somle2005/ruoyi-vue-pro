package com.xiaohongshu.fls.opensdk.entity.instantshopping.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.instantshopping.InstantShoppingTrackingDTO;
import java.util.List;

public class UpdateInstantShoppingTrackRequest extends BaseRequest {
   private String xhsOrderId;
   private String expressNo;
   private String expressCompanyCode;
   private List<InstantShoppingTrackingDTO> traces;

   public String getXhsOrderId() {
      return this.xhsOrderId;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public List<InstantShoppingTrackingDTO> getTraces() {
      return this.traces;
   }

   public void setXhsOrderId(String xhsOrderId) {
      this.xhsOrderId = xhsOrderId;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setTraces(List<InstantShoppingTrackingDTO> traces) {
      this.traces = traces;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateInstantShoppingTrackRequest)) {
         return false;
      } else {
         UpdateInstantShoppingTrackRequest other = (UpdateInstantShoppingTrackRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$xhsOrderId = this.getXhsOrderId();
            Object other$xhsOrderId = other.getXhsOrderId();
            if (this$xhsOrderId == null) {
               if (other$xhsOrderId != null) {
                  return false;
               }
            } else if (!this$xhsOrderId.equals(other$xhsOrderId)) {
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

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
               return false;
            }

            Object this$traces = this.getTraces();
            Object other$traces = other.getTraces();
            if (this$traces == null) {
               if (other$traces != null) {
                  return false;
               }
            } else if (!this$traces.equals(other$traces)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateInstantShoppingTrackRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $xhsOrderId = this.getXhsOrderId();
      result = result * 59 + ($xhsOrderId == null ? 43 : $xhsOrderId.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $traces = this.getTraces();
      result = result * 59 + ($traces == null ? 43 : $traces.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateInstantShoppingTrackRequest(xhsOrderId=" + this.getXhsOrderId() + ", expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", traces=" + this.getTraces() + ")";
   }
}
