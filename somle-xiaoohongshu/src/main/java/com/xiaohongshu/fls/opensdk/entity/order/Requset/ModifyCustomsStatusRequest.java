package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.order.CustomsItem;
import com.xiaohongshu.fls.opensdk.entity.order.CustomsStatusInfo;
import java.util.List;

public class ModifyCustomsStatusRequest extends BaseRequest {
   public String orderId;
   public String eventType;
   public long eventTime;
   public String outOrderCode;
   public String whProviderCode;
   public String whCode;
   public List<CustomsItem> itemList;
   public CustomsStatusInfo extendInfo;

   public String getOrderId() {
      return this.orderId;
   }

   public String getEventType() {
      return this.eventType;
   }

   public long getEventTime() {
      return this.eventTime;
   }

   public String getOutOrderCode() {
      return this.outOrderCode;
   }

   public String getWhProviderCode() {
      return this.whProviderCode;
   }

   public String getWhCode() {
      return this.whCode;
   }

   public List<CustomsItem> getItemList() {
      return this.itemList;
   }

   public CustomsStatusInfo getExtendInfo() {
      return this.extendInfo;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setEventType(String eventType) {
      this.eventType = eventType;
   }

   public void setEventTime(long eventTime) {
      this.eventTime = eventTime;
   }

   public void setOutOrderCode(String outOrderCode) {
      this.outOrderCode = outOrderCode;
   }

   public void setWhProviderCode(String whProviderCode) {
      this.whProviderCode = whProviderCode;
   }

   public void setWhCode(String whCode) {
      this.whCode = whCode;
   }

   public void setItemList(List<CustomsItem> itemList) {
      this.itemList = itemList;
   }

   public void setExtendInfo(CustomsStatusInfo extendInfo) {
      this.extendInfo = extendInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ModifyCustomsStatusRequest)) {
         return false;
      } else {
         ModifyCustomsStatusRequest other = (ModifyCustomsStatusRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getEventTime() != other.getEventTime()) {
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

            Object this$eventType = this.getEventType();
            Object other$eventType = other.getEventType();
            if (this$eventType == null) {
               if (other$eventType != null) {
                  return false;
               }
            } else if (!this$eventType.equals(other$eventType)) {
               return false;
            }

            Object this$outOrderCode = this.getOutOrderCode();
            Object other$outOrderCode = other.getOutOrderCode();
            if (this$outOrderCode == null) {
               if (other$outOrderCode != null) {
                  return false;
               }
            } else if (!this$outOrderCode.equals(other$outOrderCode)) {
               return false;
            }

            Object this$whProviderCode = this.getWhProviderCode();
            Object other$whProviderCode = other.getWhProviderCode();
            if (this$whProviderCode == null) {
               if (other$whProviderCode != null) {
                  return false;
               }
            } else if (!this$whProviderCode.equals(other$whProviderCode)) {
               return false;
            }

            Object this$whCode = this.getWhCode();
            Object other$whCode = other.getWhCode();
            if (this$whCode == null) {
               if (other$whCode != null) {
                  return false;
               }
            } else if (!this$whCode.equals(other$whCode)) {
               return false;
            }

            Object this$itemList = this.getItemList();
            Object other$itemList = other.getItemList();
            if (this$itemList == null) {
               if (other$itemList != null) {
                  return false;
               }
            } else if (!this$itemList.equals(other$itemList)) {
               return false;
            }

            Object this$extendInfo = this.getExtendInfo();
            Object other$extendInfo = other.getExtendInfo();
            if (this$extendInfo == null) {
               if (other$extendInfo != null) {
                  return false;
               }
            } else if (!this$extendInfo.equals(other$extendInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ModifyCustomsStatusRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $eventTime = this.getEventTime();
      result = result * 59 + (int)($eventTime >>> 32 ^ $eventTime);
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $eventType = this.getEventType();
      result = result * 59 + ($eventType == null ? 43 : $eventType.hashCode());
      Object $outOrderCode = this.getOutOrderCode();
      result = result * 59 + ($outOrderCode == null ? 43 : $outOrderCode.hashCode());
      Object $whProviderCode = this.getWhProviderCode();
      result = result * 59 + ($whProviderCode == null ? 43 : $whProviderCode.hashCode());
      Object $whCode = this.getWhCode();
      result = result * 59 + ($whCode == null ? 43 : $whCode.hashCode());
      Object $itemList = this.getItemList();
      result = result * 59 + ($itemList == null ? 43 : $itemList.hashCode());
      Object $extendInfo = this.getExtendInfo();
      result = result * 59 + ($extendInfo == null ? 43 : $extendInfo.hashCode());
      return result;
   }

   public String toString() {
      return "ModifyCustomsStatusRequest(orderId=" + this.getOrderId() + ", eventType=" + this.getEventType() + ", eventTime=" + this.getEventTime() + ", outOrderCode=" + this.getOutOrderCode() + ", whProviderCode=" + this.getWhProviderCode() + ", whCode=" + this.getWhCode() + ", itemList=" + this.getItemList() + ", extendInfo=" + this.getExtendInfo() + ")";
   }
}
