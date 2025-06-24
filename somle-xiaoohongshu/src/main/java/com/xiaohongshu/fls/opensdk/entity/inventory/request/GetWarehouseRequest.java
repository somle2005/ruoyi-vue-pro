package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetWarehouseRequest extends BaseRequest {
   public String code;

   public String getCode() {
      return this.code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetWarehouseRequest)) {
         return false;
      } else {
         GetWarehouseRequest other = (GetWarehouseRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$code = this.getCode();
            Object other$code = other.getCode();
            if (this$code == null) {
               if (other$code != null) {
                  return false;
               }
            } else if (!this$code.equals(other$code)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetWarehouseRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $code = this.getCode();
      result = result * 59 + ($code == null ? 43 : $code.hashCode());
      return result;
   }

   public String toString() {
      return "GetWarehouseRequest(code=" + this.getCode() + ")";
   }
}
