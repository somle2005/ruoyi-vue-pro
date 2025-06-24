package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetSellerKeyInfoRequest extends BaseRequest {
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSellerKeyInfoRequest)) {
         return false;
      } else {
         GetSellerKeyInfoRequest other = (GetSellerKeyInfoRequest)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSellerKeyInfoRequest;
   }

   public int hashCode() {
      int result = 1;
      return 1;
   }

   public String toString() {
      return "GetSellerKeyInfoRequest()";
   }
}
