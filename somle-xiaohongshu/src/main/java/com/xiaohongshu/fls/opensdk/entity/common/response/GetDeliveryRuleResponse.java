package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class GetDeliveryRuleResponse {
   List<DeliveryRule> deliveryRuleList = new ArrayList();

   public List<DeliveryRule> getDeliveryRuleList() {
      return this.deliveryRuleList;
   }

   public void setDeliveryRuleList(List<DeliveryRule> deliveryRuleList) {
      this.deliveryRuleList = deliveryRuleList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetDeliveryRuleResponse)) {
         return false;
      } else {
         GetDeliveryRuleResponse other = (GetDeliveryRuleResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$deliveryRuleList = this.getDeliveryRuleList();
            Object other$deliveryRuleList = other.getDeliveryRuleList();
            if (this$deliveryRuleList == null) {
               if (other$deliveryRuleList != null) {
                  return false;
               }
            } else if (!this$deliveryRuleList.equals(other$deliveryRuleList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetDeliveryRuleResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $deliveryRuleList = this.getDeliveryRuleList();
      result = result * 59 + ($deliveryRuleList == null ? 43 : $deliveryRuleList.hashCode());
      return result;
   }

   public String toString() {
      return "GetDeliveryRuleResponse(deliveryRuleList=" + this.getDeliveryRuleList() + ")";
   }

   public static class DeliveryRule {
      public String sellerId;
      public String planInfoId;
      public String whcode;
      public String categoryId;
      public int logisticsMode;
      public List<DeliveryTimeRuleConfigItem> existing;
      public List<DeliveryTimeRuleConfigItem> presale;
      public List<DeliveryTimeRuleConfigItem> stepPresale;
      public String comment;
      public boolean mustFreeReturn;
      public int notSupportPreSaleCode;
      public boolean supportPreSale;
      public boolean supportStepPreSale;

      public String getSellerId() {
         return this.sellerId;
      }

      public String getPlanInfoId() {
         return this.planInfoId;
      }

      public String getWhcode() {
         return this.whcode;
      }

      public String getCategoryId() {
         return this.categoryId;
      }

      public int getLogisticsMode() {
         return this.logisticsMode;
      }

      public List<DeliveryTimeRuleConfigItem> getExisting() {
         return this.existing;
      }

      public List<DeliveryTimeRuleConfigItem> getPresale() {
         return this.presale;
      }

      public List<DeliveryTimeRuleConfigItem> getStepPresale() {
         return this.stepPresale;
      }

      public String getComment() {
         return this.comment;
      }

      public boolean isMustFreeReturn() {
         return this.mustFreeReturn;
      }

      public int getNotSupportPreSaleCode() {
         return this.notSupportPreSaleCode;
      }

      public boolean isSupportPreSale() {
         return this.supportPreSale;
      }

      public boolean isSupportStepPreSale() {
         return this.supportStepPreSale;
      }

      public void setSellerId(String sellerId) {
         this.sellerId = sellerId;
      }

      public void setPlanInfoId(String planInfoId) {
         this.planInfoId = planInfoId;
      }

      public void setWhcode(String whcode) {
         this.whcode = whcode;
      }

      public void setCategoryId(String categoryId) {
         this.categoryId = categoryId;
      }

      public void setLogisticsMode(int logisticsMode) {
         this.logisticsMode = logisticsMode;
      }

      public void setExisting(List<DeliveryTimeRuleConfigItem> existing) {
         this.existing = existing;
      }

      public void setPresale(List<DeliveryTimeRuleConfigItem> presale) {
         this.presale = presale;
      }

      public void setStepPresale(List<DeliveryTimeRuleConfigItem> stepPresale) {
         this.stepPresale = stepPresale;
      }

      public void setComment(String comment) {
         this.comment = comment;
      }

      public void setMustFreeReturn(boolean mustFreeReturn) {
         this.mustFreeReturn = mustFreeReturn;
      }

      public void setNotSupportPreSaleCode(int notSupportPreSaleCode) {
         this.notSupportPreSaleCode = notSupportPreSaleCode;
      }

      public void setSupportPreSale(boolean supportPreSale) {
         this.supportPreSale = supportPreSale;
      }

      public void setSupportStepPreSale(boolean supportStepPreSale) {
         this.supportStepPreSale = supportStepPreSale;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof DeliveryRule)) {
            return false;
         } else {
            DeliveryRule other = (DeliveryRule)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getLogisticsMode() != other.getLogisticsMode()) {
               return false;
            } else if (this.isMustFreeReturn() != other.isMustFreeReturn()) {
               return false;
            } else if (this.getNotSupportPreSaleCode() != other.getNotSupportPreSaleCode()) {
               return false;
            } else if (this.isSupportPreSale() != other.isSupportPreSale()) {
               return false;
            } else if (this.isSupportStepPreSale() != other.isSupportStepPreSale()) {
               return false;
            } else {
               Object this$sellerId = this.getSellerId();
               Object other$sellerId = other.getSellerId();
               if (this$sellerId == null) {
                  if (other$sellerId != null) {
                     return false;
                  }
               } else if (!this$sellerId.equals(other$sellerId)) {
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

               Object this$whcode = this.getWhcode();
               Object other$whcode = other.getWhcode();
               if (this$whcode == null) {
                  if (other$whcode != null) {
                     return false;
                  }
               } else if (!this$whcode.equals(other$whcode)) {
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

               Object this$existing = this.getExisting();
               Object other$existing = other.getExisting();
               if (this$existing == null) {
                  if (other$existing != null) {
                     return false;
                  }
               } else if (!this$existing.equals(other$existing)) {
                  return false;
               }

               Object this$presale = this.getPresale();
               Object other$presale = other.getPresale();
               if (this$presale == null) {
                  if (other$presale != null) {
                     return false;
                  }
               } else if (!this$presale.equals(other$presale)) {
                  return false;
               }

               Object this$stepPresale = this.getStepPresale();
               Object other$stepPresale = other.getStepPresale();
               if (this$stepPresale == null) {
                  if (other$stepPresale != null) {
                     return false;
                  }
               } else if (!this$stepPresale.equals(other$stepPresale)) {
                  return false;
               }

               Object this$comment = this.getComment();
               Object other$comment = other.getComment();
               if (this$comment == null) {
                  if (other$comment != null) {
                     return false;
                  }
               } else if (!this$comment.equals(other$comment)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof DeliveryRule;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getLogisticsMode();
         result = result * 59 + (this.isMustFreeReturn() ? 79 : 97);
         result = result * 59 + this.getNotSupportPreSaleCode();
         result = result * 59 + (this.isSupportPreSale() ? 79 : 97);
         result = result * 59 + (this.isSupportStepPreSale() ? 79 : 97);
         Object $sellerId = this.getSellerId();
         result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
         Object $planInfoId = this.getPlanInfoId();
         result = result * 59 + ($planInfoId == null ? 43 : $planInfoId.hashCode());
         Object $whcode = this.getWhcode();
         result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
         Object $categoryId = this.getCategoryId();
         result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
         Object $existing = this.getExisting();
         result = result * 59 + ($existing == null ? 43 : $existing.hashCode());
         Object $presale = this.getPresale();
         result = result * 59 + ($presale == null ? 43 : $presale.hashCode());
         Object $stepPresale = this.getStepPresale();
         result = result * 59 + ($stepPresale == null ? 43 : $stepPresale.hashCode());
         Object $comment = this.getComment();
         result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
         return result;
      }

      public String toString() {
         return "GetDeliveryRuleResponse.DeliveryRule(sellerId=" + this.getSellerId() + ", planInfoId=" + this.getPlanInfoId() + ", whcode=" + this.getWhcode() + ", categoryId=" + this.getCategoryId() + ", logisticsMode=" + this.getLogisticsMode() + ", existing=" + this.getExisting() + ", presale=" + this.getPresale() + ", stepPresale=" + this.getStepPresale() + ", comment=" + this.getComment() + ", mustFreeReturn=" + this.isMustFreeReturn() + ", notSupportPreSaleCode=" + this.getNotSupportPreSaleCode() + ", supportPreSale=" + this.isSupportPreSale() + ", supportStepPreSale=" + this.isSupportStepPreSale() + ")";
      }
   }

   public static class DeliveryTimeRuleConfigItem {
      public int timeType;
      public int value;
      public int min;
      public int max;
      public String desc;
      public boolean isDefault;
      public List<Integer> stepDeliveryTime;

      public int getTimeType() {
         return this.timeType;
      }

      public int getValue() {
         return this.value;
      }

      public int getMin() {
         return this.min;
      }

      public int getMax() {
         return this.max;
      }

      public String getDesc() {
         return this.desc;
      }

      public boolean isDefault() {
         return this.isDefault;
      }

      public List<Integer> getStepDeliveryTime() {
         return this.stepDeliveryTime;
      }

      public void setTimeType(int timeType) {
         this.timeType = timeType;
      }

      public void setValue(int value) {
         this.value = value;
      }

      public void setMin(int min) {
         this.min = min;
      }

      public void setMax(int max) {
         this.max = max;
      }

      public void setDesc(String desc) {
         this.desc = desc;
      }

      public void setDefault(boolean isDefault) {
         this.isDefault = isDefault;
      }

      public void setStepDeliveryTime(List<Integer> stepDeliveryTime) {
         this.stepDeliveryTime = stepDeliveryTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof DeliveryTimeRuleConfigItem)) {
            return false;
         } else {
            DeliveryTimeRuleConfigItem other = (DeliveryTimeRuleConfigItem)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getTimeType() != other.getTimeType()) {
               return false;
            } else if (this.getValue() != other.getValue()) {
               return false;
            } else if (this.getMin() != other.getMin()) {
               return false;
            } else if (this.getMax() != other.getMax()) {
               return false;
            } else if (this.isDefault() != other.isDefault()) {
               return false;
            } else {
               Object this$desc = this.getDesc();
               Object other$desc = other.getDesc();
               if (this$desc == null) {
                  if (other$desc != null) {
                     return false;
                  }
               } else if (!this$desc.equals(other$desc)) {
                  return false;
               }

               Object this$stepDeliveryTime = this.getStepDeliveryTime();
               Object other$stepDeliveryTime = other.getStepDeliveryTime();
               if (this$stepDeliveryTime == null) {
                  if (other$stepDeliveryTime != null) {
                     return false;
                  }
               } else if (!this$stepDeliveryTime.equals(other$stepDeliveryTime)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof DeliveryTimeRuleConfigItem;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getTimeType();
         result = result * 59 + this.getValue();
         result = result * 59 + this.getMin();
         result = result * 59 + this.getMax();
         result = result * 59 + (this.isDefault() ? 79 : 97);
         Object $desc = this.getDesc();
         result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
         Object $stepDeliveryTime = this.getStepDeliveryTime();
         result = result * 59 + ($stepDeliveryTime == null ? 43 : $stepDeliveryTime.hashCode());
         return result;
      }

      public String toString() {
         return "GetDeliveryRuleResponse.DeliveryTimeRuleConfigItem(timeType=" + this.getTimeType() + ", value=" + this.getValue() + ", min=" + this.getMin() + ", max=" + this.getMax() + ", desc=" + this.getDesc() + ", isDefault=" + this.isDefault() + ", stepDeliveryTime=" + this.getStepDeliveryTime() + ")";
      }
   }
}
