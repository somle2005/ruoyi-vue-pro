package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class BatchGetDeliveryRuleRequest extends BaseRequest {
   List<GetDeliveryRuleRequest> getDeliveryRuleRequests;

   public List<GetDeliveryRuleRequest> getGetDeliveryRuleRequests() {
      return this.getDeliveryRuleRequests;
   }

   public void setGetDeliveryRuleRequests(List<GetDeliveryRuleRequest> getDeliveryRuleRequests) {
      this.getDeliveryRuleRequests = getDeliveryRuleRequests;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchGetDeliveryRuleRequest)) {
         return false;
      } else {
         BatchGetDeliveryRuleRequest other = (BatchGetDeliveryRuleRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$getDeliveryRuleRequests = this.getGetDeliveryRuleRequests();
            Object other$getDeliveryRuleRequests = other.getGetDeliveryRuleRequests();
            if (this$getDeliveryRuleRequests == null) {
               if (other$getDeliveryRuleRequests != null) {
                  return false;
               }
            } else if (!this$getDeliveryRuleRequests.equals(other$getDeliveryRuleRequests)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchGetDeliveryRuleRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $getDeliveryRuleRequests = this.getGetDeliveryRuleRequests();
      result = result * 59 + ($getDeliveryRuleRequests == null ? 43 : $getDeliveryRuleRequests.hashCode());
      return result;
   }

   public String toString() {
      return "BatchGetDeliveryRuleRequest(getDeliveryRuleRequests=" + this.getGetDeliveryRuleRequests() + ")";
   }

   public static class GetDeliveryRuleRequest {
      public String whcode;
      public String logisticsPlanId;
      public String categoryId;
      public String itemId;

      public String getWhcode() {
         return this.whcode;
      }

      public String getLogisticsPlanId() {
         return this.logisticsPlanId;
      }

      public String getCategoryId() {
         return this.categoryId;
      }

      public String getItemId() {
         return this.itemId;
      }

      public void setWhcode(String whcode) {
         this.whcode = whcode;
      }

      public void setLogisticsPlanId(String logisticsPlanId) {
         this.logisticsPlanId = logisticsPlanId;
      }

      public void setCategoryId(String categoryId) {
         this.categoryId = categoryId;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof GetDeliveryRuleRequest)) {
            return false;
         } else {
            GetDeliveryRuleRequest other = (GetDeliveryRuleRequest)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$whcode = this.getWhcode();
               Object other$whcode = other.getWhcode();
               if (this$whcode == null) {
                  if (other$whcode != null) {
                     return false;
                  }
               } else if (!this$whcode.equals(other$whcode)) {
                  return false;
               }

               Object this$logisticsPlanId = this.getLogisticsPlanId();
               Object other$logisticsPlanId = other.getLogisticsPlanId();
               if (this$logisticsPlanId == null) {
                  if (other$logisticsPlanId != null) {
                     return false;
                  }
               } else if (!this$logisticsPlanId.equals(other$logisticsPlanId)) {
                  return false;
               }

               Object this$categoryId = this.getCategoryId();
               Object other$categoryId = other.getCategoryId();
               if (this$categoryId == null) {
                  if (other$categoryId != null) {
                     return false;
                  }
               } else if (!this$categoryId.equals(other$categoryId)) {
                  return false;
               }

               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof GetDeliveryRuleRequest;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $whcode = this.getWhcode();
         result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
         Object $logisticsPlanId = this.getLogisticsPlanId();
         result = result * 59 + ($logisticsPlanId == null ? 43 : $logisticsPlanId.hashCode());
         Object $categoryId = this.getCategoryId();
         result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         return result;
      }

      public String toString() {
         return "BatchGetDeliveryRuleRequest.GetDeliveryRuleRequest(whcode=" + this.getWhcode() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ", categoryId=" + this.getCategoryId() + ", itemId=" + this.getItemId() + ")";
      }
   }
}
