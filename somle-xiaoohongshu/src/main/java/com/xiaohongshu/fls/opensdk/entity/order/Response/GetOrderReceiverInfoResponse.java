package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.List;

public class GetOrderReceiverInfoResponse {
   public List<OrderReceiverInfo> receiverInfos;

   public List<OrderReceiverInfo> getReceiverInfos() {
      return this.receiverInfos;
   }

   public void setReceiverInfos(List<OrderReceiverInfo> receiverInfos) {
      this.receiverInfos = receiverInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetOrderReceiverInfoResponse)) {
         return false;
      } else {
         GetOrderReceiverInfoResponse other = (GetOrderReceiverInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$receiverInfos = this.getReceiverInfos();
            Object other$receiverInfos = other.getReceiverInfos();
            if (this$receiverInfos == null) {
               if (other$receiverInfos != null) {
                  return false;
               }
            } else if (!this$receiverInfos.equals(other$receiverInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetOrderReceiverInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $receiverInfos = this.getReceiverInfos();
      result = result * 59 + ($receiverInfos == null ? 43 : $receiverInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderReceiverInfoResponse(receiverInfos=" + this.getReceiverInfos() + ")";
   }
}
