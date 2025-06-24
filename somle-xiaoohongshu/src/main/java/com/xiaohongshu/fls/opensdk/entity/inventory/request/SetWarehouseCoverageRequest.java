package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class SetWarehouseCoverageRequest extends BaseRequest {
   public String whCode;
   public List<String> zoneCodeList;

   public String getWhCode() {
      return this.whCode;
   }

   public List<String> getZoneCodeList() {
      return this.zoneCodeList;
   }

   public void setWhCode(String whCode) {
      this.whCode = whCode;
   }

   public void setZoneCodeList(List<String> zoneCodeList) {
      this.zoneCodeList = zoneCodeList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SetWarehouseCoverageRequest)) {
         return false;
      } else {
         SetWarehouseCoverageRequest other = (SetWarehouseCoverageRequest)o;
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

            Object this$zoneCodeList = this.getZoneCodeList();
            Object other$zoneCodeList = other.getZoneCodeList();
            if (this$zoneCodeList == null) {
               if (other$zoneCodeList != null) {
                  return false;
               }
            } else if (!this$zoneCodeList.equals(other$zoneCodeList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SetWarehouseCoverageRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $whCode = this.getWhCode();
      result = result * 59 + ($whCode == null ? 43 : $whCode.hashCode());
      Object $zoneCodeList = this.getZoneCodeList();
      result = result * 59 + ($zoneCodeList == null ? 43 : $zoneCodeList.hashCode());
      return result;
   }

   public String toString() {
      return "SetWarehouseCoverageRequest(whCode=" + this.getWhCode() + ", zoneCodeList=" + this.getZoneCodeList() + ")";
   }
}
