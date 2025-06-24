package com.xiaohongshu.fls.opensdk.entity.material.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class DeleteMaterialInfoRequest extends BaseRequest {
   public String materialId;

   public String getMaterialId() {
      return this.materialId;
   }

   public void setMaterialId(String materialId) {
      this.materialId = materialId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DeleteMaterialInfoRequest)) {
         return false;
      } else {
         DeleteMaterialInfoRequest other = (DeleteMaterialInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$materialId = this.getMaterialId();
            Object other$materialId = other.getMaterialId();
            if (this$materialId == null) {
               if (other$materialId != null) {
                  return false;
               }
            } else if (!this$materialId.equals(other$materialId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DeleteMaterialInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $materialId = this.getMaterialId();
      result = result * 59 + ($materialId == null ? 43 : $materialId.hashCode());
      return result;
   }

   public String toString() {
      return "DeleteMaterialInfoRequest(materialId=" + this.getMaterialId() + ")";
   }
}
