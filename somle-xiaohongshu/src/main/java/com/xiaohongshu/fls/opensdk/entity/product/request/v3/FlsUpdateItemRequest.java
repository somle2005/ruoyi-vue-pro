package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.ArrayList;
import java.util.List;

public class FlsUpdateItemRequest extends BaseRequest {
   private String id;
   private List<String> updatedFields;
   private String name;
   private String ename;
   private Long brandId;
   private String categoryId;
   private List<ItemAttribute> attributes = new ArrayList();
   private String shippingTemplateId;
   private Integer shippingGrossWeight;
   private List<String> variantIds = new ArrayList();
   private String video;
   private String articleNo;
   public String transparentImage;
   public Boolean isChannel;
   public Integer deliveryMode;

   public FlsUpdateItemRequest() {
      this.variantIds = new ArrayList();
   }

   public String getId() {
      return this.id;
   }

   public List<String> getUpdatedFields() {
      return this.updatedFields;
   }

   public String getName() {
      return this.name;
   }

   public String getEname() {
      return this.ename;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public List<ItemAttribute> getAttributes() {
      return this.attributes;
   }

   public String getShippingTemplateId() {
      return this.shippingTemplateId;
   }

   public Integer getShippingGrossWeight() {
      return this.shippingGrossWeight;
   }

   public List<String> getVariantIds() {
      return this.variantIds;
   }

   public String getVideo() {
      return this.video;
   }

   public String getArticleNo() {
      return this.articleNo;
   }

   public String getTransparentImage() {
      return this.transparentImage;
   }

   public Boolean getIsChannel() {
      return this.isChannel;
   }

   public Integer getDeliveryMode() {
      return this.deliveryMode;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setUpdatedFields(List<String> updatedFields) {
      this.updatedFields = updatedFields;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public void setAttributes(List<ItemAttribute> attributes) {
      this.attributes = attributes;
   }

   public void setShippingTemplateId(String shippingTemplateId) {
      this.shippingTemplateId = shippingTemplateId;
   }

   public void setShippingGrossWeight(Integer shippingGrossWeight) {
      this.shippingGrossWeight = shippingGrossWeight;
   }

   public void setVariantIds(List<String> variantIds) {
      this.variantIds = variantIds;
   }

   public void setVideo(String video) {
      this.video = video;
   }

   public void setArticleNo(String articleNo) {
      this.articleNo = articleNo;
   }

   public void setTransparentImage(String transparentImage) {
      this.transparentImage = transparentImage;
   }

   public void setIsChannel(Boolean isChannel) {
      this.isChannel = isChannel;
   }

   public void setDeliveryMode(Integer deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsUpdateItemRequest)) {
         return false;
      } else {
         FlsUpdateItemRequest other = (FlsUpdateItemRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$brandId = this.getBrandId();
            Object other$brandId = other.getBrandId();
            if (this$brandId == null) {
               if (other$brandId != null) {
                  return false;
               }
            } else if (!this$brandId.equals(other$brandId)) {
               return false;
            }

            Object this$shippingGrossWeight = this.getShippingGrossWeight();
            Object other$shippingGrossWeight = other.getShippingGrossWeight();
            if (this$shippingGrossWeight == null) {
               if (other$shippingGrossWeight != null) {
                  return false;
               }
            } else if (!this$shippingGrossWeight.equals(other$shippingGrossWeight)) {
               return false;
            }

            Object this$isChannel = this.getIsChannel();
            Object other$isChannel = other.getIsChannel();
            if (this$isChannel == null) {
               if (other$isChannel != null) {
                  return false;
               }
            } else if (!this$isChannel.equals(other$isChannel)) {
               return false;
            }

            Object this$deliveryMode = this.getDeliveryMode();
            Object other$deliveryMode = other.getDeliveryMode();
            if (this$deliveryMode == null) {
               if (other$deliveryMode != null) {
                  return false;
               }
            } else if (!this$deliveryMode.equals(other$deliveryMode)) {
               return false;
            }

            Object this$id = this.getId();
            Object other$id = other.getId();
            if (this$id == null) {
               if (other$id != null) {
                  return false;
               }
            } else if (!this$id.equals(other$id)) {
               return false;
            }

            Object this$updatedFields = this.getUpdatedFields();
            Object other$updatedFields = other.getUpdatedFields();
            if (this$updatedFields == null) {
               if (other$updatedFields != null) {
                  return false;
               }
            } else if (!this$updatedFields.equals(other$updatedFields)) {
               return false;
            }

            Object this$name = this.getName();
            Object other$name = other.getName();
            if (this$name == null) {
               if (other$name != null) {
                  return false;
               }
            } else if (!this$name.equals(other$name)) {
               return false;
            }

            Object this$ename = this.getEname();
            Object other$ename = other.getEname();
            if (this$ename == null) {
               if (other$ename != null) {
                  return false;
               }
            } else if (!this$ename.equals(other$ename)) {
               return false;
            }

            Object this$categoryId = this.getCategoryId();
            Object other$categoryId = other.getCategoryId();
            if (this$categoryId == null) {
               if (other$categoryId != null) {
                  return false;
               }
            } else if (!this$categoryId.equals(other$categoryId)) {
               return false;
            }

            Object this$attributes = this.getAttributes();
            Object other$attributes = other.getAttributes();
            if (this$attributes == null) {
               if (other$attributes != null) {
                  return false;
               }
            } else if (!this$attributes.equals(other$attributes)) {
               return false;
            }

            Object this$shippingTemplateId = this.getShippingTemplateId();
            Object other$shippingTemplateId = other.getShippingTemplateId();
            if (this$shippingTemplateId == null) {
               if (other$shippingTemplateId != null) {
                  return false;
               }
            } else if (!this$shippingTemplateId.equals(other$shippingTemplateId)) {
               return false;
            }

            Object this$variantIds = this.getVariantIds();
            Object other$variantIds = other.getVariantIds();
            if (this$variantIds == null) {
               if (other$variantIds != null) {
                  return false;
               }
            } else if (!this$variantIds.equals(other$variantIds)) {
               return false;
            }

            Object this$video = this.getVideo();
            Object other$video = other.getVideo();
            if (this$video == null) {
               if (other$video != null) {
                  return false;
               }
            } else if (!this$video.equals(other$video)) {
               return false;
            }

            Object this$articleNo = this.getArticleNo();
            Object other$articleNo = other.getArticleNo();
            if (this$articleNo == null) {
               if (other$articleNo != null) {
                  return false;
               }
            } else if (!this$articleNo.equals(other$articleNo)) {
               return false;
            }

            Object this$transparentImage = this.getTransparentImage();
            Object other$transparentImage = other.getTransparentImage();
            if (this$transparentImage == null) {
               if (other$transparentImage != null) {
                  return false;
               }
            } else if (!this$transparentImage.equals(other$transparentImage)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof FlsUpdateItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $brandId = this.getBrandId();
      result = result * 59 + ($brandId == null ? 43 : $brandId.hashCode());
      Object $shippingGrossWeight = this.getShippingGrossWeight();
      result = result * 59 + ($shippingGrossWeight == null ? 43 : $shippingGrossWeight.hashCode());
      Object $isChannel = this.getIsChannel();
      result = result * 59 + ($isChannel == null ? 43 : $isChannel.hashCode());
      Object $deliveryMode = this.getDeliveryMode();
      result = result * 59 + ($deliveryMode == null ? 43 : $deliveryMode.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $updatedFields = this.getUpdatedFields();
      result = result * 59 + ($updatedFields == null ? 43 : $updatedFields.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $ename = this.getEname();
      result = result * 59 + ($ename == null ? 43 : $ename.hashCode());
      Object $categoryId = this.getCategoryId();
      result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
      Object $attributes = this.getAttributes();
      result = result * 59 + ($attributes == null ? 43 : $attributes.hashCode());
      Object $shippingTemplateId = this.getShippingTemplateId();
      result = result * 59 + ($shippingTemplateId == null ? 43 : $shippingTemplateId.hashCode());
      Object $variantIds = this.getVariantIds();
      result = result * 59 + ($variantIds == null ? 43 : $variantIds.hashCode());
      Object $video = this.getVideo();
      result = result * 59 + ($video == null ? 43 : $video.hashCode());
      Object $articleNo = this.getArticleNo();
      result = result * 59 + ($articleNo == null ? 43 : $articleNo.hashCode());
      Object $transparentImage = this.getTransparentImage();
      result = result * 59 + ($transparentImage == null ? 43 : $transparentImage.hashCode());
      return result;
   }

   public String toString() {
      return "FlsUpdateItemRequest(id=" + this.getId() + ", updatedFields=" + this.getUpdatedFields() + ", name=" + this.getName() + ", ename=" + this.getEname() + ", brandId=" + this.getBrandId() + ", categoryId=" + this.getCategoryId() + ", attributes=" + this.getAttributes() + ", shippingTemplateId=" + this.getShippingTemplateId() + ", shippingGrossWeight=" + this.getShippingGrossWeight() + ", variantIds=" + this.getVariantIds() + ", video=" + this.getVideo() + ", articleNo=" + this.getArticleNo() + ", transparentImage=" + this.getTransparentImage() + ", isChannel=" + this.getIsChannel() + ", deliveryMode=" + this.getDeliveryMode() + ")";
   }

   public static class ItemAttribute {
      private String propertyId;
      private String name;
      private String value;
      private String valueId;
      private List<AttributeValue> valueList = new ArrayList();

      public String getPropertyId() {
         return this.propertyId;
      }

      public String getName() {
         return this.name;
      }

      public String getValue() {
         return this.value;
      }

      public String getValueId() {
         return this.valueId;
      }

      public List<AttributeValue> getValueList() {
         return this.valueList;
      }

      public void setPropertyId(String propertyId) {
         this.propertyId = propertyId;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setValue(String value) {
         this.value = value;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public void setValueList(List<AttributeValue> valueList) {
         this.valueList = valueList;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ItemAttribute)) {
            return false;
         } else {
            ItemAttribute other = (ItemAttribute)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$propertyId = this.getPropertyId();
               Object other$propertyId = other.getPropertyId();
               if (this$propertyId == null) {
                  if (other$propertyId != null) {
                     return false;
                  }
               } else if (!this$propertyId.equals(other$propertyId)) {
                  return false;
               }

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$value = this.getValue();
               Object other$value = other.getValue();
               if (this$value == null) {
                  if (other$value != null) {
                     return false;
                  }
               } else if (!this$value.equals(other$value)) {
                  return false;
               }

               Object this$valueId = this.getValueId();
               Object other$valueId = other.getValueId();
               if (this$valueId == null) {
                  if (other$valueId != null) {
                     return false;
                  }
               } else if (!this$valueId.equals(other$valueId)) {
                  return false;
               }

               Object this$valueList = this.getValueList();
               Object other$valueList = other.getValueList();
               if (this$valueList == null) {
                  if (other$valueList != null) {
                     return false;
                  }
               } else if (!this$valueList.equals(other$valueList)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ItemAttribute;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $propertyId = this.getPropertyId();
         result = result * 59 + ($propertyId == null ? 43 : $propertyId.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $valueList = this.getValueList();
         result = result * 59 + ($valueList == null ? 43 : $valueList.hashCode());
         return result;
      }

      public String toString() {
         return "FlsUpdateItemRequest.ItemAttribute(propertyId=" + this.getPropertyId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ", valueList=" + this.getValueList() + ")";
      }
   }

   public static class AttributeValue {
      private String valueId;
      private String value;

      public String getValueId() {
         return this.valueId;
      }

      public String getValue() {
         return this.value;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public void setValue(String value) {
         this.value = value;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AttributeValue)) {
            return false;
         } else {
            AttributeValue other = (AttributeValue)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$valueId = this.getValueId();
               Object other$valueId = other.getValueId();
               if (this$valueId == null) {
                  if (other$valueId != null) {
                     return false;
                  }
               } else if (!this$valueId.equals(other$valueId)) {
                  return false;
               }

               Object this$value = this.getValue();
               Object other$value = other.getValue();
               if (this$value == null) {
                  if (other$value != null) {
                     return false;
                  }
               } else if (!this$value.equals(other$value)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AttributeValue;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         return result;
      }

      public String toString() {
         return "FlsUpdateItemRequest.AttributeValue(valueId=" + this.getValueId() + ", value=" + this.getValue() + ")";
      }
   }
}
