package com.xiaohongshu.fls.opensdk.entity.data.response;

import com.xiaohongshu.fls.opensdk.entity.data.DecryptedInfo;
import java.util.ArrayList;
import java.util.List;

public class BatchDecryptResponse {
   public List<DecryptedInfo> dataInfoList = new ArrayList();

   public List<DecryptedInfo> getDataInfoList() {
      return this.dataInfoList;
   }

   public void setDataInfoList(List<DecryptedInfo> dataInfoList) {
      this.dataInfoList = dataInfoList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchDecryptResponse)) {
         return false;
      } else {
         BatchDecryptResponse other = (BatchDecryptResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$dataInfoList = this.getDataInfoList();
            Object other$dataInfoList = other.getDataInfoList();
            if (this$dataInfoList == null) {
               if (other$dataInfoList != null) {
                  return false;
               }
            } else if (!this$dataInfoList.equals(other$dataInfoList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchDecryptResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $dataInfoList = this.getDataInfoList();
      result = result * 59 + ($dataInfoList == null ? 43 : $dataInfoList.hashCode());
      return result;
   }

   public String toString() {
      return "BatchDecryptResponse(dataInfoList=" + this.getDataInfoList() + ")";
   }
}
