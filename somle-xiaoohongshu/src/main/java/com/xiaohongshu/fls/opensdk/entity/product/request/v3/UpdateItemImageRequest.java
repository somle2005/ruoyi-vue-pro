package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class UpdateItemImageRequest extends BaseRequest {
   public String itemId;
   public int materialType;
   public List<String> materialUrls;

   public String getItemId() {
      return this.itemId;
   }

   public int getMaterialType() {
      return this.materialType;
   }

   public List<String> getMaterialUrls() {
      return this.materialUrls;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setMaterialType(int materialType) {
      this.materialType = materialType;
   }

   public void setMaterialUrls(List<String> materialUrls) {
      this.materialUrls = materialUrls;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateItemImageRequest)) {
         return false;
      } else {
         UpdateItemImageRequest other = (UpdateItemImageRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getMaterialType() != other.getMaterialType()) {
            return false;
         } else {
            Object this$itemId = this.getItemId();
            Object other$itemId = other.getItemId();
            if (this$itemId == null) {
               if (other$itemId != null) {
                  return false;
               }
            } else if (!this$itemId.equals(other$itemId)) {
               return false;
            }

            Object this$materialUrls = this.getMaterialUrls();
            Object other$materialUrls = other.getMaterialUrls();
            if (this$materialUrls == null) {
               if (other$materialUrls != null) {
                  return false;
               }
            } else if (!this$materialUrls.equals(other$materialUrls)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateItemImageRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getMaterialType();
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $materialUrls = this.getMaterialUrls();
      result = result * 59 + ($materialUrls == null ? 43 : $materialUrls.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateItemImageRequest(itemId=" + this.getItemId() + ", materialType=" + this.getMaterialType() + ", materialUrls=" + this.getMaterialUrls() + ")";
   }
}
