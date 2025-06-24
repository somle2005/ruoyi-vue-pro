package com.xiaohongshu.fls.opensdk.entity.material.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateMaterialInfoRequest extends BaseRequest {
   public String materialId;
   public String materialName;

   public String getMaterialId() {
      return this.materialId;
   }

   public String getMaterialName() {
      return this.materialName;
   }

   public void setMaterialId(String materialId) {
      this.materialId = materialId;
   }

   public void setMaterialName(String materialName) {
      this.materialName = materialName;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateMaterialInfoRequest)) {
         return false;
      } else {
         UpdateMaterialInfoRequest other = (UpdateMaterialInfoRequest)o;
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

            Object this$materialName = this.getMaterialName();
            Object other$materialName = other.getMaterialName();
            if (this$materialName == null) {
               if (other$materialName != null) {
                  return false;
               }
            } else if (!this$materialName.equals(other$materialName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateMaterialInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $materialId = this.getMaterialId();
      result = result * 59 + ($materialId == null ? 43 : $materialId.hashCode());
      Object $materialName = this.getMaterialName();
      result = result * 59 + ($materialName == null ? 43 : $materialName.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateMaterialInfoRequest(materialId=" + this.getMaterialId() + ", materialName=" + this.getMaterialName() + ")";
   }
}
