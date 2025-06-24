package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class SetWarehousePriorityRequest extends BaseRequest {
   public String zoneCode;
   public List<WarehousePriority> warehousePriorityList;

   public String getZoneCode() {
      return this.zoneCode;
   }

   public List<WarehousePriority> getWarehousePriorityList() {
      return this.warehousePriorityList;
   }

   public void setZoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
   }

   public void setWarehousePriorityList(List<WarehousePriority> warehousePriorityList) {
      this.warehousePriorityList = warehousePriorityList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetWarehousePriorityRequest)) {
         return false;
      } else {
         SetWarehousePriorityRequest other = (SetWarehousePriorityRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$zoneCode = this.getZoneCode();
            Object other$zoneCode = other.getZoneCode();
            if (this$zoneCode == null) {
               if (other$zoneCode != null) {
                  return false;
               }
            } else if (!this$zoneCode.equals(other$zoneCode)) {
               return false;
            }

            Object this$warehousePriorityList = this.getWarehousePriorityList();
            Object other$warehousePriorityList = other.getWarehousePriorityList();
            if (this$warehousePriorityList == null) {
               if (other$warehousePriorityList != null) {
                  return false;
               }
            } else if (!this$warehousePriorityList.equals(other$warehousePriorityList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetWarehousePriorityRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $zoneCode = this.getZoneCode();
      result = result * 59 + ($zoneCode == null ? 43 : $zoneCode.hashCode());
      Object $warehousePriorityList = this.getWarehousePriorityList();
      result = result * 59 + ($warehousePriorityList == null ? 43 : $warehousePriorityList.hashCode());
      return result;
   }

   public String toString() {
      return "SetWarehousePriorityRequest(zoneCode=" + this.getZoneCode() + ", warehousePriorityList=" + this.getWarehousePriorityList() + ")";
   }

   public static class WarehousePriority {
      public String whCode;

      public String getWhCode() {
         return this.whCode;
      }

      public void setWhCode(String whCode) {
         this.whCode = whCode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof WarehousePriority)) {
            return false;
         } else {
            WarehousePriority other = (WarehousePriority)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$whCode = this.getWhCode();
               Object other$whCode = other.getWhCode();
               if (this$whCode == null) {
                  if (other$whCode != null) {
                     return false;
                  }
               } else if (!this$whCode.equals(other$whCode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof WarehousePriority;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $whCode = this.getWhCode();
         result = result * 59 + ($whCode == null ? 43 : $whCode.hashCode());
         return result;
      }

      public String toString() {
         return "SetWarehousePriorityRequest.WarehousePriority(whCode=" + this.getWhCode() + ")";
      }
   }
}
