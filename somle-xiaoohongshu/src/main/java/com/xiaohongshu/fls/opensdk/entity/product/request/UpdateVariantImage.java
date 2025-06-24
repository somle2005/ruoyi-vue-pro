package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateVariantImage extends BaseRequest {
   public String spuId;
   public String variantId;
   public String variantValue;
   public String materialUrl;

   public String getSpuId() {
      return this.spuId;
   }

   public String getVariantId() {
      return this.variantId;
   }

   public String getVariantValue() {
      return this.variantValue;
   }

   public String getMaterialUrl() {
      return this.materialUrl;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setVariantId(String variantId) {
      this.variantId = variantId;
   }

   public void setVariantValue(String variantValue) {
      this.variantValue = variantValue;
   }

   public void setMaterialUrl(String materialUrl) {
      this.materialUrl = materialUrl;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateVariantImage)) {
         return false;
      } else {
         UpdateVariantImage other = (UpdateVariantImage)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$spuId = this.getSpuId();
            Object other$spuId = other.getSpuId();
            if (this$spuId == null) {
               if (other$spuId != null) {
                  return false;
               }
            } else if (!this$spuId.equals(other$spuId)) {
               return false;
            }

            Object this$variantId = this.getVariantId();
            Object other$variantId = other.getVariantId();
            if (this$variantId == null) {
               if (other$variantId != null) {
                  return false;
               }
            } else if (!this$variantId.equals(other$variantId)) {
               return false;
            }

            Object this$variantValue = this.getVariantValue();
            Object other$variantValue = other.getVariantValue();
            if (this$variantValue == null) {
               if (other$variantValue != null) {
                  return false;
               }
            } else if (!this$variantValue.equals(other$variantValue)) {
               return false;
            }

            Object this$materialUrl = this.getMaterialUrl();
            Object other$materialUrl = other.getMaterialUrl();
            if (this$materialUrl == null) {
               if (other$materialUrl != null) {
                  return false;
               }
            } else if (!this$materialUrl.equals(other$materialUrl)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateVariantImage;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $variantId = this.getVariantId();
      result = result * 59 + ($variantId == null ? 43 : $variantId.hashCode());
      Object $variantValue = this.getVariantValue();
      result = result * 59 + ($variantValue == null ? 43 : $variantValue.hashCode());
      Object $materialUrl = this.getMaterialUrl();
      result = result * 59 + ($materialUrl == null ? 43 : $materialUrl.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateVariantImage(spuId=" + this.getSpuId() + ", variantId=" + this.getVariantId() + ", variantValue=" + this.getVariantValue() + ", materialUrl=" + this.getMaterialUrl() + ")";
   }
}
