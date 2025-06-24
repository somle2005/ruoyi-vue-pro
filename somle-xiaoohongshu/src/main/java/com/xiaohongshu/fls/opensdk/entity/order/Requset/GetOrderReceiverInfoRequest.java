package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class GetOrderReceiverInfoRequest extends BaseRequest {
   List<OrderReceiverQuery> receiverQueries;
   Boolean isReturn;

   public List<OrderReceiverQuery> getReceiverQueries() {
      return this.receiverQueries;
   }

   public Boolean getIsReturn() {
      return this.isReturn;
   }

   public void setReceiverQueries(List<OrderReceiverQuery> receiverQueries) {
      this.receiverQueries = receiverQueries;
   }

   public void setIsReturn(Boolean isReturn) {
      this.isReturn = isReturn;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetOrderReceiverInfoRequest)) {
         return false;
      } else {
         GetOrderReceiverInfoRequest other = (GetOrderReceiverInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$isReturn = this.getIsReturn();
            Object other$isReturn = other.getIsReturn();
            if (this$isReturn == null) {
               if (other$isReturn != null) {
                  return false;
               }
            } else if (!this$isReturn.equals(other$isReturn)) {
               return false;
            }

            Object this$receiverQueries = this.getReceiverQueries();
            Object other$receiverQueries = other.getReceiverQueries();
            if (this$receiverQueries == null) {
               if (other$receiverQueries != null) {
                  return false;
               }
            } else if (!this$receiverQueries.equals(other$receiverQueries)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetOrderReceiverInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $isReturn = this.getIsReturn();
      result = result * 59 + ($isReturn == null ? 43 : $isReturn.hashCode());
      Object $receiverQueries = this.getReceiverQueries();
      result = result * 59 + ($receiverQueries == null ? 43 : $receiverQueries.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderReceiverInfoRequest(receiverQueries=" + this.getReceiverQueries() + ", isReturn=" + this.getIsReturn() + ")";
   }

   public static class OrderReceiverQuery {
      public String orderId;
      public String openAddressId;

      public String getOrderId() {
         return this.orderId;
      }

      public String getOpenAddressId() {
         return this.openAddressId;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setOpenAddressId(String openAddressId) {
         this.openAddressId = openAddressId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OrderReceiverQuery)) {
            return false;
         } else {
            OrderReceiverQuery other = (OrderReceiverQuery)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$orderId = this.getOrderId();
               Object other$orderId = other.getOrderId();
               if (this$orderId == null) {
                  if (other$orderId != null) {
                     return false;
                  }
               } else if (!this$orderId.equals(other$orderId)) {
                  return false;
               }

               Object this$openAddressId = this.getOpenAddressId();
               Object other$openAddressId = other.getOpenAddressId();
               if (this$openAddressId == null) {
                  if (other$openAddressId != null) {
                     return false;
                  }
               } else if (!this$openAddressId.equals(other$openAddressId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OrderReceiverQuery;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         Object $openAddressId = this.getOpenAddressId();
         result = result * 59 + ($openAddressId == null ? 43 : $openAddressId.hashCode());
         return result;
      }

      public String toString() {
         return "GetOrderReceiverInfoRequest.OrderReceiverQuery(orderId=" + this.getOrderId() + ", openAddressId=" + this.getOpenAddressId() + ")";
      }
   }
}
