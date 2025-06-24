package com.xiaohongshu.fls.opensdk.entity.material.response;

import java.util.List;

public class QueryMaterialInfoResponse {
   public List<MaterialDetail> materialDetailList;

   public List<MaterialDetail> getMaterialDetailList() {
      return this.materialDetailList;
   }

   public void setMaterialDetailList(List<MaterialDetail> materialDetailList) {
      this.materialDetailList = materialDetailList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof QueryMaterialInfoResponse)) {
         return false;
      } else {
         QueryMaterialInfoResponse other = (QueryMaterialInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$materialDetailList = this.getMaterialDetailList();
            Object other$materialDetailList = other.getMaterialDetailList();
            if (this$materialDetailList == null) {
               if (other$materialDetailList != null) {
                  return false;
               }
            } else if (!this$materialDetailList.equals(other$materialDetailList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof QueryMaterialInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $materialDetailList = this.getMaterialDetailList();
      result = result * 59 + ($materialDetailList == null ? 43 : $materialDetailList.hashCode());
      return result;
   }

   public String toString() {
      return "QueryMaterialInfoResponse(materialDetailList=" + this.getMaterialDetailList() + ")";
   }
}
