package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class UpdateSpuImage extends BaseRequest {
   public String spuId;
   public Integer materialType;
   public List<String> materialUrls;

   public String getSpuId() {
      return this.spuId;
   }

   public Integer getMaterialType() {
      return this.materialType;
   }

   public List<String> getMaterialUrls() {
      return this.materialUrls;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setMaterialType(Integer materialType) {
      this.materialType = materialType;
   }

   public void setMaterialUrls(List<String> materialUrls) {
      this.materialUrls = materialUrls;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateSpuImage)) {
         return false;
      } else {
         UpdateSpuImage other = (UpdateSpuImage)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$materialType = this.getMaterialType();
            Object other$materialType = other.getMaterialType();
            if (this$materialType == null) {
               if (other$materialType != null) {
                  return false;
               }
            } else if (!this$materialType.equals(other$materialType)) {
               return false;
            }

            Object this$spuId = this.getSpuId();
            Object other$spuId = other.getSpuId();
            if (this$spuId == null) {
               if (other$spuId != null) {
                  return false;
               }
            } else if (!this$spuId.equals(other$spuId)) {
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
      return other instanceof UpdateSpuImage;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $materialType = this.getMaterialType();
      result = result * 59 + ($materialType == null ? 43 : $materialType.hashCode());
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $materialUrls = this.getMaterialUrls();
      result = result * 59 + ($materialUrls == null ? 43 : $materialUrls.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateSpuImage(spuId=" + this.getSpuId() + ", materialType=" + this.getMaterialType() + ", materialUrls=" + this.getMaterialUrls() + ")";
   }
}
