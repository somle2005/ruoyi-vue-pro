package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class CreateTransferBatchRequest extends BaseRequest {
   public List<TransferOrderDTO> orders;
   public String planInfoId;

   public List<TransferOrderDTO> getOrders() {
      return this.orders;
   }

   public String getPlanInfoId() {
      return this.planInfoId;
   }

   public void setOrders(List<TransferOrderDTO> orders) {
      this.orders = orders;
   }

   public void setPlanInfoId(String planInfoId) {
      this.planInfoId = planInfoId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateTransferBatchRequest)) {
         return false;
      } else {
         CreateTransferBatchRequest other = (CreateTransferBatchRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$orders = this.getOrders();
            Object other$orders = other.getOrders();
            if (this$orders == null) {
               if (other$orders != null) {
                  return false;
               }
            } else if (!this$orders.equals(other$orders)) {
               return false;
            }

            Object this$planInfoId = this.getPlanInfoId();
            Object other$planInfoId = other.getPlanInfoId();
            if (this$planInfoId == null) {
               if (other$planInfoId != null) {
                  return false;
               }
            } else if (!this$planInfoId.equals(other$planInfoId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateTransferBatchRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $orders = this.getOrders();
      result = result * 59 + ($orders == null ? 43 : $orders.hashCode());
      Object $planInfoId = this.getPlanInfoId();
      result = result * 59 + ($planInfoId == null ? 43 : $planInfoId.hashCode());
      return result;
   }

   public String toString() {
      return "CreateTransferBatchRequest(orders=" + this.getOrders() + ", planInfoId=" + this.getPlanInfoId() + ")";
   }

   public static class TransferOrderDTO {
      public String orderId;
      public long weight;

      public String getOrderId() {
         return this.orderId;
      }

      public long getWeight() {
         return this.weight;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setWeight(long weight) {
         this.weight = weight;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof TransferOrderDTO)) {
            return false;
         } else {
            TransferOrderDTO other = (TransferOrderDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getWeight() != other.getWeight()) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof TransferOrderDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $weight = this.getWeight();
         result = result * 59 + (int)($weight >>> 32 ^ $weight);
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         return result;
      }

      public String toString() {
         return "CreateTransferBatchRequest.TransferOrderDTO(orderId=" + this.getOrderId() + ", weight=" + this.getWeight() + ")";
      }
   }
}
