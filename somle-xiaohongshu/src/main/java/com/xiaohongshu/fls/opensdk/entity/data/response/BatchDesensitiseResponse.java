package com.xiaohongshu.fls.opensdk.entity.data.response;

import com.xiaohongshu.fls.opensdk.entity.data.DesensitiseInfo;
import java.util.ArrayList;
import java.util.List;

public class BatchDesensitiseResponse {
   public List<DesensitiseInfo> desensitiseInfoList = new ArrayList();

   public List<DesensitiseInfo> getDesensitiseInfoList() {
      return this.desensitiseInfoList;
   }

   public void setDesensitiseInfoList(List<DesensitiseInfo> desensitiseInfoList) {
      this.desensitiseInfoList = desensitiseInfoList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchDesensitiseResponse)) {
         return false;
      } else {
         BatchDesensitiseResponse other = (BatchDesensitiseResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$desensitiseInfoList = this.getDesensitiseInfoList();
            Object other$desensitiseInfoList = other.getDesensitiseInfoList();
            if (this$desensitiseInfoList == null) {
               if (other$desensitiseInfoList != null) {
                  return false;
               }
            } else if (!this$desensitiseInfoList.equals(other$desensitiseInfoList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchDesensitiseResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $desensitiseInfoList = this.getDesensitiseInfoList();
      result = result * 59 + ($desensitiseInfoList == null ? 43 : $desensitiseInfoList.hashCode());
      return result;
   }

   public String toString() {
      return "BatchDesensitiseResponse(desensitiseInfoList=" + this.getDesensitiseInfoList() + ")";
   }
}
