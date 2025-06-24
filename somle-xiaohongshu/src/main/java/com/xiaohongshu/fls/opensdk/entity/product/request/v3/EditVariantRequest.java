package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class EditVariantRequest extends BaseRequest {
   public String itemId;
   public List<VariantsChange> newVariants;

   public String getItemId() {
      return this.itemId;
   }

   public List<VariantsChange> getNewVariants() {
      return this.newVariants;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setNewVariants(List<VariantsChange> newVariants) {
      this.newVariants = newVariants;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof EditVariantRequest)) {
         return false;
      } else {
         EditVariantRequest other = (EditVariantRequest)o;
         if (!other.canEqual(this)) {
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

            Object this$newVariants = this.getNewVariants();
            Object other$newVariants = other.getNewVariants();
            if (this$newVariants == null) {
               if (other$newVariants != null) {
                  return false;
               }
            } else if (!this$newVariants.equals(other$newVariants)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof EditVariantRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $newVariants = this.getNewVariants();
      result = result * 59 + ($newVariants == null ? 43 : $newVariants.hashCode());
      return result;
   }

   public String toString() {
      return "EditVariantRequest(itemId=" + this.getItemId() + ", newVariants=" + this.getNewVariants() + ")";
   }

   public static class VariantsChange {
      public String skuId;
      public List<ProductVariantDTO> variants;

      public String getSkuId() {
         return this.skuId;
      }

      public List<ProductVariantDTO> getVariants() {
         return this.variants;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setVariants(List<ProductVariantDTO> variants) {
         this.variants = variants;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof VariantsChange)) {
            return false;
         } else {
            VariantsChange other = (VariantsChange)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
                  return false;
               }

               Object this$variants = this.getVariants();
               Object other$variants = other.getVariants();
               if (this$variants == null) {
                  if (other$variants != null) {
                     return false;
                  }
               } else if (!this$variants.equals(other$variants)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof VariantsChange;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $variants = this.getVariants();
         result = result * 59 + ($variants == null ? 43 : $variants.hashCode());
         return result;
      }

      public String toString() {
         return "EditVariantRequest.VariantsChange(skuId=" + this.getSkuId() + ", variants=" + this.getVariants() + ")";
      }
   }

   public static class ProductVariantDTO {
      public int attributeType;
      public int attributeIndex;
      public String attributeId;
      public String attributeValue;
      public String attributeName;
      public String remark;
      public String attributeValueId;
      public List<String> fatherValueIds;

      public int getAttributeType() {
         return this.attributeType;
      }

      public int getAttributeIndex() {
         return this.attributeIndex;
      }

      public String getAttributeId() {
         return this.attributeId;
      }

      public String getAttributeValue() {
         return this.attributeValue;
      }

      public String getAttributeName() {
         return this.attributeName;
      }

      public String getRemark() {
         return this.remark;
      }

      public String getAttributeValueId() {
         return this.attributeValueId;
      }

      public List<String> getFatherValueIds() {
         return this.fatherValueIds;
      }

      public void setAttributeType(int attributeType) {
         this.attributeType = attributeType;
      }

      public void setAttributeIndex(int attributeIndex) {
         this.attributeIndex = attributeIndex;
      }

      public void setAttributeId(String attributeId) {
         this.attributeId = attributeId;
      }

      public void setAttributeValue(String attributeValue) {
         this.attributeValue = attributeValue;
      }

      public void setAttributeName(String attributeName) {
         this.attributeName = attributeName;
      }

      public void setRemark(String remark) {
         this.remark = remark;
      }

      public void setAttributeValueId(String attributeValueId) {
         this.attributeValueId = attributeValueId;
      }

      public void setFatherValueIds(List<String> fatherValueIds) {
         this.fatherValueIds = fatherValueIds;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ProductVariantDTO)) {
            return false;
         } else {
            ProductVariantDTO other = (ProductVariantDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getAttributeType() != other.getAttributeType()) {
               return false;
            } else if (this.getAttributeIndex() != other.getAttributeIndex()) {
               return false;
            } else {
               Object this$attributeId = this.getAttributeId();
               Object other$attributeId = other.getAttributeId();
               if (this$attributeId == null) {
                  if (other$attributeId != null) {
                     return false;
                  }
               } else if (!this$attributeId.equals(other$attributeId)) {
                  return false;
               }

               Object this$attributeValue = this.getAttributeValue();
               Object other$attributeValue = other.getAttributeValue();
               if (this$attributeValue == null) {
                  if (other$attributeValue != null) {
                     return false;
                  }
               } else if (!this$attributeValue.equals(other$attributeValue)) {
                  return false;
               }

               Object this$attributeName = this.getAttributeName();
               Object other$attributeName = other.getAttributeName();
               if (this$attributeName == null) {
                  if (other$attributeName != null) {
                     return false;
                  }
               } else if (!this$attributeName.equals(other$attributeName)) {
                  return false;
               }

               Object this$remark = this.getRemark();
               Object other$remark = other.getRemark();
               if (this$remark == null) {
                  if (other$remark != null) {
                     return false;
                  }
               } else if (!this$remark.equals(other$remark)) {
                  return false;
               }

               Object this$attributeValueId = this.getAttributeValueId();
               Object other$attributeValueId = other.getAttributeValueId();
               if (this$attributeValueId == null) {
                  if (other$attributeValueId != null) {
                     return false;
                  }
               } else if (!this$attributeValueId.equals(other$attributeValueId)) {
                  return false;
               }

               Object this$fatherValueIds = this.getFatherValueIds();
               Object other$fatherValueIds = other.getFatherValueIds();
               if (this$fatherValueIds == null) {
                  if (other$fatherValueIds != null) {
                     return false;
                  }
               } else if (!this$fatherValueIds.equals(other$fatherValueIds)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ProductVariantDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getAttributeType();
         result = result * 59 + this.getAttributeIndex();
         Object $attributeId = this.getAttributeId();
         result = result * 59 + ($attributeId == null ? 43 : $attributeId.hashCode());
         Object $attributeValue = this.getAttributeValue();
         result = result * 59 + ($attributeValue == null ? 43 : $attributeValue.hashCode());
         Object $attributeName = this.getAttributeName();
         result = result * 59 + ($attributeName == null ? 43 : $attributeName.hashCode());
         Object $remark = this.getRemark();
         result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
         Object $attributeValueId = this.getAttributeValueId();
         result = result * 59 + ($attributeValueId == null ? 43 : $attributeValueId.hashCode());
         Object $fatherValueIds = this.getFatherValueIds();
         result = result * 59 + ($fatherValueIds == null ? 43 : $fatherValueIds.hashCode());
         return result;
      }

      public String toString() {
         return "EditVariantRequest.ProductVariantDTO(attributeType=" + this.getAttributeType() + ", attributeIndex=" + this.getAttributeIndex() + ", attributeId=" + this.getAttributeId() + ", attributeValue=" + this.getAttributeValue() + ", attributeName=" + this.getAttributeName() + ", remark=" + this.getRemark() + ", attributeValueId=" + this.getAttributeValueId() + ", fatherValueIds=" + this.getFatherValueIds() + ")";
      }
   }
}
