package com.xiaohongshu.fls.opensdk.entity.data.response;

import com.xiaohongshu.fls.opensdk.entity.data.IndexInfo;
import java.util.ArrayList;
import java.util.List;

public class BatchIndexResponse {
   public List<IndexInfo> indexInfoList = new ArrayList();

   public List<IndexInfo> getIndexInfoList() {
      return this.indexInfoList;
   }

   public void setIndexInfoList(List<IndexInfo> indexInfoList) {
      this.indexInfoList = indexInfoList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchIndexResponse)) {
         return false;
      } else {
         BatchIndexResponse other = (BatchIndexResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$indexInfoList = this.getIndexInfoList();
            Object other$indexInfoList = other.getIndexInfoList();
            if (this$indexInfoList == null) {
               if (other$indexInfoList != null) {
                  return false;
               }
            } else if (!this$indexInfoList.equals(other$indexInfoList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchIndexResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $indexInfoList = this.getIndexInfoList();
      result = result * 59 + ($indexInfoList == null ? 43 : $indexInfoList.hashCode());
      return result;
   }

   public String toString() {
      return "BatchIndexResponse(indexInfoList=" + this.getIndexInfoList() + ")";
   }
}
