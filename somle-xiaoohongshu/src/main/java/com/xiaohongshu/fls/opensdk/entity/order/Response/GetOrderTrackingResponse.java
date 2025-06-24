package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.List;

public class GetOrderTrackingResponse {
   public List<OrderTrackInfo> orderTrackInfos;

   public List<OrderTrackInfo> getOrderTrackInfos() {
      return this.orderTrackInfos;
   }

   public void setOrderTrackInfos(List<OrderTrackInfo> orderTrackInfos) {
      this.orderTrackInfos = orderTrackInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetOrderTrackingResponse)) {
         return false;
      } else {
         GetOrderTrackingResponse other = (GetOrderTrackingResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$orderTrackInfos = this.getOrderTrackInfos();
            Object other$orderTrackInfos = other.getOrderTrackInfos();
            if (this$orderTrackInfos == null) {
               if (other$orderTrackInfos != null) {
                  return false;
               }
            } else if (!this$orderTrackInfos.equals(other$orderTrackInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetOrderTrackingResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $orderTrackInfos = this.getOrderTrackInfos();
      result = result * 59 + ($orderTrackInfos == null ? 43 : $orderTrackInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderTrackingResponse(orderTrackInfos=" + this.getOrderTrackInfos() + ")";
   }
}
