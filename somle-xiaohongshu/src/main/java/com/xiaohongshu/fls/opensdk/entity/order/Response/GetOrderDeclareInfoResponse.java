package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.ArrayList;
import java.util.List;

public class GetOrderDeclareInfoResponse {
   public List<OrderDeclareInfo> orderDeclareInfos = new ArrayList();

   public List<OrderDeclareInfo> getOrderDeclareInfos() {
      return this.orderDeclareInfos;
   }

   public void setOrderDeclareInfos(List<OrderDeclareInfo> orderDeclareInfos) {
      this.orderDeclareInfos = orderDeclareInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetOrderDeclareInfoResponse)) {
         return false;
      } else {
         GetOrderDeclareInfoResponse other = (GetOrderDeclareInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$orderDeclareInfos = this.getOrderDeclareInfos();
            Object other$orderDeclareInfos = other.getOrderDeclareInfos();
            if (this$orderDeclareInfos == null) {
               if (other$orderDeclareInfos != null) {
                  return false;
               }
            } else if (!this$orderDeclareInfos.equals(other$orderDeclareInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetOrderDeclareInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $orderDeclareInfos = this.getOrderDeclareInfos();
      result = result * 59 + ($orderDeclareInfos == null ? 43 : $orderDeclareInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderDeclareInfoResponse(orderDeclareInfos=" + this.getOrderDeclareInfos() + ")";
   }

   public static class OrderDeclareInfo {
      public String orderId;
      public String idName;
      public String idNumber;
      public String linkPhone;
      public String frontUrl;
      public String backUrl;
      public String type;

      public String getOrderId() {
         return this.orderId;
      }

      public String getIdName() {
         return this.idName;
      }

      public String getIdNumber() {
         return this.idNumber;
      }

      public String getLinkPhone() {
         return this.linkPhone;
      }

      public String getFrontUrl() {
         return this.frontUrl;
      }

      public String getBackUrl() {
         return this.backUrl;
      }

      public String getType() {
         return this.type;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setIdName(String idName) {
         this.idName = idName;
      }

      public void setIdNumber(String idNumber) {
         this.idNumber = idNumber;
      }

      public void setLinkPhone(String linkPhone) {
         this.linkPhone = linkPhone;
      }

      public void setFrontUrl(String frontUrl) {
         this.frontUrl = frontUrl;
      }

      public void setBackUrl(String backUrl) {
         this.backUrl = backUrl;
      }

      public void setType(String type) {
         this.type = type;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OrderDeclareInfo)) {
            return false;
         } else {
            OrderDeclareInfo other = (OrderDeclareInfo)o;
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

               Object this$idName = this.getIdName();
               Object other$idName = other.getIdName();
               if (this$idName == null) {
                  if (other$idName != null) {
                     return false;
                  }
               } else if (!this$idName.equals(other$idName)) {
                  return false;
               }

               Object this$idNumber = this.getIdNumber();
               Object other$idNumber = other.getIdNumber();
               if (this$idNumber == null) {
                  if (other$idNumber != null) {
                     return false;
                  }
               } else if (!this$idNumber.equals(other$idNumber)) {
                  return false;
               }

               Object this$linkPhone = this.getLinkPhone();
               Object other$linkPhone = other.getLinkPhone();
               if (this$linkPhone == null) {
                  if (other$linkPhone != null) {
                     return false;
                  }
               } else if (!this$linkPhone.equals(other$linkPhone)) {
                  return false;
               }

               Object this$frontUrl = this.getFrontUrl();
               Object other$frontUrl = other.getFrontUrl();
               if (this$frontUrl == null) {
                  if (other$frontUrl != null) {
                     return false;
                  }
               } else if (!this$frontUrl.equals(other$frontUrl)) {
                  return false;
               }

               Object this$backUrl = this.getBackUrl();
               Object other$backUrl = other.getBackUrl();
               if (this$backUrl == null) {
                  if (other$backUrl != null) {
                     return false;
                  }
               } else if (!this$backUrl.equals(other$backUrl)) {
                  return false;
               }

               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type != null) {
                     return false;
                  }
               } else if (!this$type.equals(other$type)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OrderDeclareInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         Object $idName = this.getIdName();
         result = result * 59 + ($idName == null ? 43 : $idName.hashCode());
         Object $idNumber = this.getIdNumber();
         result = result * 59 + ($idNumber == null ? 43 : $idNumber.hashCode());
         Object $linkPhone = this.getLinkPhone();
         result = result * 59 + ($linkPhone == null ? 43 : $linkPhone.hashCode());
         Object $frontUrl = this.getFrontUrl();
         result = result * 59 + ($frontUrl == null ? 43 : $frontUrl.hashCode());
         Object $backUrl = this.getBackUrl();
         result = result * 59 + ($backUrl == null ? 43 : $backUrl.hashCode());
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         return result;
      }

      public String toString() {
         return "GetOrderDeclareInfoResponse.OrderDeclareInfo(orderId=" + this.getOrderId() + ", idName=" + this.getIdName() + ", idNumber=" + this.getIdNumber() + ", linkPhone=" + this.getLinkPhone() + ", frontUrl=" + this.getFrontUrl() + ", backUrl=" + this.getBackUrl() + ", type=" + this.getType() + ")";
      }
   }
}
