package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetNestZoneRequest extends BaseRequest {
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetNestZoneRequest)) {
         return false;
      } else {
         GetNestZoneRequest other = (GetNestZoneRequest)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetNestZoneRequest;
   }

   public int hashCode() {
      int result = 1;
      return 1;
   }

   public String toString() {
      return "GetNestZoneRequest()";
   }
}
