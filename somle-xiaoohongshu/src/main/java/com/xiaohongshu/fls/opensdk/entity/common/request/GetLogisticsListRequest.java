package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetLogisticsListRequest extends BaseRequest {
   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetLogisticsListRequest)) {
         return false;
      } else {
         GetLogisticsListRequest other = (GetLogisticsListRequest)o;
         return other.canEqual(this);
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetLogisticsListRequest;
   }

   public int hashCode() {
      int result = 1;
      return 1;
   }

   public String toString() {
      return "GetLogisticsListRequest()";
   }
}
